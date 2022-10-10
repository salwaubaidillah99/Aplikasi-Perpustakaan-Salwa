package com.perpustakaan.perpustakaansalwa.service.Impl;

import com.perpustakaan.perpustakaansalwa.entity.Buku;
import com.perpustakaan.perpustakaansalwa.entity.Penerbit;
import com.perpustakaan.perpustakaansalwa.entity.Pengarang;
import com.perpustakaan.perpustakaansalwa.entity.dto.BukuDTO;
import com.perpustakaan.perpustakaansalwa.entity.mapping.BukuMapping;
import com.perpustakaan.perpustakaansalwa.entity.mapping.PenerbitMapping;
import com.perpustakaan.perpustakaansalwa.entity.mapping.PengarangMapping;
import com.perpustakaan.perpustakaansalwa.repository.BukuRepository;
import com.perpustakaan.perpustakaansalwa.repository.PenerbitRepository;
import com.perpustakaan.perpustakaansalwa.repository.PengarangRepository;
import com.perpustakaan.perpustakaansalwa.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class BukuServiceImpl implements BukuService {

    @Autowired
    private BukuRepository repository;

    @Autowired
    private PengarangRepository pengarangRepository;

    @Autowired
    private PenerbitRepository penerbitRepository;

    @Transactional
    @Override
    public BukuDTO save(BukuDTO param) {
        Penerbit penerbit = PenerbitMapping.instance.toEntity(param.getPenerbit());
        Pengarang pengarang = PengarangMapping.instance.toEntity(param.getPengarang());
        Buku data = BukuMapping.instance.toEntity(param);

        if (param.getPenerbit() != null && param.getPengarang() != null) {
            penerbit = penerbitRepository.save(penerbit);
            pengarang = pengarangRepository.save(pengarang);

            data.getPengarang().setId(pengarang.getId());
            data.getPenerbit().setId(penerbit.getId());
        }

        data = repository.save(data);

        return BukuMapping.instance.toDto(data);
    }

    @Transactional
    public List<BukuDTO> findAllData()
    {
        return BukuMapping.instance.toListDto(repository.findAll());

    }
    @Transactional
    @Override
    public BukuDTO update(BukuDTO param, Long id) {
        Buku data = repository.findById(id).orElse(null);

        if (data != null){
            data.setJudulBuku(param.getJudulBuku()== null ? data.getJudulBuku() : param.getJudulBuku());
            data.setTahunTerbit(param.getTahunTerbit() != null ? param.getTahunTerbit() : data.getTahunTerbit());
            data.setJumlah(param.getJumlah() != null ? param.getJumlah() : data.getJumlah());
            data.setIsbn(param.getIsbn() != null ? param.getIsbn() : data.getIsbn());

            return  BukuMapping.instance.toDto(repository.save(data));
        }
        return BukuMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Buku data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public BukuDTO findById(Long id) {
        return BukuMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
package com.perpustakaan.perpustakaansalwa.service.Impl;

import com.perpustakaan.perpustakaansalwa.entity.Anggota;
import com.perpustakaan.perpustakaansalwa.entity.Peminjaman;
import com.perpustakaan.perpustakaansalwa.entity.dto.PeminjamanDTO;
import com.perpustakaan.perpustakaansalwa.entity.mapping.AnggotaMapping;
import com.perpustakaan.perpustakaansalwa.entity.mapping.PeminjamanMapping;
import com.perpustakaan.perpustakaansalwa.repository.AnggotaRepository;
import com.perpustakaan.perpustakaansalwa.repository.PeminjamanRepository;
import com.perpustakaan.perpustakaansalwa.repository.PetugasRepository;
import com.perpustakaan.perpustakaansalwa.service.PeminjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class PeminjamanServiceImpl implements PeminjamanService {

    @Autowired
    private PeminjamanRepository repository;

    @Autowired
    private AnggotaRepository anggotaRepository;

    @Autowired
    private PetugasRepository petugasRepository;


    @Transactional
    @Override
    public PeminjamanDTO save(PeminjamanDTO param) {
        Anggota anggota = AnggotaMapping.instance.toEntity(param.getAnggota());

        Peminjaman data = PeminjamanMapping.instance.toEntity(param);

        if (param.getAnggota() != null) {
            anggota = anggotaRepository.save(anggota);

            data.getAnggota().setId(anggota.getId());
        }

        data = repository.save(data);

        return PeminjamanMapping.instance.toDto(data);
    }

    @Transactional
    public List<PeminjamanDTO> findAllData()
    {
        return PeminjamanMapping.instance.toListDto(repository.findAll());

    }
    @Transactional
    @Override
    public PeminjamanDTO update(PeminjamanDTO param, Long id) {
        Peminjaman data = repository.findById(id).orElse(null);

        if (data != null){
            data.setTglPinjam(param.getTglPinjam()== null ? data.getTglPinjam() : param.getTglPinjam());
            data.setTglkembali(param.getTglkembali() != null ? param.getTglkembali() : data.getTglkembali());

            return  PeminjamanMapping.instance.toDto(repository.save(data));
        }
        return PeminjamanMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Peminjaman data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PeminjamanDTO findById(Long id) {
        return PeminjamanMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
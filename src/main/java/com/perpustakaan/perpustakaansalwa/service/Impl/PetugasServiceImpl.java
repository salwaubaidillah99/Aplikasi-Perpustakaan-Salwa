package com.perpustakaan.perpustakaansalwa.service.Impl;

import com.perpustakaan.perpustakaansalwa.entity.Petugas;
import com.perpustakaan.perpustakaansalwa.entity.User;
import com.perpustakaan.perpustakaansalwa.entity.dto.PetugasDTO;
import com.perpustakaan.perpustakaansalwa.entity.mapping.PetugasMapping;
import com.perpustakaan.perpustakaansalwa.entity.mapping.UserMapping;
import com.perpustakaan.perpustakaansalwa.repository.PetugasRepository;
import com.perpustakaan.perpustakaansalwa.repository.UserRepository;
import com.perpustakaan.perpustakaansalwa.service.PetugasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PetugasServiceImpl implements PetugasService {

    @Autowired
    private PetugasRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public PetugasDTO save(PetugasDTO param) {
        User user = UserMapping.instance.toEntity(param.getUser());

        Petugas data = PetugasMapping.instance.toEntity(param);

        if (param.getUser() != null) {
            user = userRepository.save(user);

            data.getUser().setId_user(user.getId_user());
        }

        data = repository.save(data);

        return PetugasMapping.instance.toDto(data);
    }

    public List<PetugasDTO> findAllData()
    {
        return PetugasMapping.instance.toListDto(repository.findAll());

    }
    @Override
    public PetugasDTO update(PetugasDTO param, Long id) {
        Petugas data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNamaPetugas(param.getNamaPetugas()== null ? data.getNamaPetugas() : param.getNamaPetugas());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());
            data.setNoTelp(param.getNoTelp() != null ? param.getNoTelp() : data.getNoTelp());

            return  PetugasMapping.instance.toDto(repository.save(data));
        }
        return PetugasMapping.instance.toDto(data);

    }
    @Override
    public Boolean delete(Long id) {
        Petugas data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PetugasDTO findById(Long id) {
        return PetugasMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
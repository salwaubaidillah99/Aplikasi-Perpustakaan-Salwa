package com.perpustakaan.perpustakaansalwa.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnggotaDTO {
    private Long id;

    private String namaAnggota;

    private String jenisKelamin;

    private String alamat;

    private String noTelp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserDTO user;

}
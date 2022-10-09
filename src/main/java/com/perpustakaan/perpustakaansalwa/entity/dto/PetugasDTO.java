package com.perpustakaan.perpustakaansalwa.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetugasDTO {
    private Long id;

    private String namaPetugas;

    private String alamat;

    private String noTelp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserDTO user;
    
}
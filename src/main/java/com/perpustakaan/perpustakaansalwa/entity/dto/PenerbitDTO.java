package com.perpustakaan.perpustakaansalwa.entity.dto;

import com.perpustakaan.perpustakaansalwa.entity.mapping.PenerbitMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PenerbitDTO {
    public static PenerbitMapping instance;
    private Long id;

    private String namaPenerbit;

    private String alamat;

    private String noTelp;

}


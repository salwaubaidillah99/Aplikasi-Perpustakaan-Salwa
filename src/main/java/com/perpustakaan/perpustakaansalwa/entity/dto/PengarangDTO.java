package com.perpustakaan.perpustakaansalwa.entity.dto;

import com.perpustakaan.perpustakaansalwa.entity.mapping.PengarangMapping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PengarangDTO {
    public static PengarangMapping instance;
    private Long id;

    private String namaPengarang;

    private String alamat;

    private String noTelp;
}


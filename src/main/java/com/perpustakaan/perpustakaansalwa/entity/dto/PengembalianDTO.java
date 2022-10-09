package com.perpustakaan.perpustakaansalwa.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.perpustakaan.perpustakaansalwa.entity.mapping.PengembalianMapping;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PengembalianDTO {
    public static PengembalianMapping instance;
    private Long id;

    private Date tglPengembalian;

    private Double denda;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PeminjamanDTO peminjaman;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AnggotaDTO anggota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PetugasDTO petugas;

}

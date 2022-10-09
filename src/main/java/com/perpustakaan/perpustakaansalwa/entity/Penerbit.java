package com.perpustakaan.perpustakaansalwa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "penerbit")
@Getter
@Setter
@NoArgsConstructor
public class Penerbit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String namaPenerbit;

    @Column(columnDefinition = "VARCHAR(255)")
    private String alamat;

    @Column(columnDefinition = "VARCHAR(20)")
    private String noTelp;

    @OneToMany(mappedBy = "penerbit")
    private List<Buku> bukuList;
}
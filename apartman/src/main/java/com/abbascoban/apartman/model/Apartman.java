package com.abbascoban.apartman.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "apartman")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Apartman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "katSayisi")
    private int katSayisi;

    @Column(name = "yas")
    private int yas;


}

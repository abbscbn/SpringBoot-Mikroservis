package com.abbascoban.daireapp.model.Dto.Respose;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DaireResponseDto {

    private Long id;


    private int daireNo;


    private int odaSayisi;
}

package com.abbascoban.daireapp.model.Dto.Request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DaireRequestDto {

    private Long id;


    private int daireNo;


    private int odaSayisi;
}

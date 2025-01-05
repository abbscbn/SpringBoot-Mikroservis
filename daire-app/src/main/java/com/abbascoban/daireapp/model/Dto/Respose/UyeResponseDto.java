package com.abbascoban.daireapp.model.Dto.Respose;

import com.abbascoban.daireapp.model.Daire;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UyeResponseDto {

    private String firstName;


    private String lastName;


    private int age;


    private Date created;


    private DaireResponseDto daire;
}

package com.abbascoban.daireapp.model.Dto.Request;

import com.abbascoban.daireapp.model.Daire;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UyeRequestDto {


    private String firstName;


    private String lastName;


    private int age;


    private Long daireId;

}

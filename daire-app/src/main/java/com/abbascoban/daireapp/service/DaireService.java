package com.abbascoban.daireapp.service;


import com.abbascoban.daireapp.manager.ApartmanManager;
import com.abbascoban.daireapp.model.Daire;
import com.abbascoban.daireapp.model.Dto.Request.DaireRequestDto;
import com.abbascoban.daireapp.model.Dto.Respose.DaireResponseDto;
import com.abbascoban.daireapp.repository.DaireRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DaireService {

    @Autowired
    private DaireRepository daireRepository;



    public DaireResponseDto saveDaire(DaireRequestDto daireRequestDto) {
        Daire savedDaire = daireRepository.save(Daire.builder().
                daireNo(daireRequestDto.getDaireNo()).
                odaSayisi(daireRequestDto.getOdaSayisi())
                .build());
        DaireResponseDto daireResponseDto = new DaireResponseDto();
        BeanUtils.copyProperties(savedDaire, daireResponseDto);
        return daireResponseDto;
    }

    public List<DaireResponseDto> getAllDaire() throws Exception {
        List<DaireResponseDto> daireResponseDtoList = new ArrayList<>();
        List<Daire> DaireList = daireRepository.findAll();

        if(DaireList.isEmpty()){
            throw new Exception("Daire Kayıdı bulunmamaktadır.");
        }
        for (Daire daire : DaireList) {
            DaireResponseDto daireResponseDto = new DaireResponseDto();
            BeanUtils.copyProperties(daire, daireResponseDto);
            daireResponseDtoList.add(daireResponseDto);

        }
        return daireResponseDtoList;

    }
}

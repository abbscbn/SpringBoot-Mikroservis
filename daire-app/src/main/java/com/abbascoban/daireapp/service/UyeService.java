package com.abbascoban.daireapp.service;

import com.abbascoban.daireapp.manager.ApartmanManager;
import com.abbascoban.daireapp.model.Apartman;
import com.abbascoban.daireapp.model.Daire;
import com.abbascoban.daireapp.model.Dto.Request.UyeRequestDto;
import com.abbascoban.daireapp.model.Dto.Respose.DaireResponseDto;
import com.abbascoban.daireapp.model.Dto.Respose.UyeResponseDto;
import com.abbascoban.daireapp.model.Uye;
import com.abbascoban.daireapp.repository.DaireRepository;
import com.abbascoban.daireapp.repository.UyeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UyeService {

    @Autowired
    private UyeRepository uyeRepository;
    @Autowired
    private DaireRepository daireRepository;
    @Autowired
    private ApartmanManager apartmanManager;

    @Transactional(rollbackOn = Exception.class)
    public UyeResponseDto saveUye(UyeRequestDto uyeRequestDto) throws Exception {

        DaireResponseDto daireResponseDto = new DaireResponseDto();
        UyeResponseDto uyeResponseDto = new UyeResponseDto();

        Optional<Daire> OptDaire = daireRepository.findById(uyeRequestDto.getDaireId());
        if(OptDaire.isEmpty()) {
            throw new Exception("Daire bulunamadı");
        }


        Uye savedUye = uyeRepository.save(Uye.builder().
                daire(OptDaire.get()).
                age(uyeRequestDto.getAge()).
                created(new Date()).
                firstName(uyeRequestDto.getFirstName()).
                lastName(uyeRequestDto.getLastName())
                .build());
        Apartman apartman=new Apartman();
        apartman.setName("Rüya Apartman");
        apartman.setKatSayisi(5);
        apartman.setYas(35);

        boolean geriDonus=apartmanManager.addApartman(apartman);

        if (!geriDonus) {
            throw new Exception("Apartman servisine veri eklenemedi");
        }

        BeanUtils.copyProperties(savedUye, uyeResponseDto);
        BeanUtils.copyProperties(savedUye.getDaire(),daireResponseDto);

        uyeResponseDto.setDaire(daireResponseDto);

        return uyeResponseDto;




   /*    Uye uye = new Uye();
        uye.setCreated(new Date());
        uye.setDaire(OptDaire.get());
        BeanUtils.copyProperties(uyeRequestDto, uye);
        Uye savedUye = uyeRepository.save(uye);
        UyeResponseDto uyeResponseDto = new UyeResponseDto();

        BeanUtils.copyProperties(savedUye, uyeResponseDto);
        BeanUtils.copyProperties(savedUye.getDaire(), daireResponseDto);

        uyeResponseDto.setDaire(daireResponseDto);



        return uyeResponseDto;


    */

    }

    public List<UyeResponseDto> getAllUye() {
        List<Uye> UyeList = uyeRepository.findAll();
        List<UyeResponseDto> uyeResponseDtoList = new ArrayList<>();
        for (Uye uye : UyeList) {

            UyeResponseDto uyeResponseDto = new UyeResponseDto();
            DaireResponseDto daireResponseDto = new DaireResponseDto();

            BeanUtils.copyProperties(uye, uyeResponseDto);
            BeanUtils.copyProperties(uye.getDaire(),daireResponseDto);
            uyeResponseDto.setDaire(daireResponseDto);

            uyeResponseDtoList.add(uyeResponseDto);

        }
        return uyeResponseDtoList;
    }
}

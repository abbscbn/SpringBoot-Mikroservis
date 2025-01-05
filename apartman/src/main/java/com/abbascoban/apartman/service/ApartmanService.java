package com.abbascoban.apartman.service;

import com.abbascoban.apartman.model.Apartman;
import com.abbascoban.apartman.repository.ApartmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmanService {

    @Autowired
    private ApartmanRepository apartmanRepository;

    public boolean addApartman(Apartman apartman) {
        try {
            apartmanRepository.save(apartman);
            return true;
        }
        catch (Exception e) {
           return false;
        }

    }

}

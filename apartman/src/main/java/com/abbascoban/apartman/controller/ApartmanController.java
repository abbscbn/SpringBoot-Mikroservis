package com.abbascoban.apartman.controller;

import com.abbascoban.apartman.model.Apartman;
import com.abbascoban.apartman.service.ApartmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api/apartman")
public class ApartmanController {

    @Autowired
    private ApartmanService apartmanService;

    @PostMapping("/save")
    public boolean addApartman(@RequestBody Apartman apartman) {
        return apartmanService.addApartman(apartman);
    }

}

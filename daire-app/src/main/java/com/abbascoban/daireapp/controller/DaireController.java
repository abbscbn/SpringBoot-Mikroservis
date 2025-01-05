package com.abbascoban.daireapp.controller;

import com.abbascoban.daireapp.model.Dto.Request.DaireRequestDto;
import com.abbascoban.daireapp.model.Dto.Respose.DaireResponseDto;
import com.abbascoban.daireapp.service.DaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/daire")
public class DaireController {

    @Autowired
    private DaireService daireService;

    @PostMapping("/save")
    public ResponseEntity<DaireResponseDto> saveDaire(@RequestBody DaireRequestDto daireRequestDto) {
        return ResponseEntity.ok(daireService.saveDaire(daireRequestDto));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<DaireResponseDto>> getAllDaire() throws Exception {
        return ResponseEntity.ok(daireService.getAllDaire());
    }

}

package com.abbascoban.daireapp.controller;


import com.abbascoban.daireapp.model.Dto.Request.UyeRequestDto;
import com.abbascoban.daireapp.model.Dto.Respose.UyeResponseDto;
import com.abbascoban.daireapp.service.DaireService;
import com.abbascoban.daireapp.service.UyeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/uye")
public class UyeController {

    @Autowired
    private UyeService uyeService;



    @PostMapping("/save")
    public ResponseEntity<UyeResponseDto> saveUye(@RequestBody UyeRequestDto uyeRequestDto) throws Exception {


        return ResponseEntity.ok(uyeService.saveUye(uyeRequestDto));

}

    @GetMapping("/getall")
    public ResponseEntity<List<UyeResponseDto>> getAllUye() throws Exception {
        return ResponseEntity.ok(uyeService.getAllUye());
    }

}

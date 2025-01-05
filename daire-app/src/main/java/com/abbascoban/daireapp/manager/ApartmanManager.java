package com.abbascoban.daireapp.manager;

import com.abbascoban.daireapp.model.Apartman;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:8081/rest/api/apartman",name = "apartman")
public interface ApartmanManager {

    @PostMapping("/save")
    public boolean addApartman(@RequestBody Apartman apartman);

}

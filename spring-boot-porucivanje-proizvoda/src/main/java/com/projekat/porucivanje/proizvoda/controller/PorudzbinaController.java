package com.projekat.porucivanje.proizvoda.controller;

import com.projekat.porucivanje.proizvoda.VO.ResponseTemplateVO;
import com.projekat.porucivanje.proizvoda.entity.Porudzbina;
import com.projekat.porucivanje.proizvoda.service.PorudzbinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/porudzbina")

public class PorudzbinaController {

    @Autowired
    PorudzbinaService porudzbinaService;

    @PostMapping("/")
    public Porudzbina napraviPorudzbinu(@RequestBody Porudzbina porudzbina) {
        return porudzbinaService.napraviPorudzbinu(porudzbina);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO prikazPorudzbine(@PathVariable ("id") int idKorisnika){
        return porudzbinaService.prikazDetaljnePorudzbine(idKorisnika);
    }
}

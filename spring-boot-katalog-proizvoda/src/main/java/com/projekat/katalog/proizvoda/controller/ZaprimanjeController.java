package com.projekat.katalog.proizvoda.controller;

import com.projekat.katalog.proizvoda.dto.ProizvodPoSkladistu;
import com.projekat.katalog.proizvoda.dto.ZahtevZaZaprimanjeProizvoda;
import com.projekat.katalog.proizvoda.entity.Skladiste;
import com.projekat.katalog.proizvoda.repository.ProizvodRepository;
import com.projekat.katalog.proizvoda.repository.SkladisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/katalogproizvoda")
public class ZaprimanjeController {

    @Autowired
    private SkladisteRepository skladisteRepository;

    @Autowired
    private ProizvodRepository proizvodRepository;

    @PostMapping("/zaprimiproizvoduskladiste")
    public Skladiste zaprimanje(@RequestBody ZahtevZaZaprimanjeProizvoda zahtev){
        return skladisteRepository.save(zahtev.getSkladiste());
    }

    @GetMapping("/prikazisve")
    public List<Skladiste> nadjiSve(){
        return skladisteRepository.findAll();
    }

    @GetMapping("/prikaziproizvodeposkladistu")
    public List<ProizvodPoSkladistu> nadjiProizvodeUSkladistu(){
        return skladisteRepository.prikaziProizvodeUSkladistu();
    }
}

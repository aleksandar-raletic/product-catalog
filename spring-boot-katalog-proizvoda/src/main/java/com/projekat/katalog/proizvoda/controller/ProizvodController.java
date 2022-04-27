package com.projekat.katalog.proizvoda.controller;

import com.projekat.katalog.proizvoda.entity.Proizvod;
import com.projekat.katalog.proizvoda.service.ProizvodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/katalogproizvoda")

public class ProizvodController {

    @Autowired
    private ProizvodService proizvodService;

    //post metod
    @PostMapping("/dodajproizvod")
    public Proizvod dodajProizvod(@RequestBody Proizvod proizvod){
        return proizvodService.sacuvajProizvod(proizvod);
    }

    //get metod
    @GetMapping("/proizvodi")
    public List<Proizvod> traziSveProizvode(){
        return proizvodService.nadjiSveProizvode();
    }

    //get metod
    @GetMapping("/proizvodpoidu/{id}")
    public Proizvod traziProizvodPoIdu(@PathVariable ("id") int idProizvoda) {
        return proizvodService.nadjiProizvodPoIdu(idProizvoda);
    }

    //get metod
    @GetMapping("/proizvodponazivu/{ime}")
    public Proizvod traziProzivodPoNazivu(@PathVariable String ime){
        return proizvodService.nadjiProizvodPoNazivu(ime);
    }

    //delete metod
    @DeleteMapping("/obrisiproizvod/{id}")
    public String ukloniProizvod(@PathVariable ("id") int idProizvoda){
        return proizvodService.obrisiProizvod(idProizvoda);
    }

    //put metod
    @PutMapping("/promeniproizvod")
    public Proizvod promeniProizvod(@RequestBody Proizvod proizvod){
        return proizvodService.izmeniProizvod(proizvod);
    }
}

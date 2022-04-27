package com.projekat.katalog.proizvoda.service;

import com.projekat.katalog.proizvoda.entity.Proizvod;
import com.projekat.katalog.proizvoda.repository.ProizvodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProizvodService {

    @Autowired
    private ProizvodRepository proizvodRepository;

    //post metod
    public Proizvod sacuvajProizvod(Proizvod proizvod){
        return proizvodRepository.save(proizvod);
    }

    //get metod
    public List<Proizvod> nadjiSveProizvode(){
        return proizvodRepository.findAll();
    }

    //get metod
    public Proizvod nadjiProizvodPoIdu(int idProizvoda){
        return proizvodRepository.findById(idProizvoda).orElse(null);
    }

    //get metod
    public Proizvod nadjiProizvodPoNazivu(String nazivProizvoda){
        return proizvodRepository.findBynazivProizvoda(nazivProizvoda);
    }

    //delete metod
    public String obrisiProizvod(int idProizvoda){
        proizvodRepository.deleteById(idProizvoda);
        return "Obrisan je proizvod koji ima id: " + idProizvoda;
    }

    //put metod
    public Proizvod izmeniProizvod (Proizvod proizvod){
        //ovo pisemo u put request-u u okviru id-a jer ne kreiramo novi objekat vec menjamo postojeci
        Proizvod postojeciProizvod = proizvodRepository.findById(proizvod.getIdProizvoda()).orElse(null);

        postojeciProizvod.setNazivProizvoda(proizvod.getNazivProizvoda());
        postojeciProizvod.setCena(proizvod.getCena());
        postojeciProizvod.setKolicina(proizvod.getKolicina());
        postojeciProizvod.setId_skladista_FK(proizvod.getId_skladista_FK());

        return proizvodRepository.save(postojeciProizvod);
    }
}

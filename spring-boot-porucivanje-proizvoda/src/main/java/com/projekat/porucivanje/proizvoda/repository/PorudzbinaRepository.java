package com.projekat.porucivanje.proizvoda.repository;

import com.projekat.porucivanje.proizvoda.entity.Porudzbina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorudzbinaRepository extends JpaRepository<Porudzbina, Integer> {

    Porudzbina findByidKorisnika(int idKorisnika);
}

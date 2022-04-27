package com.projekat.katalog.proizvoda.repository;

import com.projekat.katalog.proizvoda.dto.ProizvodPoSkladistu;
import com.projekat.katalog.proizvoda.entity.Skladiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkladisteRepository extends JpaRepository <Skladiste, Integer>{

    @Query("SELECT new com.projekat.katalog.proizvoda.dto.ProizvodPoSkladistu(s.nazivSkladista , p.nazivProizvoda) FROM Skladiste s JOIN s.proizvodi p")
    public List<ProizvodPoSkladistu> prikaziProizvodeUSkladistu();
}

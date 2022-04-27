package com.projekat.katalog.proizvoda.repository;

import com.projekat.katalog.proizvoda.entity.Proizvod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodRepository extends JpaRepository <Proizvod, Integer>{

    Proizvod findBynazivProizvoda(String nazivProizvoda);
}

package com.projekat.katalog.proizvoda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proizvod_tbl")

public class Proizvod {

    @Id
    private int idProizvoda;
    private String nazivProizvoda;
    private int kolicina;
    private double cena;
    private int id_skladista_FK;
}

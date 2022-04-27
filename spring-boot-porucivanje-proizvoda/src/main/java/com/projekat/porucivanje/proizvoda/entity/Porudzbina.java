package com.projekat.porucivanje.proizvoda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "porudzbina_tbl")
public class Porudzbina {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idKorisnika;
    private String imeKorisnika;
    private String prezimeKorisnika;
    private String adresaKorisnika;
    private int idProizvoda;
}

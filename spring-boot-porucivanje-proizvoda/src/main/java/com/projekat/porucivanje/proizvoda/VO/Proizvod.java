package com.projekat.porucivanje.proizvoda.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Proizvod {

    private Long idProizvoda;
    private String nazivProizvoda;
    private int kolicina;
    private double cena;
}

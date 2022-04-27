package com.projekat.katalog.proizvoda.dto;

import com.projekat.katalog.proizvoda.entity.Skladiste;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ZahtevZaZaprimanjeProizvoda {

    private Skladiste skladiste;

}

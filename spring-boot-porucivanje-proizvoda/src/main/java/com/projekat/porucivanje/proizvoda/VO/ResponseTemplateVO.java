package com.projekat.porucivanje.proizvoda.VO;

import com.projekat.porucivanje.proizvoda.entity.Porudzbina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    Porudzbina porudzbina;
    Proizvod proizvod;
}

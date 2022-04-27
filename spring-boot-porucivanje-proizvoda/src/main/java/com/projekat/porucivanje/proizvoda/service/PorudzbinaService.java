package com.projekat.porucivanje.proizvoda.service;

import com.projekat.porucivanje.proizvoda.VO.Proizvod;
import com.projekat.porucivanje.proizvoda.VO.ResponseTemplateVO;
import com.projekat.porucivanje.proizvoda.entity.Porudzbina;
import com.projekat.porucivanje.proizvoda.repository.PorudzbinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class PorudzbinaService {
    @Autowired
    PorudzbinaRepository porudzbinaRepository;

    public Porudzbina napraviPorudzbinu(@RequestBody Porudzbina porudzbina){
        return porudzbinaRepository.save(porudzbina);
    }

    @Autowired
    private RestTemplate restTemplate;
    
    public ResponseTemplateVO prikazDetaljnePorudzbine(int idKorisnika){
        ResponseTemplateVO vo = new ResponseTemplateVO();

        Porudzbina porudzbina = porudzbinaRepository.findByidKorisnika(idKorisnika);
        Proizvod proizvod = restTemplate.getForObject("http://KATALOG-PROIZVODA/katalogproizvoda/proizvodpoidu/" + porudzbina.getIdProizvoda(), Proizvod.class);
//     *   "http://localhost:8500/katalogproizvoda/proizvodpoidu/"
//        ZA EUREKU
//        "http://KATALOG-PROIZVODA/katalogproizvoda/proizvodpoidu/"

        vo.setPorudzbina(porudzbina);
        vo.setProizvod(proizvod);

        return  vo;
    }
}

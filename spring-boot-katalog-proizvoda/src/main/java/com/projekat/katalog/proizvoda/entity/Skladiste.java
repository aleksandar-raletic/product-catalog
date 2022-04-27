package com.projekat.katalog.proizvoda.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skladiste_tbl")

public class Skladiste {

    @Id
    @GeneratedValue
    private int idSkladista;
    private String nazivSkladista;
    private String adresaSkladista;

    @OneToMany(targetEntity = Proizvod.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_skladista_FK", referencedColumnName = "idSkladista")
    @JsonIgnoreProperties("id_skladista_FK")
    private List<Proizvod> proizvodi;
}

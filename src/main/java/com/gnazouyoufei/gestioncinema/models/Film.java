package com.gnazouyoufei.gestioncinema.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String  titre;
    @Column(nullable = true)
    private double duree;
    @Column(nullable = false)
    private String description;
    @Column(length = 100, nullable = true)
    private String realisateur;
    @Column(length = 90, nullable = false)
    private String photo;
    @Column( nullable = true)
    private Date dateSortie;
    @OneToMany(mappedBy = "film")
    private Collection<Projection> projections;
    @ManyToOne
    private  Categorie categorie;
}

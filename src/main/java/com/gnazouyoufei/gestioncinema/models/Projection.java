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

public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date dateProjection;
    @Column(nullable = false)
    private double prix;
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private Film film;
    @ManyToOne
    private Sceance sceance;
    @OneToMany(mappedBy = "projection")
    private Collection<Ticket> tickets;

}

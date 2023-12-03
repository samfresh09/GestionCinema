package com.gnazouyoufei.gestioncinema.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 50,nullable = false)
    private String nomClient;
    @Column(nullable = false)
    private double prix;
    @Column(nullable = false)
    private int codePayement;
    @Column(nullable = false)
    private boolean reserve;
    @ManyToOne
    private Projection projection;
    @ManyToOne
    private Place place;

}

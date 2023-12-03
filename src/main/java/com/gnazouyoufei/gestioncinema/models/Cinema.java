package com.gnazouyoufei.gestioncinema.models;

import jakarta.persistence.ManyToOne;

public class Cinema {
    private Long id;
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    private int nbrSalle;
    @ManyToOne
    private Ville ville;
}

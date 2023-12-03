package com.gnazouyoufei.gestioncinema.Dao;

import com.gnazouyoufei.gestioncinema.models.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaDao extends JpaRepository<Cinema,Long> {
}

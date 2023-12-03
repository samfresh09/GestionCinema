package com.gnazouyoufei.gestioncinema.Dao;

import com.gnazouyoufei.gestioncinema.models.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDao extends JpaRepository<Ville,Long> {
}

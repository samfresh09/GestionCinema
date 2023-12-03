package com.gnazouyoufei.gestioncinema.Dao;

import com.gnazouyoufei.gestioncinema.models.Cinema;
import com.gnazouyoufei.gestioncinema.models.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectionDao extends JpaRepository<Projection,Long> {
}

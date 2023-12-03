package com.gnazouyoufei.gestioncinema.Dao;


import com.gnazouyoufei.gestioncinema.models.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleDao extends JpaRepository<Salle,Long> {
}

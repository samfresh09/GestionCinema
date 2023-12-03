package com.gnazouyoufei.gestioncinema.Dao;

import com.gnazouyoufei.gestioncinema.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie,Long> {
}

package com.gnazouyoufei.gestioncinema.Dao;

import com.gnazouyoufei.gestioncinema.models.Cinema;
import com.gnazouyoufei.gestioncinema.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDao extends JpaRepository<Ticket,Long> {
}

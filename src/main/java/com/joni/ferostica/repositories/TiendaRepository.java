package com.joni.ferostica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joni.ferostica.entities.Tienda;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda,Long>{

}

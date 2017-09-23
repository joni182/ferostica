package com.joni.ferostica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joni.ferostica.entities.TipoPrenda;

@Repository
public interface TipoPrendaRepository extends JpaRepository<TipoPrenda,Long> {

}

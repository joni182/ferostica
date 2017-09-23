package com.joni.ferostica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joni.ferostica.entities.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo,Long>{

}

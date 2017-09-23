package com.joni.ferostica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.joni.ferostica.entities.RegistroTiendaArticulo;


@Repository
public interface RegistroTiendaArticuloRepository extends JpaRepository<RegistroTiendaArticulo,Long>{

}

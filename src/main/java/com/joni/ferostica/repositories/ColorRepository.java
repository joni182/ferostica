package com.joni.ferostica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.joni.ferostica.entities.Color;


@Repository
public interface ColorRepository extends JpaRepository<Color,Long> {

}

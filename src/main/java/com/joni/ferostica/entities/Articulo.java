package com.joni.ferostica.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.joni.ferostica.entities.enumerations.Estado;
import com.joni.ferostica.entities.enumerations.Genero;


public class Articulo {

	private long id_aticulo;
	private double precio;
	private Genero genero;
	private Estado estado;
	private String observaciones;
	
	@ManyToOne
	private Color color;
}

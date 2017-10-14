package com.joni.ferostica.entities;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RegistroTiendaArticulo {

	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private Long id_registro;
	
	@ManyToOne
	private Tienda tienda;
	
	@ManyToOne
	private Articulo articulo;
	
	private Date fecha;

	public RegistroTiendaArticulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistroTiendaArticulo(long id_registro, Tienda tienda, Articulo articulo) {
		super();
		this.id_registro = id_registro;
		this.tienda = tienda;
		this.articulo = articulo;
		this.fecha = Calendar.getInstance().getTime();
	}

	public long getId_registro() {
		return id_registro;
	}

	public void setId_registro(long id_registro) {
		this.id_registro = id_registro;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	
}

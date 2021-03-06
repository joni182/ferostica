package com.joni.ferostica.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TipoPrenda {

	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private Long id_tipoPrenda;
	private String tipoPrenda;
	
	
	@OneToMany
	List<Articulo> articulos;

	public TipoPrenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoPrenda(Long id_tipoPrenda, String tipoPrenda, List<Articulo> articulos) {
		super();
		this.id_tipoPrenda = id_tipoPrenda;
		this.tipoPrenda = tipoPrenda;
		this.articulos = articulos;
	}

	public Long getId_tipoPrenda() {
		return id_tipoPrenda;
	}

	public void setId_tipoPrenda(Long id_tipoPrenda) {
		this.id_tipoPrenda = id_tipoPrenda;
	}

	public String getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	
}
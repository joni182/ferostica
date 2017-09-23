package com.joni.ferostica.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class TipoPrenda {

	private Long id_tipoPrenda;
	private String tipoPrenda;
	
	
	
	public TipoPrenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoPrenda(Long id_tipoPrenda, String tipoPrenda) {
		super();
		this.id_tipoPrenda = id_tipoPrenda;
		this.tipoPrenda = tipoPrenda;
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
	
	
}

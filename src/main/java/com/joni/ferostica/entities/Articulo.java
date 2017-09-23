package com.joni.ferostica.entities;

import com.joni.ferostica.entities.enumerations.Estado;
import com.joni.ferostica.entities.enumerations.Genero;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Articulo {

	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private long id_aticulo;
	private double precio;
	private Genero genero;
	private Estado estado;
	private String observaciones;
	private int tallaNumerica;
	private String tallaLetras;
	private int porcentaje;
	
	@ManyToOne
	private Color color;
	
	@ManyToOne
	private Tienda tienda;
	
	@ManyToOne
	private TipoPrenda tipoPrenda;

	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Articulo(long id_aticulo, double precio, Genero genero, Estado estado, String observaciones,
			int tallaNumerica, String tallaLetras, int porcentaje, Color color, Tienda tienda, TipoPrenda tipoPrenda) {
		super();
		this.id_aticulo = id_aticulo;
		this.precio = precio;
		this.genero = genero;
		this.estado = estado;
		this.observaciones = observaciones;
		this.tallaNumerica = tallaNumerica;
		this.tallaLetras = tallaLetras;
		this.porcentaje = porcentaje;
		this.color = color;
		this.tienda = tienda;
		this.tipoPrenda = tipoPrenda;
	}

	public long getId_aticulo() {
		return id_aticulo;
	}

	public void setId_aticulo(long id_aticulo) {
		this.id_aticulo = id_aticulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getTallaNumerica() {
		return tallaNumerica;
	}

	public void setTallaNumerica(int tallaNumerica) {
		this.tallaNumerica = tallaNumerica;
	}

	public String getTallaLetras() {
		return tallaLetras;
	}

	public void setTallaLetras(String tallaLetras) {
		this.tallaLetras = tallaLetras;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public TipoPrenda getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(TipoPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	
	
}

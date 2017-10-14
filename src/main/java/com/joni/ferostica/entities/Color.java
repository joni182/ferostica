package com.joni.ferostica.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_color;
	private String color;

	
	  @OneToMany 
	  List<Articulo> articulos;
	 
	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Color(long id_color, String color, List<Articulo> articulos) {
		super();
		this.id_color = id_color;
		this.color = color;
		this.articulos = articulos;
	}

	public long getId_color() {
		return id_color;
	}

	public void setId_color(long id_color) {
		this.id_color = id_color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	

}

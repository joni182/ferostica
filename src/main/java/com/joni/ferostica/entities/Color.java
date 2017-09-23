package com.joni.ferostica.entities;

public class Color {
	
	private long id_color;
	private String color;
	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Color(long id_color, String color) {
		super();
		this.id_color = id_color;
		this.color = color;
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
	
	
}

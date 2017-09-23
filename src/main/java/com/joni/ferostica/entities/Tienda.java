package com.joni.ferostica.entities;

public class Tienda {

	private long id_tienda;
	private String nombre;
	private int telefono;
	private String email;
	private String direccion;
	private String cif;
	
	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tienda(long id_tienda, String nombre, int telefono, String email, String direccion, String cif) {
		super();
		this.id_tienda = id_tienda;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.cif = cif;
	}

	public long getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(long id_tienda) {
		this.id_tienda = id_tienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
}
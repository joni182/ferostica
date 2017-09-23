package com.joni.ferostica.entities;

public class RegistroTiendaArticulo {

	private long id_registro;
	private long id_articulo;
	private long id_tienda;
	
	public RegistroTiendaArticulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistroTiendaArticulo(long id_registro, Articulo articulo, Tienda tienda) {
		super();
		this.id_registro = id_registro;
		this.id_articulo = extractId(articulo);
		this.id_tienda = extractId(tienda);
	}

	public long getId_registro() {
		return id_registro;
	}

	public void setId_registro(long id_registro) {
		this.id_registro = id_registro;
	}

	public long getId_articulo() {
		return id_articulo;
	}

	public void setId_articulo(int id_articulo) {
		this.id_articulo = id_articulo;
	}

	public long getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	
	private long extractId(Object unObjeto){
		if (unObjeto == null){
			new NullPointerException();
		}
		
		if ( unObjeto instanceof Articulo){
			// TODO aun no estan los accesores de articulo
			Articulo articulo = (Articulo)unObjeto;
			return 4; 
			
		}else if (unObjeto instanceof Tienda){
			Tienda tienda = (Tienda)unObjeto;
			return tienda.getId_tienda(); 
		}else {
			new IllegalArgumentException("El objeto recibido no es una instancia de tienda ni de artículo");
		}	
		return 0;
	}
	
}

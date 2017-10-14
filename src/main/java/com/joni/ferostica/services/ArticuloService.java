package com.joni.ferostica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisConfigurationCustomizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.joni.ferostica.entities.Articulo;
import com.joni.ferostica.repositories.ArticuloRepository;

@Service
@Configurable
public class ArticuloService {
	
	@Autowired
	private JpaRepository<Articulo,Long> articuloRepository;
	
	

	public ArticuloService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void guardar(Articulo articulo){

		System.out.println(articuloRepository);
		articuloRepository.save(articulo);
	}
	
	public Articulo modificar(Articulo articuloNuevo){
		// TODO  controlar todos los posibles atributos que no pueden ser nulos
		if (articuloNuevo == null ) new NullPointerException("ERROR: El articulo no puede ser nulo");
		else if (articuloNuevo.getId_aticulo()  == null || articuloNuevo.getId_aticulo().longValue() < 0){
			new NullPointerException("El id no puede ser nulo o negativo"+articuloNuevo.getId_aticulo());
		}
		/*
		Articulo articuloViejo = articuloRepository.findOne(articuloNuevo.getId_aticulo());
		
		if (articuloNuevo.getId_aticulo().equals(articuloViejo)) {
		} else {
			new IllegalStateException("ERROR: Los ids de los dos productos a modificar no coinciden");
		}
		*/
		return articuloRepository.save(articuloNuevo);
	}
	
	public List<Articulo> buscar(){
		return articuloRepository.findAll();
	}

	@Override
	public String toString() {
		return "ArticuloService [articuloRepository=" + articuloRepository + "]";
	}
	
	

}

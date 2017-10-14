package com.joni.ferostica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.joni.ferostica.entities.Articulo;
import com.joni.ferostica.entities.Color;
import com.joni.ferostica.entities.enumerations.Estado;
import com.joni.ferostica.entities.enumerations.Genero;
import com.joni.ferostica.entities.enumerations.TallaLetras;
import com.joni.ferostica.services.ArticuloService;


@SpringBootApplication
@EnableJpaRepositories
public class App {
	@Autowired
	static ArticuloService servicio = new ArticuloService();
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	
	
	
	Articulo articulo = new Articulo(null, 33, Genero.CHICA, Estado.VENDIDO, "Prueba", 45, TallaLetras.TALLAS[3], 33, null, null, null); 

	System.out.println(articulo);
	servicio.guardar(articulo);
	
	
	

	
	}
	
}

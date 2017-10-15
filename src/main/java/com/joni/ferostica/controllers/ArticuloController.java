package com.joni.ferostica.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joni.ferostica.entities.Articulo;
import com.joni.ferostica.services.ArticuloService;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	
	@Autowired
	private ArticuloService articuloService;
	
	@RequestMapping("")
	public List<Articulo> listArticulos(){
		
		return articuloService.buscar();
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public Articulo createArticulo(@RequestBody Articulo articulo){
		return articuloService.guardar(articulo);
	}
	
	

}

package com.joni.ferostica.entities.enumerations;

import java.util.concurrent.CancellationException;

public class TallasNumeros {

	private int [] tallas;
	
	public TallasNumeros(int tallaInicio, int tallaFinal){
		
		tallas = generarTallas(tallaInicio,tallaFinal);
	}
	
	private int[] generarTallas(int tallaInicio, int tallaFinal){
		
		// TODO No salta la escepcion por número impar
		if ( impar(tallaInicio) || impar(tallaFinal)){
			new IllegalArgumentException("error: las tallas numéricas deben de ser par");
		}else if ((tallaFinal - tallaInicio) <= 0){
			new IllegalArgumentException("error: Relacion entre talla inicial y talla final es incorrecta");
		}
		
		
		int cantidadTallas = ((tallaFinal - tallaInicio)/2) + 1;
		int [] tallas = new int[cantidadTallas];
		int contador = 0;
		
		for (int i = 0; i < cantidadTallas; i++) {
			tallas[i] = tallaInicio + contador;
			contador = contador + 2;
		}
		return tallas;
	}
	
	private boolean impar(int numero){
		
		if (numero/2 != 0){
			return true;
		}
		else return false;
	}
	
	
	
	public int[] getTallas() {
		return tallas;
	}

	private void setTallas(int[] tallas) {
		this.tallas = tallas;
	}

	public static void main(String[] args) {
		
		TallasNumeros tallas = new TallasNumeros(36,52);
		
		int [] tallasArray = tallas.getTallas();
		
		for (int i = 0; i < tallasArray.length; i++) {
			System.out.println(tallasArray[i]);
		}
	}
}

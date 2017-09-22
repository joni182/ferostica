package com.joni.ferostica.entities.enumerations;

public class TallaLetras {

	private String [] tallas;
	
	public TallaLetras(){
		tallas = generarTallas();
	}
	
	private String[] generarTallas() {
		
		String[] tallas = {"S","M","L","XL","2X","2X","2X"};
		return tallas;
	}

	public String[] getTallas() {
		return tallas;
	}

	private void setTallas(String[] tallas) {
		this.tallas = tallas;
	}
	
	
}

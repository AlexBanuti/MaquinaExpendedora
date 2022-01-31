package com.refrescos;


public class Refrescos {
	
	private String sabor = "";
	private double precio;
	
	public Refrescos(String sabor, double precio) {
			this.sabor = sabor;
			this.precio = precio;		
		
	}
	
	public String getSabor(){
		return sabor;
	}
	
	public double getPrecio() {
		return precio;
	}

}

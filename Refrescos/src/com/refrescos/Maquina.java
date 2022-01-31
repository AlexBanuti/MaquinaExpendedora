package com.refrescos;


public class Maquina {
	
	//Atributos
	private Refrescos[] refrescos;
	private int numRefrescos; 
	private double deposito = 90.00;
	
	//Constructores
	public Maquina() {
		super();
		refrescos = new Refrescos[10];
		numRefrescos = 0;
		
	}
	
	//Metodos
	public void addRefresco (String sabor, double precio) {
		int i = numRefrescos++;
		refrescos[i] = new Refrescos(sabor, precio);

	}
	
	public int getNumRefrescos(){
		return numRefrescos;
	}

	public Refrescos getRefrescos(int index) {
		return refrescos[index];
	}
	
	public void Comprar(String sabor, double dinerocliente) {
		int i = numRefrescos--;
		refrescos[i-1] = new Refrescos(sabor, dinerocliente);
		deposito = deposito + dinerocliente;
		
//		if (dinerocliente < getRefrescos(i).getPrecio()) {
//			
//			System.out.println("Cantidad insuficiente");
//				
//		}
		
		
	}
	public double getDeposito() {
		return deposito;
		
		
	}

	
}

package com.refrescos;

public class PruebasMaquina {

	public static void main(String[] args) {
		
		Maquina m1 = new Maquina();
		
		m1.addRefresco("CocaCola", 0.5);
		m1.addRefresco("Sprite", 0.60);
		m1.addRefresco("Fanta", 0.60);
		m1.addRefresco("Aquarius", 0.70);
		m1.addRefresco("Te", 0.60);
		m1.addRefresco("KAS", 0.60);
		m1.addRefresco("ColaCao", 0.40);
		m1.addRefresco("Pepsi", 0.50);
		m1.addRefresco("RedBull", 0.90);
		m1.addRefresco("Monster", 0.80);
		
		
		System.out.println(m1.getNumRefrescos());
		System.out.println(m1.getRefrescos(0).getSabor() +" "+ m1.getRefrescos(0).getPrecio()+"€");
		System.out.println(m1.getRefrescos(9).getSabor() +" "+ m1.getRefrescos(9).getPrecio()+"€"); 
		
		
		
	
		
		
		m1.Comprar("Sprite", 0.6);
		m1.Comprar("Cocacola", 0.4);
		System.out.println(m1.getNumRefrescos());
		System.out.println(m1.getDeposito() + "€");
		
//		for (int i = 0; i < m1.getNumRefrescos(); i++) {
//			
//			System.out.println(m1.getRefrescos(i).getSabor() + " " + m1.getRefrescos(i).getPrecio());
//		
//		}
	
	}

}

package com.ccs.entornos.depuracion;

/*
 * usar los mecanismos de depuracion adecuados para descubrir
 * la primera iteracion en que cont toma un valor mayor 50
 */
public class Contador {
	private int cont;
	
	public void contar(){
		for(int i=0;i<100;i++){
			cont+=i+1;
		}
	}
	
	public int getCont(){
		return cont;
	}
}

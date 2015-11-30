package com.ccs.entornos.depuracion;

import java.util.Random;

public class GeneradorBucles {
	private int x;
	private int y;
	public void bucle(){
		Random rnd=new Random();
		for(int i=0;i<10000;i++){
			x=rnd.nextInt();
			if(x>20000000)
				y=x;
		}
	}
}

package Unidade4;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		
		
		int numero;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o número");
		numero = teclado.nextInt();
		
		for(int i=numero; i>=1; i=i-1)
			System.out.println("Número=" +i);
		   	
	}

}

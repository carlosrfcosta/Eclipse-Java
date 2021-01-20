package Unidade4;

import java.util.Scanner;

public class MenoValor {

	public static void main(String[] args) {
		
		int valor, menor;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor Informar o valor");
		valor = teclado.nextInt();
		menor = valor;
		
		while(valor !=0)
		{
           if (valor < menor)
        	   menor = valor;
           System.out.println("Favor Informar o valor");
   		   valor = teclado.nextInt();
		}
           System.out.println("O menor valor é:" +menor);
		
		
	}
		
}

package Unidade4;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
            Scanner teclado = new Scanner(System.in);
            System.out.println("Favor Informar o valor");
            int valor = teclado.nextInt();
            
            
            int soma_valor = 0;
            int cont = 0;
            
            while(valor != -1)
            {  	
               soma_valor = soma_valor + valor;
               cont++;
               
               System.out.println("Favor informar o valor");
               valor = teclado.nextInt();
           	
            }
              System.out.println(" Media=" +soma_valor/cont);
	}  
            
}

package Unidade4;

import java.util.Scanner;

public class CadastraAluno {

	public static void main(String[] args) {
		String nome, endereco, telefone;
		int matricula, cont = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor Informar a Matricula");
		matricula = teclado.nextInt();
		
		
		while(matricula != 0)
		{	
		   System.out.println("Favor Infomar o nome");
		   nome = teclado.next();
		   System.out.println("Favor Informar o endereço");
		   endereco = teclado.next();
		   System.out.println(" Favor Informar o telefone");
		   telefone = teclado.next();
		   cont ++;
		   System.out.println("Favor Informar a Matricula do proximo aluno");
		   matricula = teclado.nextInt();
			   
		} 	
		
	}
	
}

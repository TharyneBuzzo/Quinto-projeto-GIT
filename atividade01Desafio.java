package estruturaCondicional;

import java.util.Scanner;

public class atividade01Desafio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1,nota2,nota3,nota4, media;
		
		System.out.println("Informe a primeira nota");
		nota1 = ler.nextInt();
		
		System.out.println("Informe a segunda nota");
		nota2 = ler.nextInt();
		
		System.out.println("Informe a terceira nota");
		nota3 = ler.nextInt();
		
		System.out.println("Informe a quarta nota");
		nota4 = ler.nextInt();
		
		media = (nota1 + nota2 + nota3+ nota4)/4;
		 
		System.out.println("a media do aluno é:  " + media);
		
		
		if (media >6) {
			
			System.out.println("o aluno está aprovado");
		
	}
			
		else if (media <3) {
			  System.out.println("o aluno esta reprovado");
			  
		}
		else{
			System.out.println ("o aluno esta reprovado");
		}
			  ler.close();
			

	}

}

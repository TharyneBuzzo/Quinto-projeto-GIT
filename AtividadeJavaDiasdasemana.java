package estruturaCondicional;

import java.util.Scanner;

public class AtividadeJavaDiasdasemana {
	
	 public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int Diasdasemana;
		 
		System.out.println("informe o dia da semana: ");
		Diasdasemana= ler.nextInt();
		
		if (Diasdasemana> 1-7) {
			System.out.println("dia valido");
		}
		else if(Diasdasemana == 1-7) {
			System.out.println("o numero é seis");
		}
		else {
			System.out.println("o dia é invalido");
		}
		ler.close();
		
		
		
	 }
}




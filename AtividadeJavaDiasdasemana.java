package estruturaCondicional;

import java.util.Scanner;

public class AtividadeJavaDiasdasemana {
	
	 public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int Diasdasemana;
		 
		System.out.println("informe o dia da semana: ");
		Diasdasemana= ler.nextInt();
		
		if (Diasdasemana == 1) {
			System.out.println("o dia da semana é domingo");
		}
		else if(Diasdasemana == 2) {
			System.out.println("o dia da semana é segunda");
		}  
		else if(Diasdasemana ==3){
			System.out.println("o dia da semana é terça");
		}
		else if(Diadasemana ==4){
			System.out.println("o dia da semana é quarta");
		}
		else if(Diasdasemana ==5){
			System.out.println("o dia da semana é quinta");
		}
		else if(Diasdasemana ==6){
			System.out.println("o dia da semana é sexta");
		}
		else if(Diasdasemana ==7){
			System.out.println("o dia da semana é sabado")
				}
		else {
			System.out.println("o dia é invalido");
		}
		ler.close();
		
		
		
	 }
}




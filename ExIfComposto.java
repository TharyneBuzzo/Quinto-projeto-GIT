package estruturaCondicional;

import java.util.Scanner;

public class ExIfComposto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("informe o numero: ");
		numero= ler.nextInt();
		
		if (numero > 0) {
			System.out.println("o numero é positivo");
		}
		else if (numero == 0) {
			System.out.println("o numero é zero");
		}
		else {
			System.out.println("o numero é negativo");
		}
       ler.close();
		
	}

}

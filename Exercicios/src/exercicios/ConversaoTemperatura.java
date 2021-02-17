package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		//FÓRMULA.  C°/5=(°F-32)/9
	  
		/*
		 *Variáveis: C, F (double)
		 *Entrada: F
		 *Processamento: C = (5*(F-32))/9
		 *Saída:C 
		 */
		
		//variáveis
		double c, f;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//Entrada
		System.out.println("Conversão de Temperatura");
		System.out.print("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//Processamento
		c = (5*(f-32))/9;
		//Sáida
		System.out.println("Temperatura em celsius: " + formatador.format(c) + "°c");
		teclado.close();
		
	
		

	}

}

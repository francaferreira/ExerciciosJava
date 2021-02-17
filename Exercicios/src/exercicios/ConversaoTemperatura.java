package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		//F�RMULA.  C�/5=(�F-32)/9
	  
		/*
		 *Vari�veis: C, F (double)
		 *Entrada: F
		 *Processamento: C = (5*(F-32))/9
		 *Sa�da:C 
		 */
		
		//vari�veis
		double c, f;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//Entrada
		System.out.println("Convers�o de Temperatura");
		System.out.print("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//Processamento
		c = (5*(f-32))/9;
		//S�ida
		System.out.println("Temperatura em celsius: " + formatador.format(c) + "�c");
		teclado.close();
		
	
		

	}

}

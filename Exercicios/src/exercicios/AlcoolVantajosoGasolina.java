package exercicios;

import java.util.Scanner;

public class AlcoolVantajosoGasolina {

	public static void main(String[] args) {
		
		
		/*Vari�veis:alcool, gasolina (double) 
		  Entrada:alcool, gasolina 
		  Processamento /sa�da if(alcool<0.7 * gasolina) { //abastecer com �lcool }else{ //abastecer
		  com gasolina }*/
		 

		// Vari�veis
		double alcool, gasolina;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("�lcoolVantajosoGasolina");
		System.out.print("Digite o valor do �lcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		// Processamento / Sa�da
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com �lcool: ");
		} else {
			System.out.println("Abastecer com Gasolina: ");
		}
		teclado.close();
	}

}

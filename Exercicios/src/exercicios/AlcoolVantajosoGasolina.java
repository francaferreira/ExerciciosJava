package exercicios;

import java.util.Scanner;

public class AlcoolVantajosoGasolina {

	public static void main(String[] args) {
		
		
		/*Variáveis:alcool, gasolina (double) 
		  Entrada:alcool, gasolina 
		  Processamento /saída if(alcool<0.7 * gasolina) { //abastecer com álcool }else{ //abastecer
		  com gasolina }*/
		 

		// Variáveis
		double alcool, gasolina;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("ÁlcoolVantajosoGasolina");
		System.out.print("Digite o valor do Álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		// Processamento / Saída
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com Álcool: ");
		} else {
			System.out.println("Abastecer com Gasolina: ");
		}
		teclado.close();
	}

}

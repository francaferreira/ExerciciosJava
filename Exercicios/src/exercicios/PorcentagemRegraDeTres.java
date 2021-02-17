package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PorcentagemRegraDeTres {

	public static void main(String[] args) {
		
		//Fórmula Y - 100% Valor - X% Valor = (X*Y) / 100
		
		/*
		  Variáveis: x, y, valor (double) 
		  Entrada: x, y 
		  Processamento: valor = (x*y) /100
		  Saída:valor
		 */

		// Variáveis
		double x, y, valor;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("Regra de Três");
		System.out.println("x % de y = valor");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextDouble();
		// Processamento
		valor = (x * y) / 100;
		// Saída
		System.out.println(x + " % de " + y + " = " + formatador.format(valor));
		teclado.close();

	}

}

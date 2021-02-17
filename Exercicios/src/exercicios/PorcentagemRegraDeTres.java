package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PorcentagemRegraDeTres {

	public static void main(String[] args) {
		
		//F�rmula Y - 100% Valor - X% Valor = (X*Y) / 100
		
		/*
		  Vari�veis: x, y, valor (double) 
		  Entrada: x, y 
		  Processamento: valor = (x*y) /100
		  Sa�da:valor
		 */

		// Vari�veis
		double x, y, valor;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("Regra de Tr�s");
		System.out.println("x % de y = valor");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextDouble();
		// Processamento
		valor = (x * y) / 100;
		// Sa�da
		System.out.println(x + " % de " + y + " = " + formatador.format(valor));
		teclado.close();

	}

}

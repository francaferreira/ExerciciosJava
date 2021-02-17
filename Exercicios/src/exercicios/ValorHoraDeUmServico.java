package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHoraDeUmServico {

	public static void main(String[] args) {
		/*
		  F�rmula: hora=remunera��o mensal + imposto + custo operacional +
		  investimentos / Carga hor�ria mensal de trabalho;
		 */

		/*
		  Vari�veis:hora, remuneracao, custo, cargaHoraria(double);
		  Entrada:remuneracao,custo, cargaHoraria;
		  Processamento:hora = (remuneracao +
		  (remuneracao * 0.3) + custo + (remuneracao * 0.2))/cargaHoraria; 
		  Sa�da:hora;
		 */

		// Vari�veis
		double hora, remuneracao, custo, cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("C�lculo do valor da hora de um servi�o");
		System.out.print("Remunera��o mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.println("carga hor�ria mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		// Sa�da
		System.out.println("Valo da hora: " + formatador.format(hora));
		teclado.close();
	}

}

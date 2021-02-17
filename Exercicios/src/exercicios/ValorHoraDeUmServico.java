package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorHoraDeUmServico {

	public static void main(String[] args) {
		/*
		  Fórmula: hora=remuneração mensal + imposto + custo operacional +
		  investimentos / Carga horária mensal de trabalho;
		 */

		/*
		  Variáveis:hora, remuneracao, custo, cargaHoraria(double);
		  Entrada:remuneracao,custo, cargaHoraria;
		  Processamento:hora = (remuneracao +
		  (remuneracao * 0.3) + custo + (remuneracao * 0.2))/cargaHoraria; 
		  Saída:hora;
		 */

		// Variáveis
		double hora, remuneracao, custo, cargaHoraria;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("Cálculo do valor da hora de um serviço");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.println("carga horária mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
		// Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		// Saída
		System.out.println("Valo da hora: " + formatador.format(hora));
		teclado.close();
	}

}

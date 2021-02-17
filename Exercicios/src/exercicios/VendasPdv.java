package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VendasPdv {

	public static void main(String[] args) {
		
		/*
		 Fórmula:
		 Total com desconto = total - desconto
		 Troco = valor pago - total com desconto
		 */
		
		/*
		 Variaveis: total, desconto, totalDesconto, valorPago, troco(double) 
		 Entrada1: total, desconto
		 Processamento: totalDesconto = total - (desconto * total) / 100
		 Saída1: totalDeconto 
		 Entrada2: valorPago
		 Processamento2: troco = valorPago - totalDesconto
		 Saída: troco
		 */
		
		//Variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		//objeto
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//Entrada1
		System.out.println("PDV");
		System.out.println("Valor total: ");
		total = teclado.nextDouble();
		System.out.println("Desconto: ");
		desconto = teclado.nextDouble();
		//Processamento
		totalDesconto = total - (desconto * total) / 100;
		//Saída1
		System.out.println("Total de desconto: R$ " + formatador.format(totalDesconto));
		//Entrada2
		System.out.println("_______________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		//Processamento2
		troco = valorPago - totalDesconto;
		//Saída2
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();
		
		
		
	}

}

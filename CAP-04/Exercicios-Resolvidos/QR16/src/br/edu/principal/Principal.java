package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Quest�o 16:
		 * Um supermercado deseja reajustar os pre�os de seus produtos usando o seguinte crit�rio: o produto
		 * poder� ter seu pre�o aumentado ou diminu�do. Para o pre�o ser alterado, o produto deve preencher 
		 * pelo menos um dos requisitos a seguir:
		 * Venda M�dia Mensal   Pre�o Atual   % de Aumento   % de Diminui��o
		 * < 500                < R$ 30,00     10             �
		 * >= 500 e < 1.200     >= R$ 30,00 e < R$ 80,00     15             �
		 * >= 1.200             >= R$ 80,00                  �               20
		 * Fa�a um programa que receba o pre�o atual e a venda m�dia mensal do produto, calcule e mostre o 
		 * novo pre�o.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double precoAtual, vendaMediaMensal, novoPreco;
		        
		        System.out.print("Digite o pre�o atual do produto: R$");
		        precoAtual = scanner.nextDouble();
		        System.out.print("Digite a venda m�dia mensal do produto: ");
		        vendaMediaMensal = scanner.nextDouble();
		        
		        if (vendaMediaMensal < 500 || precoAtual < 30) {
		            novoPreco = precoAtual * 1.1; // Aumento de 10%
		        } else if ((vendaMediaMensal >= 500 && vendaMediaMensal < 1200) && (precoAtual >= 30 && precoAtual < 80)) {
		            novoPreco = precoAtual * 1.15; // Aumento de 15%
		        } else if (vendaMediaMensal >= 1200 && precoAtual >= 80) {
		            novoPreco = precoAtual * 1.2; // Aumento de 20%
		        } else {
		            novoPreco = precoAtual; // N�o houve reajuste
		        }
		        
		        System.out.println("Novo pre�o do produto: R$" + novoPreco);
		        
		        scanner.close();

	}

}

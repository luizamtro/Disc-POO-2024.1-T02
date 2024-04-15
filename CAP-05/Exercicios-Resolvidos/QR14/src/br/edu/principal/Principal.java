package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Quest�o 14:
		 * Fa�a um programa que receba o valor de uma d�vida e mostre uma tabela com os seguintes dados:
		 * valor da d�vida, valor dos juros, quantidade de parcelas e valor da parcela. 
		 * Os juros e a quantidade de parcelas seguem a tabela:
		 * Quantidade de parcelas   % de juros sobre o valor inicial da d�vida
		 * 1                         0
		 * 3                         10
		 * 6                         15
		 * 9                         20
		 * 12                        25
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double valorDivida;
		        
		        System.out.print("Digite o valor da d�vida: R$");
		        valorDivida = scanner.nextDouble();
		        
		        System.out.println("Valor da D�vida   |   Valor dos Juros   |   Quantidade de Parcelas   |   Valor da Parcela");
		        System.out.println("-------------------------------------------------------------------------------------------");
		        
		        for (int parcelas : new int[]{1, 3, 6, 9, 12}) {
		            double juros = valorDivida * (parcelas == 1 ? 0 : parcelas * 0.1);
		            double valorParcela = (valorDivida + juros) / parcelas;
		            System.out.printf("R$%.2f                %.2f                    %d                           R$%.2f%n",
		                              valorDivida, juros, parcelas, valorParcela);
		        }
		        
		        scanner.close();

	}

}

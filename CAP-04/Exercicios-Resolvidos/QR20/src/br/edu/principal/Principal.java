package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Quest�o 20:
		 * Fa�a um programa que receba:
		 * - O c�digo de um produto comprado, supondo que a digita��o do c�digo do produto seja sempre 
		 * v�lida, isto �, um n�mero inteiro entre 1 e 10. 
		 * - O peso do produto em quilos. 
		 * - O c�digo do pa�s de origem, supondo que a digita��o do c�digo seja sempre v�lida, isto �, um n�-
		 * mero inteiro entre 1 e 3.
		 * 
		 * Tabelas:
		 * C�digo do Pa�s    Imposto
		 *                   de Origem
		 * 1                 0%
		 * 2                 15%
		 * 3                 25%
		 * 
		 * C�digo do Produto  Pre�o Por
		 *                    Grama
		 * 1 a 4              10
		 * 5 a 7              25
		 * 8 a 10             35
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        int codigoProduto, codigoPais;
		        double peso, precoPorGrama, imposto, precoFinal;
		        
		        System.out.print("Digite o c�digo do produto (entre 1 e 10): ");
		        codigoProduto = scanner.nextInt();
		        System.out.print("Digite o peso do produto em quilos: ");
		        peso = scanner.nextDouble();
		        System.out.print("Digite o c�digo do pa�s de origem (entre 1 e 3): ");
		        codigoPais = scanner.nextInt();
		        
		        if (codigoProduto >= 1 && codigoProduto <= 4) {
		            precoPorGrama = 10;
		        } else if (codigoProduto >= 5 && codigoProduto <= 7) {
		            precoPorGrama = 25;
		        } else {
		            precoPorGrama = 35;
		        }
		        
		        switch (codigoPais) {
		            case 1:
		                imposto = 0;
		                break;
		            case 2:
		                imposto = 0.15;
		                break;
		            case 3:
		                imposto = 0.25;
		                break;
		            default:
		                System.out.println("C�digo de pa�s inv�lido.");
		                scanner.close();
		                return;
		        }
		        
		        precoFinal = peso * precoPorGrama * (1 + imposto);
		        
		        System.out.println("Pre�o final do produto: R$" + precoFinal);
		        
		        scanner.close();

	}

}

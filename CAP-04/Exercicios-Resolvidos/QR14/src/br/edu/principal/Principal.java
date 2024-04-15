package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Quest�o 14:
		 * Fa�a um programa que receba o sal�rio inicial de um funcion�rio, calcule e mostre o novo sal�rio, 
		 * acrescido de bonifica��o e de aux�lio escola.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        double salarioInicial, novoSalario, bonificacao, auxilioEscola;

		        System.out.print("Digite o sal�rio inicial do funcion�rio: ");
		        salarioInicial = scanner.nextDouble();

		     
		        if (salarioInicial <= 500) {
		            bonificacao = salarioInicial * 0.05;
		        } else if (salarioInicial <= 1200) {
		            bonificacao = salarioInicial * 0.12;
		        } else {
		            bonificacao = 0;
		        }

		       
		        if (salarioInicial <= 600) {
		            auxilioEscola = 150;
		        } else {
		            auxilioEscola = 100;
		        }

		        novoSalario = salarioInicial + bonificacao + auxilioEscola;
		        
		        System.out.println("Novo sal�rio: R$" + novoSalario);
		        
		        scanner.close();
		    }
		

	}



package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Quest�o 17:
		 * Fa�a um programa que receba o sal�rio de um funcion�rio chamado Carlos. Sabe-se que outro funcion�rio,
		 * Jo�o, tem sal�rio equivalente a um ter�o do sal�rio de Carlos. Carlos aplicar� seu sal�rio integralmente
		 * na caderneta de poupan�a, que rende 2% ao m�s, e Jo�o aplicar� seu sal�rio integralmente no fundo de
		 * renda fixa, que rende 5% ao m�s. O programa dever� calcular e mostrar a quantidade de meses necess�rios
		 * para que o valor pertencente a Jo�o iguale ou ultrapasse o valor pertencente a Carlos.
		 */
		
		        double salarioCarlos = 2000; // Exemplo de sal�rio para Carlos
		        double salarioJoao = salarioCarlos / 3;
		        
		        double valorCarlos = salarioCarlos;
		        double valorJoao = salarioJoao;
		        
		        int meses = 0;
		        
		        while (valorJoao <= valorCarlos) {
		            valorCarlos *= 1.02; // Rendimento da poupan�a
		            valorJoao *= 1.05; // Rendimento do fundo de renda fixa
		            meses++;
		        }
		        
		        System.out.println("Quantidade de meses necess�rios: " + meses);

	}

}

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Quest�o proposta QP05: Fa�a um programa que receba dois n�meros e execute as opera��es listadas a seguir, de acordo com a escolha
		do usu�rio.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		float numero1 = sc.nextFloat();
		
		System.out.print("Digite o segundo n�mero: ");
		float numero2 = sc.nextFloat();
		
		System.out.println("Digite '1' para a m�dia dos n�meros digitados: ");
		System.out.println("Digite '2' para a diferen�a do maior pelo menor: ");
		System.out.println("Digite '3' para o produto entre n�meros digitados: ");
		System.out.println("Digite '4' para a divis�o do primeiro pelo segundo: ");
		
		int escolha = sc.nextInt();
		
		if (escolha == 1) 
		{
			float media = (numero1+numero2)/2;
			System.out.print("Esta � a m�dia dos n�meros digitados: "+media);
		}
		
		if (escolha== 2) 
		{
			float diferenca = numero1 - numero2;
			
			if (diferenca<0) 
			{
				diferenca = diferenca * (-1);
				System.out.print("Esta � a diferen�a dos n�meros digitados: "+ diferenca);
			}
			
			else System.out.print("Esta � a diferen�a dos n�meros digitados: "+ diferenca);
			
		}
		
		if (escolha ==3) 
		{
			float produto = numero1 * numero2;
			System.out.print("Este � o produto dos n�meros digitados: "+ produto);
		}
		
		if (escolha == 4) 
		{
			float divisao = numero1/numero2;
			System.out.print("Esta � a divis�o dos n�meros digitados: "+ divisao);
		}
	}

}

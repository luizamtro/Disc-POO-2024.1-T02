package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Quest�o 16:
		 * Fa�a um programa para calcular a �rea de um tri�ngulo e que n�o permita a entrada de dados inv�lidos,
		 * ou seja, medidas menores ou iguais a 0.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double base, altura;
		        
		        System.out.println("Digite as medidas do tri�ngulo:");
		        System.out.print("Base: ");
		        base = scanner.nextDouble();
		        while (base <= 0) {
		            System.out.println("Base inv�lida. Digite um valor maior que 0.");
		            System.out.print("Base: ");
		            base = scanner.nextDouble();
		        }
		        
		        System.out.print("Altura: ");
		        altura = scanner.nextDouble();
		        while (altura <= 0) {
		            System.out.println("Altura inv�lida. Digite um valor maior que 0.");
		            System.out.print("Altura: ");
		            altura = scanner.nextDouble();
		        }
		        
		        double area = (base * altura) / 2;
		        System.out.println("A �rea do tri�ngulo �: " + area);
		        
		        scanner.close();

	}

}

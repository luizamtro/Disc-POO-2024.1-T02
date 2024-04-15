package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Quest�o 18:
		Dados tr�s valores X, Y e Z, verifique se eles podem ser os comprimentos dos lados de um tri�ngulo
		 * e, se forem, verifique se � um tri�ngulo equil�tero, is�sceles ou escaleno. Se eles n�o formarem um 
		 * tri�ngulo, escreva uma mensagem.
		 * Considere que:
		 * - O comprimento de cada lado de um tri�ngulo � menor que a soma dos outros dois lados; 
		 * - Chama-se equil�tero o tri�ngulo que tem tr�s lados iguais; 
		 * - Denomina-se is�sceles o tri�ngulo que tem o comprimento de dois lados iguais; 
		 * - Recebe o nome de escaleno o tri�ngulo que tem os tr�s lados diferentes.
		 */
	
		        Scanner scanner = new Scanner(System.in);
		        
		        double x, y, z;
		        
		        System.out.println("Digite os comprimentos dos lados do tri�ngulo:");
		        System.out.print("X: ");
		        x = scanner.nextDouble();
		        System.out.print("Y: ");
		        y = scanner.nextDouble();
		        System.out.print("Z: ");
		        z = scanner.nextDouble();
		        
		        if (x < y + z && y < x + z && z < x + y) {
		            if (x == y && y == z) {
		                System.out.println("� um tri�ngulo equil�tero.");
		            } else if (x == y || x == z || y == z) {
		                System.out.println("� um tri�ngulo is�sceles.");
		            } else {
		                System.out.println("� um tri�ngulo escaleno.");
		            }
		        } else {
		            System.out.println("Os valores n�o formam um tri�ngulo.");
		        }
		        
		        scanner.close();

	}

}

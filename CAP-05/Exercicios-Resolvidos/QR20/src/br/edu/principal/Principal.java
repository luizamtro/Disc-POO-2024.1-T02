package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/**
		 * Quest�o 20:
		 * Fa�a um programa para ler o c�digo, o sexo (M � masculino; F � feminino) e o n�mero de horas/
		 * aula dadas mensalmente pelos professores de uma universidade, sabendo-se que cada hora/aula vale 
		 * R$ 30,00. Emita uma listagem contendo o c�digo, o sal�rio bruto e o sal�rio l�quido (levando em 
		 * considera��o os descontos explicados a seguir) de todos os professores. Mostre tamb�m a m�dia dos 
		 * sal�rios l�quidos dos professores do sexo masculino e a m�dia dos sal�rios l�quidos dos professores do 
		 * sexo feminino. Considere:
		 * - Desconto para homens, 10%, e, para mulheres, 5%;
		 * - As informa��es terminar�o quando for lido o c�digo = 99999.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        int codigo;
		        char sexo;
		        int horasAula;
		        
		        int totalHomens = 0, totalMulheres = 0;
		        double salarioBruto, salarioLiquido, totalSalarioHomens = 0, totalSalarioMulheres = 0;
		        
		        do {
		            System.out.print("Digite o c�digo do professor (ou 99999 para encerrar): ");
		            codigo = scanner.nextInt();
		            if (codigo == 99999) {
		                break;
		            }
		            
		            System.out.print("Digite o sexo do professor (M/F): ");
		            sexo = scanner.next().charAt(0);
		            
		            System.out.print("Digite o n�mero de horas/aula dadas mensalmente: ");
		            horasAula = scanner.nextInt();
		            
		            salarioBruto = horasAula * 30.0;
		            if (sexo == 'M') {
		                salarioLiquido = salarioBruto * 0.9; // Desconto de 10% para homens
		                totalSalarioHomens += salarioLiquido;
		                totalHomens++;
		            } else {
		                salarioLiquido = salarioBruto * 0.95; // Desconto de 5% para mulheres
		                totalSalarioMulheres += salarioLiquido;
		                totalMulheres++;
		            }
		            
		            System.out.println("C�digo: " + codigo);
		            System.out.println("Sal�rio Bruto: R$" + salarioBruto);
		            System.out.println("Sal�rio L�quido: R$" + salarioLiquido);
		            System.out.println("------------------------------------");
		        } while (codigo != 99999);
		        
		        if (totalHomens > 0) {
		            double mediaSalarioHomens = totalSalarioHomens / totalHomens;
		            System.out.println("M�dia dos sal�rios l�quidos dos professores do sexo masculino: R$" + mediaSalarioHomens);
		        } else {
		            System.out.println("Nenhum professor do sexo masculino encontrado.");
		        }
		        
		        if (totalMulheres > 0) {
		            double mediaSalarioMulheres = totalSalarioMulheres / totalMulheres;
		            System.out.println("M�dia dos sal�rios l�quidos dos professores do sexo feminino: R$" + mediaSalarioMulheres);
		        } else {
		            System.out.println("Nenhum professor do sexo feminino encontrado.");
		        }
		        
		        scanner.close();

	}

}

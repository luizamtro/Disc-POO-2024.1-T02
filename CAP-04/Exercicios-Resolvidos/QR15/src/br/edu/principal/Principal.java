package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Quest�o 15:
		 * Fa�a um programa que receba o valor do sal�rio m�nimo, o n�mero de horas trabalhadas, o n�mero
		 * de dependentes do funcion�rio e a quantidade de horas extras trabalhadas. Calcule e mostre o sal�rio 
		 * a receber do funcion�rio de acordo com as regras a seguir:
		 * - O valor da hora trabalhada � igual a 1/5 do sal�rio m�nimo. 
		 * - O sal�rio do m�s � igual ao n�mero de horas trabalhadas multiplicado pelo valor da hora trabalhada. 
		 * - Para cada dependente, acrescentar R$ 32,00. 
		 * - Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%. 
		 * - O sal�rio bruto � igual ao sal�rio do m�s mais o valor dos dependentes mais o valor das horas extras. 
		 * - Calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir:
		 *   IRRF        Sal�rio Bruto
		 *   Isento      Inferior a R$ 200,00
		 *   10%         De R$ 200,00 at� R$ 500,00
		 *   20%         Superior a R$ 500,00
		 * - O sal�rio l�quido � igual ao sal�rio bruto menos IRRF.
		 * - A gratifica��o � de acordo com a tabela a seguir:
		 *   Sal�rio L�quido   Gratifica��o
		 *   At� R$ 350,00     R$ 100,00
		 *   Superior a R$ 350,00  R$ 50,00
		 * - O sal�rio a receber do funcion�rio � igual ao sal�rio l�quido mais a gratifica��o.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double salarioMinimo, numHorasTrabalhadas, numDependentes, numHorasExtras;
		        
		        System.out.print("Digite o valor do sal�rio m�nimo: ");
		        salarioMinimo = scanner.nextDouble();
		        System.out.print("Digite o n�mero de horas trabalhadas: ");
		        numHorasTrabalhadas = scanner.nextDouble();
		        System.out.print("Digite o n�mero de dependentes do funcion�rio: ");
		        numDependentes = scanner.nextDouble();
		        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
		        numHorasExtras = scanner.nextDouble();
		        
		        double valorHoraTrabalhada = salarioMinimo / 5;
		        double salarioMes = numHorasTrabalhadas * valorHoraTrabalhada;
		        double valorDependentes = numDependentes * 32;
		        double valorHoraExtra = (valorHoraTrabalhada * 1.5) * numHorasExtras;
		        double salarioBruto = salarioMes + valorDependentes + valorHoraExtra;
		        
		        double irrf;
		        if (salarioBruto < 200) {
		            irrf = 0;
		        } else if (salarioBruto <= 500) {
		            irrf = salarioBruto * 0.1;
		        } else {
		            irrf = salarioBruto * 0.2;
		        }
		        
		        double salarioLiquido = salarioBruto - irrf;
		        
		        double gratificacao;
		        if (salarioLiquido <= 350) {
		            gratificacao = 100;
		        } else {
		            gratificacao = 50;
		        }
		        
		        double salarioReceber = salarioLiquido + gratificacao;
		        
		        System.out.println("Sal�rio a receber do funcion�rio: R$" + salarioReceber);
		        
		        scanner.close();
		    }
		}

	
package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Quest�o 13:
		 * Foi feita uma pesquisa para determinar o �ndice de mortalidade infantil em certo per�odo. Fa�a um
		 * programa que:
		 * - Leia o n�mero de crian�as nascidas no per�odo;
		 * - Identifique o sexo (M ou F) e o tempo de vida de cada crian�a nascida.
		 * O programa deve calcular e mostrar:
		 * - A percentagem de crian�as do sexo feminino mortas no per�odo;
		 * - A percentagem de crian�as do sexo masculino mortas no per�odo;
		 * - A percentagem de crian�as que viveram 24 meses ou menos no per�odo.
		 */
	
		        Scanner scanner = new Scanner(System.in);
		        
		        int numCriancasNascidas, numCriancasMortasFeminino = 0, numCriancasMortasMasculino = 0, numCriancasMenor24Meses = 0;
		        char sexo;
		        int tempoVida;
		        
		        System.out.print("Digite o n�mero de crian�as nascidas no per�odo: ");
		        numCriancasNascidas = scanner.nextInt();
		        
		        for (int i = 0; i < numCriancasNascidas; i++) {
		            System.out.print("Digite o sexo da crian�a (M ou F): ");
		            sexo = scanner.next().charAt(0);
		            System.out.print("Digite o tempo de vida da crian�a em meses: ");
		            tempoVida = scanner.nextInt();
		            
		            if (sexo == 'F') {
		                numCriancasMortasFeminino++;
		            } else {
		                numCriancasMortasMasculino++;
		            }
		            
		            if (tempoVida <= 24) {
		                numCriancasMenor24Meses++;
		            }
		        }
		        
		        double percentagemMortasFeminino = (double) numCriancasMortasFeminino / numCriancasNascidas * 100;
		        double percentagemMortasMasculino = (double) numCriancasMortasMasculino / numCriancasNascidas * 100;
		        double percentagemMenor24Meses = (double) numCriancasMenor24Meses / numCriancasNascidas * 100;
		        
		        System.out.println("Percentagem de crian�as do sexo feminino mortas no per�odo: " + percentagemMortasFeminino + "%");
		        System.out.println("Percentagem de crian�as do sexo masculino mortas no per�odo: " + percentagemMortasMasculino + "%");
		        System.out.println("Percentagem de crian�as que viveram 24 meses ou menos no per�odo: " + percentagemMenor24Meses + "%");
		        
		        scanner.close();

	}

}

package capgeminiCalc;
import java.util.Scanner;

		/**	Projeto do desafio classificatório da Academia Capgemini com execução pela ProWay
		Script de calculadora de alcance de anúncios
		@author Beatriz Sousa
		@version 1.0 */	

public class Calculadora {

	public static void main(String[] args) {
		
		//	Método para troubleshooting no caso de inserção de caracteres inapropriados para cálculo
		
		double valor = debugValor();
		
		//	Método para cálculo do valor inserido gerando saída do total máximo de visualizações
		
		int vMax = visualMax (valor); 
		
			System.out.println("O seu anúncio terá " + vMax + " visualizações." );
	}		

	private static double debugValor() {
		double valor = 0;
		Scanner sc = new Scanner (System.in);
		
        do {
        	System.out.println("- Agência Divulga Tudo -");
        	System.out.println("Calculadora de alcance de anúncios");
        	System.out.println();
        	System.out.print("Insira o valor do investimento: R$ ");
        	if(!sc.hasNextDouble()) {
        		System.out.println("Valor inválido. Por favor, insira um número inteiro positivo.");
        		sc.next();
        		continue;
			  }
			  valor = sc.nextDouble();
			if (valor<=0) {
			  System.out.println("Valor inválido. Por favor, insira um número inteiro positivo.");
			  continue;
			}
		} while (valor <= 0);
		sc.close();
		return valor;
		
	}
	
	private static int visualMax(double valor) {
		
		double visual = (valor * 30.0);
		double share = (valor * 0.54);
		double shareTotal = share;

			for (int i = 0; i < 3; i++) {
		    share = share * 0.72;
		    shareTotal = shareTotal + share;

		    }
		    
		int vMax = (int)(visual + (shareTotal * 40));
		return vMax;
			
	}
	
}
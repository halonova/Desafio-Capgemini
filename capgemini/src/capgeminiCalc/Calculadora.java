package capgeminiCalc;
import java.util.Scanner;

		/**	Projeto do desafio classificat�rio da Academia Capgemini com execu��o pela ProWay
		Script de calculadora de alcance de an�ncios
		@author Beatriz Sousa
		@version 1.0 */	

public class Calculadora {

	public static void main(String[] args) {
		
		//	M�todo para troubleshooting no caso de inser��o de caracteres inapropriados para c�lculo
		
		double valor = debugValor();
		
		//	M�todo para c�lculo do valor inserido gerando sa�da do total m�ximo de visualiza��es
		
		int vMax = visualMax (valor); 
		
			System.out.println("O seu an�ncio ter� " + vMax + " visualiza��es." );
	}		

	private static double debugValor() {
		double valor = 0;
		Scanner sc = new Scanner (System.in);
		
        do {
        	System.out.println("- Ag�ncia Divulga Tudo -");
        	System.out.println("Calculadora de alcance de an�ncios");
        	System.out.println();
        	System.out.print("Insira o valor do investimento: R$ ");
        	if(!sc.hasNextDouble()) {
        		System.out.println("Valor inv�lido. Por favor, insira um n�mero inteiro positivo.");
        		sc.next();
        		continue;
			  }
			  valor = sc.nextDouble();
			if (valor<=0) {
			  System.out.println("Valor inv�lido. Por favor, insira um n�mero inteiro positivo.");
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
package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		// Calculo
		int colchetesA = 6 * (3 + 2);
		int colchetesB = (1 - 5) * (2 - 7);
		
		double potencialcaoA = Math.pow(colchetesA, 2);
		double potencialcaoB = Math.pow(colchetesB, 2);
		
		double divicaoA = potencialcaoA / (3 * 2);
		double divicaoB = potencialcaoB / 2;
		
		double subtracao = divicaoA - divicaoB;
		
		double potencialcaoC = Math.pow(subtracao, 3);
		double potencialcaoD = Math.pow(10, 3);
		
		double resultado = potencialcaoC / potencialcaoD;
		
		
		System.out.println(divicaoA);
		System.out.println("O resultado da conta é " + resultado);
		
	}

}

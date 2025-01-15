package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salário:");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu segundo salário:");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu terceiro salário:");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double calculo = (numero1 + numero2 + numero3) / 3;
		
		System.out.printf("Seu primeiro salário é R$%s o segundo é R$%s e o terceiro é R$%s e a média dos três São %f",
				salario1, salario2, salario3, calculo);
		entrada.close();
	}

}

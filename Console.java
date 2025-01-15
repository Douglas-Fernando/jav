package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digita o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = Integer.parseInt(entrada.nextLine()); //Integer.parseInt para poder quebrar a linha que o nextInt() não lê
		
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Seu nome é %s e sua idade é %d anos. Seu sobrenome é %s", nome, idade, sobrenome);
		entrada.close();
		
		
	}
	
}

package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos primitivos do Java
		// As variaves ficam com esse trajado em amarelo porque não estão sendo utilizados
		// Informações do funcionário
		
		// Tipos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		/*
		 * No long, deve sempre usar a letra L no final do número para conversão do long quando esse for maior que int.
		 * Por patrão é utilizado o int e como passou da capacidade e o java não
		 * consegue fazer a conversão sozinho.
		 *
		 */
		 // Tipos numéricos reais
		float salario = 11_445.44F; // no caso do float, sempre deve colocar o "F" no final. Por causa do patrão Double
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos boleano
		boolean estaDeFerias = true;
		
		// Tipos caractere
		char status = 'A';
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de Viagens Reais
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha ->" + " " + salario);
		System.out.println("Está de Férias?" + " " + estaDeFerias);
		System.out.println("Status:" + " " + status);
	}

}

package Fundamentos;

public class Temperatura {
public static void main(String[] args) {
	// (F - 32) x 5/9 = C
	double f = 86;
	final double NUM1 = 32;
	final double NUM2 = 5;
	final double NUM3 = 9;
	double primeiraconta = f - NUM1;
	double segundaconta = NUM2 / NUM3;
	double resultado = primeiraconta * segundaconta;
	System.out.println(resultado);
}
}

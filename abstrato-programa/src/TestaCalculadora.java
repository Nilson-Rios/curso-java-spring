import sun.security.action.GetBooleanAction;

public class TestaCalculadora {

	public static void main(String[] args) {

		Calculadora resultado = new Calculadora();
		System.out.printf("O resultado da soma é: \n" + resultado.soma(10.1, 5.1));

		double r = resultado.multiplicacao(10.1, 5.1);
		System.out.printf("\nO resultado da multiplicação é: \n" + r);

		System.out.printf("\nO resultado da multiplicação é: \n" + resultado.subtracao(10.1, 5.1));

	}
}

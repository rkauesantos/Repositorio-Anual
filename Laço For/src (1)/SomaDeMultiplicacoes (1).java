import java.util.Scanner;

public class SomaDeMultiplicacoes {

	public static void main(String[] args) {
		int i, numero, resultado = 1;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o número a qual deseja ver a tabuada: ");
		numero = Ler.nextInt();
		
		// for //
		for (i=1; i<=10; i++) {
			resultado = resultado * i;
		}
		// for //
		
		System.out.println(resultado);
	}

}

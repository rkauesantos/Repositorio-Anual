import java.util.Scanner;

public class TabuadaDe1a10 {

	public static void main(String[] args) {
		int i, numero;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o número a qual deseja ver a tabuada: ");
		numero = Ler.nextInt();
		
		// for //
		for (i=1; i<=10; i++) {
			System.out.println(numero * i);
		}
		// for //
		
	}

}

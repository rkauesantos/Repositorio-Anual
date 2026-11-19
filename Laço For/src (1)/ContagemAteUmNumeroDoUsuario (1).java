import java.util.Scanner;

public class ContagemAteUmNumeroDoUsuario {

	public static void main(String[] args) {
		int i, numeroDoUsuario, soma = 0;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o número a qual quer que a contagem acabe: ");
		numeroDoUsuario = Ler.nextInt();
		
		// for //
		for (i=1; i<=numeroDoUsuario; i++) {
			System.out.println(i);
		}
		// for //
		
	}

}

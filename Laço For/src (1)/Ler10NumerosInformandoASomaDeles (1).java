
import java.util.Scanner;

public class Ler10NumerosInformandoASomaDeles {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero, soma = 0;

        // for //
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            numero = Ler.nextInt();

            soma = soma + numero;
        }
        // for //

        System.out.println("A soma de todos os numeros digitados é: " + soma);
    }
}
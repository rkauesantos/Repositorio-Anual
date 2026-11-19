
import java.util.Scanner;

public class Ler10NumerosInformandoOsPares {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero, quantidadePares = 0;

        // for //
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            numero = Ler.nextInt();

            // if //
            if (numero % 2 == 0) {
                quantidadePares = quantidadePares + 1;
            }
            // if //
        }
        // for //

        System.out.println("Você digitou " + quantidadePares + " numeros pares.");
    }
}
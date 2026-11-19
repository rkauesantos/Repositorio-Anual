
import java.util.Scanner;

public class Ler10NumerosInformandoOMaior {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero, maior = 0;

        // for //
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero: ");
            numero = Ler.nextInt();

            // if //
            if (i == 1) {
                maior = numero;
            } else if (numero > maior) {
                maior = numero;
            }
            // if //
        }
        // for //

        System.out.println("O maior valor digitado foi: " + maior);
    }
}
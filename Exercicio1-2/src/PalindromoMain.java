import java.util.Scanner;

public class PalindromoMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Palindromo verificador = new Palindromo();

            System.out.print("Digite uma palavra ou frase: ");
            String texto = sc.nextLine();

            boolean r = verificador.verPalindromo(texto);

            if (r) {
                System.out.println("É um palíndromo.");
            } else {
                System.out.println("Não é um palíndromo.");
            }

            sc.close();
        }
}

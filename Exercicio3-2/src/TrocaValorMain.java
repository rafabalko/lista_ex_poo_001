import java.util.Scanner;

public class TrocaValorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        System.out.print("Digite o valor de A: ");
        objA.valor = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        objB.valor = sc.nextInt();

        System.out.println("\nAntes da troca:");
        System.out.println("A = " + objA.valor);
        System.out.println("B = " + objB.valor);

        ValorContainer.trocarValores(objA, objB);

        System.out.println("\nDepois da troca:");
        System.out.println("A = " + objA.valor);
        System.out.println("B = " + objB.valor);

        sc.close();
    }
}

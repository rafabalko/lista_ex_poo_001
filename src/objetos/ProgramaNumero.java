package objetos;

import java.util.Scanner;

public class ProgramaNumero {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Numero n = new Numero();

        System.out.print("Digite um numero: ");
        n.valor = sc.nextInt();

        n.mostrarValor();
        System.out.println("Endereço simulado: " + System.identityHashCode(n));

        sc.close();
    }
}

import java.util.Scanner;

public class FatorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fatorial f = new Fatorial();

        System.out.print("Digite um numero:");
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Numero não pode ser real, ou negativo!");
        } else{
            int r = f.calcularFatorial(n);
            System.out.println("Fatorial de " + n + "! é: " + r);
        }
        sc.close();
    }
}

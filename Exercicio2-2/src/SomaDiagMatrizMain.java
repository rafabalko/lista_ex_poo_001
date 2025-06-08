import java.util.Scanner;

public class SomaDiagMatrizMain {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        SomaDiagMatriz diag = new SomaDiagMatriz();

        System.out.print("Digite o tamanho da Matriz Quadrada: ");
        int t = sc.nextInt();

        int [][] matriz = new int[t][t];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < t; i++){
            for (int j = 0; j < t; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaP = diag.somaDP(matriz, t);
        int somaS = diag.somaDS(matriz, t);

        System.out.println("Resultado da soma da Diagonal Principal: " + somaP);
        System.out.println("Resultado da soma da Diagonal Secundária: " + somaS);

        sc.close();
    }
}

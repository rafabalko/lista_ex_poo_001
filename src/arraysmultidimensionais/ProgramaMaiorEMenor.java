package arraysmultidimensionais;

import java.util.Scanner;

public class ProgramaMaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaiorEMenor util = new MaiorEMenor();

        System.out.print("Digite o numero de linhas: ");
        int m = sc.nextInt();

        System.out.print("Digite o numero de colunas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int maior = util.encontrarMaior(matriz, m, n);
        int menor = util.encontrarMenor(matriz, m, n);

        System.out.println("Maior elemento da matriz: " + maior);
        System.out.println("Menor elemento da matriz: " + menor);

        sc.close();
    }
}

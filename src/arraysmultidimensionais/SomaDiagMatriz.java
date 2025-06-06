package arraysmultidimensionais;

public class SomaDiagMatriz {

    public int somaDP(int[][] matriz, int tam){
        int soma = 0;
        for (int i = 0; i < tam; i++){
            soma = soma + matriz[i][i];
        }
        return soma;
    }

    public int somaDS(int[][] matriz, int tam){
        int soma = 0;
        for (int i = 0; i < tam; i++){
            soma = soma + matriz[i][tam - 1 - i];
        }
        return soma;
    }
}

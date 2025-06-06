package arraysmultidimensionais;

public class MaiorEMenor {

    public int encontrarMaior(int[][] m, int l, int c) {
        int ma = m[0][0];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] > ma) {
                    ma = m[i][j];
                }
            }
        }
        return ma;
    }

    public int encontrarMenor(int[][] m, int l, int c) {
        int me = m[0][0];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] < me) {
                    me = m[i][j];
                }
            }
        }
        return me;
    }
}

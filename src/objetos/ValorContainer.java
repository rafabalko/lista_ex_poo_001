package objetos;

public class ValorContainer {
        int valor;
        public static void trocarValores(ValorContainer refA, ValorContainer refB) {
            int temp = refA.valor;
            refA.valor = refB.valor;
            refB.valor = temp;
        }
}

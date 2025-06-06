package metodos;

public class Palindromo {

    public boolean verPalindromo(String txt){
        txt = txt.toLowerCase();
        txt = txt.replace(" ", "");

        String invertida = "";

        for (int i = txt.length() - 1; i >= 0; i-- ){
            invertida = invertida + txt.charAt(i);
        }
        return txt.equals(invertida);
    }
}

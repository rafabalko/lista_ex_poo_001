public class ConversorTemperatura {

    public double cParaF(double c){
        return (c * 9/5) + 32;
    }

    public double fParaC(double f){
        return (f - 32) * 5/9;
    }
}

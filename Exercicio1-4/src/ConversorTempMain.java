import java.util.Scanner;

public class ConversorTempMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ConversorTemperatura ct = new ConversorTemperatura();

        int op;
        double temp, r;
        System.out.println("Escolha a conversão de temperatura desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Escolha uma opção: ");
        op = sc.nextInt();

        if (op == 1){
            System.out.print("Digite a temperatura em Celsius: ");
            temp = sc.nextDouble();
            r = ct.cParaF(temp);
            System.out.printf("Temperatura em Fahrenheit: %.2fF%n", r);
        } else if (op == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temp = sc.nextDouble();
            r = ct.fParaC(temp);
            System.out.printf("Temperatura em Celsius: %.2fF%n", r);
        }else {
            System.out.printf("Opção Inválida!");
        }
        sc.close();
    }
}

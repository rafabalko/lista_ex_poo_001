import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        int opcao;

        do{
            System.out.println("\n--- MENU FUNCIONÁRIOS ---");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Listar Funcionário");
            System.out.println("3. Total de salários por departamento");
            System.out.println("0. Sair");
            System.out.println("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1){
                Funcionario func = new Funcionario();
                System.out.print("Nome: ");
                func.nome = sc.nextLine();
                System.out.print("ID: ");
                func.id = sc.nextInt();
                System.out.print("Salário: ");
                func.salario = sc.nextDouble();
                sc.nextLine();
                System.out.print("Departamento: ");
                func.departamento = sc.nextLine();
                lista.add(func);
                System.out.print("\nFuncionário cadastrado com sucesso!\n");

            } else if (opcao == 2){
                System.out.print("\n--- FUNCIONÁRIOS CADASTRADOS ---\n");
                for (Funcionario func : lista){
                    System.out.println("ID: " + func.id);
                    System.out.println("Nome: " + func.nome);
                    System.out.println("Salário: R$" + func.salario);
                    System.out.println("Departamento: " + func.departamento);
                    System.out.println("--------------------------------");
                }
            } else if (opcao == 3){
                System.out.println("Informe o Departamento: ");
                String Dpto = sc.nextLine();
                double total = 0;
                for (Funcionario func : lista){
                    if (func.departamento.equalsIgnoreCase(Dpto)){
                        total = total + func.salario;
                    }
                }
                System.out.printf("Total de salários no departamento '%s': R$ %.2f\n", Dpto, total);
            }
        }while (opcao != 0);

        sc.close();
    }
}

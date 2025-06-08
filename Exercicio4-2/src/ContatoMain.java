import java.util.ArrayList;
import java.util.Scanner;

public class ContatoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU CONTATOS ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Buscar contato por nome");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (lista.size() >= 10) {
                    System.out.println("Limite de 10 contatos atingido!");
                } else {
                    Contato c = new Contato();
                    System.out.print("Nome: ");
                    c.nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    c.telefone = sc.nextLine();
                    System.out.print("Email: ");
                    c.email = sc.nextLine();
                    lista.add(c);
                    System.out.println("Contato adicionado!");
                }
            } else if (opcao == 2) {
                System.out.println("\n--- LISTA DE CONTATOS ---");
                for (Contato c : lista) {
                    System.out.println("Nome: " + c.nome);
                    System.out.println("Telefone: " + c.telefone);
                    System.out.println("Email: " + c.email);
                    System.out.println("-------------------------");
                }
            } else if (opcao == 3) {
                System.out.print("Digite o nome do contato: ");
                String nomeBusca = sc.nextLine();
                boolean encontrado = false;
                for (Contato c : lista) {
                    if (c.nome.equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Telefone: " + c.telefone);
                        System.out.println("Email: " + c.email);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Contato não encontrado.");
                }
            }
        } while (opcao != 0);
        sc.close();
    }
}

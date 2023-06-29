package exercicio1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        Cliente cliente = new Cliente(nome, endereco, cpf, idade);

        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Idade: " + cliente.getIdade());

        if (cliente.validaCPF()) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }
}
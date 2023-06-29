package principal;
import entidades.Cliente;
import entidades.Produto;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Cliente");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoCliente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente);

        System.out.println();

        System.out.println("Cadastro de Produtos");
        System.out.print("Quantidade de produtos: ");
        int quantidadeProdutos = scanner.nextInt();

        scanner.nextLine();

        Produto[] produtos = new Produto[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Produto " + (i + 1));
            System.out.print("Nome: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Preço: R$");
            double precoProduto = scanner.nextDouble();
            System.out.print("Categoria: ");
            String categoriaProduto = scanner.next();

            produtos[i] = new Produto(nomeProduto, precoProduto, categoriaProduto);

            scanner.nextLine();
            System.out.println();
        }

        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());

        System.out.println();

        System.out.println("Informações dos Produtos:");
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Produto " + (i + 1) + ": " + produtos[i].getNome());
            System.out.println("Preço: R$" + produtos[i].getPreco());
            System.out.println("Categoria: " + produtos[i].getCategoria());
            System.out.println();
        }
        
        scanner.close();
    }
}


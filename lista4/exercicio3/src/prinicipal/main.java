package prinicipal;
import entidades.Produto;
import entidades.Cliente;
import entidades.CarrinhoDeCompra;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 7) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    cadastrarProduto(scanner);
                    break;
                case 3:
                    buscarCliente(scanner);
                    break;
                case 4:
                    adicionarProdutoNoCarrinho(scanner);
                    break;
                case 5:
                    excluirUltimoProdutoDoCarrinho(scanner);
                    break;
                case 6:
                    gerarNotaFiscal(scanner);
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }

            System.out.println();
        }
    }

    private static void exibirMenu() {
        System.out.println("======== Menu ========");
        System.out.println("[1] Cadastro de Cliente");
        System.out.println("[2] Cadastro de Produto");
        System.out.println("[3] Buscar Cliente");
        System.out.println("[4] Adicionar produto no carrinho de compras");
        System.out.println("[5] Excluir último produto adicionado no carrinho");
        System.out.println("[6] Nota Fiscal");
        System.out.println("[7] Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, cpf, endereco);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarProduto(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void buscarCliente(Scanner scanner) {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("E-mail: " + clienteEncontrado.getEmail());
            System.out.println("CPF: " + clienteEncontrado.getCpf());
            System.out.println("Endereço: " + clienteEncontrado.getEndereco());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void adicionarProdutoNoCarrinho(Scanner scanner) {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("Produtos disponíveis:");

            for (int i = 0; i < produtos.size(); i++) {
                Produto produto = produtos.get(i);
                System.out.println((i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco());
            }

            System.out.print("Escolha o número do produto: ");
            int numeroProduto = scanner.nextInt();

            Produto produtoEscolhido = produtos.get(numeroProduto - 1);
            clienteEncontrado.getCarrinhoDeCompra().adicionarProduto(produtoEscolhido);

            System.out.println("Produto adicionado ao carrinho de compras.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void excluirUltimoProdutoDoCarrinho(Scanner scanner) {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            CarrinhoDeCompra carrinhoDeCompra = clienteEncontrado.getCarrinhoDeCompra();
            carrinhoDeCompra.removerUltimoProduto();

            System.out.println("Último produto do carrinho de compras removido.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private static void gerarNotaFiscal(Scanner scanner) {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("=== Nota Fiscal ===");
            System.out.println("Cliente: " + clienteEncontrado.getNome());
            System.out.println("CPF: " + clienteEncontrado.getCpf());

            CarrinhoDeCompra carrinhoDeCompra = clienteEncontrado.getCarrinhoDeCompra();
            List<Produto> produtosDoCarrinho = carrinhoDeCompra.getProdutos();

            if (produtosDoCarrinho.isEmpty()) {
                System.out.println("O carrinho de compras está vazio.");
            } else {
                System.out.println("Produtos no carrinho de compras:");

                for (Produto produto : produtosDoCarrinho) {
                    System.out.println("- " + produto.getNome() + " - Quantidade: " + produto.getQuantidade() + " - Preço: R$" + produto.getPreco());
                }

                System.out.println("Valor total do carrinho de compras: R$" + carrinhoDeCompra.calcularValorTotal());
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
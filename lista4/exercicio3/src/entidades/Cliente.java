package entidades;

public class Cliente {
    private static int totalContasCriadas = 0;

    private String nome;
    private String email;
    private String cpf;
    private String endereco;
    private CarrinhoDeCompra carrinhoDeCompra;

    public Cliente(String nome, String email, String cpf, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.carrinhoDeCompra = new CarrinhoDeCompra();
        totalContasCriadas++;
    }

    public static int getTotalContasCriadas() {
        return totalContasCriadas;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public CarrinhoDeCompra getCarrinhoDeCompra() {
        return carrinhoDeCompra;
    }
}
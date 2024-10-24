package Model.Pessoas;

public class Cliente extends Pessoa {

    public Cliente(String nome, String endereco) {
        super(nome, endereco);
    }

    public String getNomeCliente() {
        return super.getNome();
    }

    public void setNomeCliente(String nome) {
        super.setNome(nome);
    }

    public String getEnderecoCliente() {
        return super.getEndereco();
    }

    public void setEnderecoCliente(String endereco) {
        super.setEndereco(endereco);
    }
}

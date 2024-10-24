package Model.Solicitacao;

import Model.Instrumentos.Instrumento;
import Model.Pessoas.Cliente;
import Model.Pessoas.Funcionario;

public class Solicitacao {
    String codigoServico;
    String tipoServico;
    String descricaoServico;
    String dataServico;
    String statusServico;

    Cliente cliente;
    Instrumento instrumento;
    Funcionario funcionario;

    public Solicitacao( String codigoServico, String tipoServico, String nomeCliente , String enderecoCliente , String tipoDeInstrumento , String marcaDoInstrumento , String modeloDoInstrumento, String nomeDoFuncionario ,String descricaoServico, String dataServico, String statusServico) {
        this.codigoServico = codigoServico;
        this.tipoServico = tipoServico;
        this.cliente =  new Cliente(nomeCliente, enderecoCliente);
        this.instrumento = new Instrumento(tipoDeInstrumento, marcaDoInstrumento, modeloDoInstrumento);
        this.funcionario = new Funcionario(nomeDoFuncionario);
        this.descricaoServico = descricaoServico;
        this.dataServico = dataServico;
        this.statusServico =  statusServico;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getDataServico() {
        return dataServico;
    }

    public void setDataServico(String dataServico) {
        this.dataServico = dataServico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}

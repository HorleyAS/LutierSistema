package Controller;

import Model.Solicitacao.Solicitacao;

public interface IRepositorioOrdens {
    void salvarSolicitacao(Solicitacao solicitacao);
    void buscaSolicitacao(String codigoServico);
    void alteraSolicitacao(Solicitacao solicitacao, String codigoServicoOriginal);
}

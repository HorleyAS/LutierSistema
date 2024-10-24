package Controller;

import Model.Solicitacao.Solicitacao;
import View.TelaEditaOS;
import javax.swing.*;
import java.sql.*;
import java.awt.Window;


public class SolicitacaoController implements IRepositorioOrdens{

    String url = "jdbc:mysql://localhost:3306/LUTHIER";
    String user = "root";
    String password = "root";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Falha de conexão ao banco de dados" + e.getMessage(), "AVISO", JOptionPane.PLAIN_MESSAGE);
        }
        return conn;
    }

    public void salvarSolicitacao(Solicitacao solicitacao) {
        String consultaSQL = "insert into ordem_servico (codigoServico, tipoServico, nomeCliente, enderecoCliente, tipoDeInstrumento, marcaDoinstrumento, modeloDoInstrumento, nomeFuncionario, descricaoServico, dataPrevista, statusServico ) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = this.connect();
             PreparedStatement salvaOS = conn.prepareStatement(consultaSQL)) {
            String consultaSQL2 = "select * from ordem_servico where codigoServico = ?";
            PreparedStatement verificaOS = conn.prepareStatement(consultaSQL2);
            verificaOS.setString(1, solicitacao.getCodigoServico());
            ResultSet dadosVerificaOS = verificaOS.executeQuery();


            if(dadosVerificaOS.next()){
                JOptionPane.showMessageDialog(null, "Um chamado com esse código já existe", "AVISO", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                    salvaOS.setString(1, solicitacao.getCodigoServico());
                    salvaOS.setString(2, solicitacao.getTipoServico());
                    salvaOS.setString(3, solicitacao.getCliente().getNome());
                    salvaOS.setString(4, solicitacao.getCliente().getEndereco());
                    salvaOS.setString(5, solicitacao.getInstrumento().getTipoInstrumento());
                    salvaOS.setString(6, solicitacao.getInstrumento().getMarcaDoInstrumento());
                    salvaOS.setString(7, solicitacao.getInstrumento().getModeloDoInstrumento());
                    salvaOS.setString(8, solicitacao.getFuncionario().getNome());
                    salvaOS.setString(9, solicitacao.getDescricaoServico());
                    salvaOS.setString(10, solicitacao.getDataServico());
                    salvaOS.setString(11, solicitacao.getStatusServico());
                    salvaOS.executeUpdate();
                JOptionPane.showMessageDialog(null,
                        "O instrumento " + solicitacao.getInstrumento().getModeloDoInstrumento() + " em nome de " + solicitacao.getCliente().getNome() + " tem previsão de entrega " + solicitacao.getDataServico() + " segundo a solicitação " + solicitacao.getCodigoServico() + ".", "Notificação", JOptionPane.PLAIN_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a solicitação " + e.getMessage(), "AVISO", JOptionPane.PLAIN_MESSAGE);
        }
    }


    public void buscaSolicitacao(String buscaSolicitacao) {
        try (Connection conn = this.connect();) {
            String consultaSQL = "select * from ordem_servico where codigoServico = ?";
            PreparedStatement verificaOS = conn.prepareStatement(consultaSQL);
            verificaOS.setString(1, buscaSolicitacao);
            ResultSet dadosVerificaOS = verificaOS.executeQuery();

            if(dadosVerificaOS.next()){


                TelaEditaOS tela = new TelaEditaOS();
                tela.defineTexto(
                        dadosVerificaOS.getString("codigoServico"),
                        dadosVerificaOS.getString("tipoServico"),
                        dadosVerificaOS.getString("nomeCliente"),
                        dadosVerificaOS.getString("enderecoCliente"),
                        dadosVerificaOS.getString("tipoDeInstrumento"),
                        dadosVerificaOS.getString("marcaDoInstrumento"),
                        dadosVerificaOS.getString("modeloDoInstrumento"),
                        dadosVerificaOS.getString("nomeFuncionario"),
                        dadosVerificaOS.getString("descricaoServico"),
                        dadosVerificaOS.getString("dataPrevista"),
                        dadosVerificaOS.getString("statusServico"));

                Window[] telaaberta = Window.getWindows();
                telaaberta[1].dispose();

            }
            else{
                JOptionPane.showMessageDialog(null, "Um chamado com esse código não existe", "AVISO", JOptionPane.PLAIN_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a solicitação " + e.getMessage(), "AVISO", JOptionPane.PLAIN_MESSAGE);
        }
    }
    public void alteraSolicitacao(Solicitacao solicitacao, String codigoServicoOriginal) {
        String sql = "update ordem_servico set codigoServico = ?, tipoServico = ?, nomeCliente = ?, enderecoCliente = ?, tipoDeInstrumento = ?, marcaDoinstrumento = ?, modeloDoInstrumento = ?, nomeFuncionario = ?, descricaoServico = ? , dataPrevista = ? , statusServico = ? where codigoServico = ?";

        try (Connection conn = this.connect();
             PreparedStatement alteraOS = conn.prepareStatement(sql)) {

            alteraOS.setString(1, solicitacao.getCodigoServico());
            alteraOS.setString(2, solicitacao.getTipoServico());
            alteraOS.setString(3, solicitacao.getCliente().getNome());
            alteraOS.setString(4, solicitacao.getCliente().getEndereco());
            alteraOS.setString(5, solicitacao.getInstrumento().getTipoInstrumento());
            alteraOS.setString(6, solicitacao.getInstrumento().getMarcaDoInstrumento());
            alteraOS.setString(7, solicitacao.getInstrumento().getModeloDoInstrumento());
            alteraOS.setString(8, solicitacao.getFuncionario().getNome());
            alteraOS.setString(9, solicitacao.getDescricaoServico());
            alteraOS.setString(10, solicitacao.getDataServico());
            alteraOS.setString(12, codigoServicoOriginal);
            alteraOS.setString(11, solicitacao.getStatusServico());


            alteraOS.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "O instrumento " + solicitacao.getInstrumento().getModeloDoInstrumento() + " em nome de " + solicitacao.getCliente().getNome() + " tem previsão de entrega " + solicitacao.getDataServico() + " segundo a solicitação " + solicitacao.getCodigoServico() + " com o status de " +solicitacao.getStatusServico(), "Chamado Alterado!", JOptionPane.PLAIN_MESSAGE);


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a solicitação " + e.getMessage(), "AVISO", JOptionPane.PLAIN_MESSAGE);
        }
    }
    }


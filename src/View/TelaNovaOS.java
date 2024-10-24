package View;

import Controller.SolicitacaoController;
import Model.Solicitacao.Solicitacao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.StrokeBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;


public class TelaNovaOS extends JFrame implements ActionListener {

    JFrame TelaNovaOS = new JFrame();
    JButton botaoTelaInicial;
    JButton botaoSubmeter;
    JTextField codigoSercico, textoTipo, textoNomeCliente, textoEnderecoCliente, textoTipoDeInstrumento, marcaDoInstrumento, textoModeloDoInstrumento, textoNomeDoFuncionario, textoDescricao, textoDataPrevista, textoStatusServico;

    public TelaNovaOS(){

        ImageIcon logoIcon = new ImageIcon("src/View/icon_do_app.png");
        this.setIconImage(logoIcon.getImage());
        this.setBackground(new Color(0xF0F0F0));
        Color Azul1 = new Color(0x007290);

        botaoTelaInicial = new JButton();
        botaoTelaInicial.setBounds(10,10, 350, 350);
        botaoTelaInicial.setFocusable(false);
        botaoTelaInicial.setText("Voltar");
        botaoTelaInicial.setBackground(Azul1);
        botaoTelaInicial.setForeground(Color.white);
        botaoTelaInicial.addActionListener(this);

        JLabel logoTelaNovaOS = new JLabel();
        ImageIcon logoImageIcon = new ImageIcon("src/View/MUSICISTA.png");
        Image logoimage1 = logoImageIcon.getImage();
        Image logoimage2 = logoimage1.getScaledInstance(300, 300,  Image.SCALE_AREA_AVERAGING);
        logoImageIcon = new ImageIcon(logoimage2);
        logoTelaNovaOS.setIcon(logoImageIcon);
        logoTelaNovaOS.setHorizontalAlignment(JLabel.LEFT);
        logoTelaNovaOS.setVerticalAlignment(JLabel.CENTER);

        this.setTitle("Nova Ordem de Serviço");
        this.setSize(1200,800);
//        this.setLayout(new FlowLayout());
//        this.pack();


        this.codigoSercico = new JTextField();
        codigoSercico.setPreferredSize(new Dimension(250,40));
        codigoSercico.setBorder(new LineBorder(Azul1,2));
        codigoSercico.setSize(50,50);


        this.textoTipo = new JTextField();
        textoTipo.setPreferredSize(new Dimension(250,40));
        textoTipo.setBorder(new LineBorder(Azul1,2));
        textoTipo.setSize(50,50);

        this.textoNomeCliente = new JTextField();
        textoNomeCliente.setPreferredSize(new Dimension(250,40));
        textoNomeCliente.setBorder(new LineBorder(Azul1,2));
        textoNomeCliente.setSize(50,50);

        this.textoEnderecoCliente = new JTextField();
        textoEnderecoCliente.setPreferredSize(new Dimension(250,40));
        textoEnderecoCliente.setBorder(new LineBorder(Azul1,2));
        textoEnderecoCliente.setSize(50,50);

        this.textoTipoDeInstrumento = new JTextField();
        textoTipoDeInstrumento.setPreferredSize(new Dimension(250,40));
        textoTipoDeInstrumento.setBorder(new LineBorder(Azul1,2));
        textoTipoDeInstrumento.setSize(50,50);

        this.marcaDoInstrumento = new JTextField();
        marcaDoInstrumento.setPreferredSize(new Dimension(250,40));
        marcaDoInstrumento.setBorder(new LineBorder(Azul1,2));
        marcaDoInstrumento.setSize(50,50);

        this.textoModeloDoInstrumento = new JTextField();
        textoModeloDoInstrumento.setPreferredSize(new Dimension(250,40));
        textoModeloDoInstrumento.setBorder(new LineBorder(Azul1,2));
        textoModeloDoInstrumento.setSize(50,50);

        this.textoDescricao = new JTextField();
        textoDescricao.setPreferredSize(new Dimension(250,40));
        textoDescricao.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        textoDescricao.setBorder(new LineBorder(Azul1,2));

        this.textoNomeDoFuncionario = new JTextField();
        textoNomeDoFuncionario.setPreferredSize(new Dimension(250,40));
        textoNomeDoFuncionario.setBorder(new LineBorder(Azul1,2));
        textoNomeDoFuncionario.setSize(50,50);

        this.textoDataPrevista= new JTextField();
        textoDataPrevista.setPreferredSize(new Dimension(250,40));
        textoDataPrevista.setBorder(new LineBorder(Azul1,2));
        textoDataPrevista.setSize(50,50);

        this.textoStatusServico = new JTextField();
        textoStatusServico.setPreferredSize(new Dimension(250, 40));
        textoStatusServico.setBorder(new LineBorder(Azul1, 2));
        textoStatusServico.setSize(50, 50);

        this.botaoSubmeter = new JButton();
        botaoSubmeter.setBounds(10,10, 350, 350);
        botaoSubmeter.setFocusable(false);
        botaoSubmeter.setText("Submeter");
        botaoSubmeter.setBackground(Azul1);
        botaoSubmeter.setForeground(Color.white);
        botaoSubmeter.addActionListener(this);



        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));


        panel2.add(Box.createRigidArea(new Dimension(0, 50)));
        panel2.add(new JLabel("Codigo do Serviço"){{
            setForeground(Azul1);         }});
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(codigoSercico);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(new JLabel("Tipo de Serviço"){{
            setForeground(Azul1);         }});
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(textoTipo);
        panel2.add(Box.createRigidArea(new Dimension(0, 20)));
        panel2.add(new JLabel("Nome do Cliente"){{
            setForeground(Azul1);         }});
        panel2.add(textoNomeCliente);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(new JLabel("Endereço do Cliente"){{
            setForeground(Azul1);         }});
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(textoEnderecoCliente);
        panel2.add(Box.createRigidArea(new Dimension(0, 20)));
        panel2.add(new JLabel("Tipo de Instrumento"){{
            setForeground(Azul1);         }});
        panel2.add(textoTipoDeInstrumento);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(new JLabel("Marca do Instrumento"){{
            setForeground(Azul1);         }});
        panel2.add(marcaDoInstrumento);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(new JLabel("Modelo do Instrumento"){{
            setForeground(Azul1);         }});
        panel2.add(textoModeloDoInstrumento);
        panel2.add(Box.createRigidArea(new Dimension(0, 20)));
        panel2.add(new JLabel("Descrição da Solicitação"){{
            setForeground(Azul1);         }});
        panel2.add(textoDescricao);
        panel2.add(Box.createRigidArea(new Dimension(0, 20)));
        panel2.add(new JLabel("Nome do Funcionário"){{
            setForeground(Azul1);         }});
        panel2.add(textoNomeDoFuncionario);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(new JLabel("Data prevista de Entrega"){{
            setForeground(Azul1);         }});
        panel2.add(textoDataPrevista);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(new JLabel("Status do servico:"){{
            setForeground(Azul1);         }});
        panel2.add(textoStatusServico);
        panel2.add(Box.createRigidArea(new Dimension(0, 5)));
        panel2.add(botaoSubmeter);
        panel2.add(Box.createRigidArea(new Dimension(0, 50)));

        panel1.add(Box.createRigidArea(new Dimension(0, 200)));
        panel1.add(logoTelaNovaOS);
        panel2.add(Box.createRigidArea(new Dimension(0, 100)));

        panel4.add(botaoTelaInicial);

        this.setLayout(new GridLayout(1, 4, 0, 10));
        this.add(panel4);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == botaoTelaInicial) {

            TelaInicial telainicial = new TelaInicial();
        }
        if (e.getSource() == botaoSubmeter) {
            String salvacodigoSercico = codigoSercico.getText();
            String salvaTextoTipo = textoTipo.getText();
            String salvaTextoNomeCliente = textoNomeCliente.getText();
            String salvaTextoEnderecoCliente = textoEnderecoCliente.getText();
            String salvaTextoTipoDeInstrumento = textoTipoDeInstrumento.getText();
            String salvaMarcaDoInstrumento = marcaDoInstrumento.getText();
            String salvaTextoModeloDoInstrumento = textoModeloDoInstrumento.getText();
            String salvaTextoNomeDoFuncionario = textoNomeDoFuncionario.getText();
            String salvaTextoDescricao = textoDescricao.getText();
            String salvaTextoDataPrevista = textoDataPrevista.getText();
            String salvatextoStatusServico = textoStatusServico.getText();

            Solicitacao salvaSolicitacao = new Solicitacao( salvacodigoSercico, salvaTextoTipo, salvaTextoNomeCliente , salvaTextoEnderecoCliente , salvaTextoTipoDeInstrumento , salvaMarcaDoInstrumento ,  salvaTextoModeloDoInstrumento,salvaTextoNomeDoFuncionario ,salvaTextoDescricao, salvaTextoDataPrevista, salvatextoStatusServico);
            SolicitacaoController sc = new SolicitacaoController();
            sc.salvarSolicitacao(salvaSolicitacao);



        }
    }
}

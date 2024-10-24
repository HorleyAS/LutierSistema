package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TelaInicial extends JFrame implements ActionListener{

    JButton novaOS;
    JButton editaOS;

    public TelaInicial(){

        ImageIcon logoIcon = new ImageIcon("src/View/icon_do_app.png");
        this.setIconImage(logoIcon.getImage());
        this.getContentPane().setBackground(new Color(0x007290));

        JLabel logoTelaInicial = new JLabel();
        ImageIcon logoImageIcon = new ImageIcon("src/View/logo.png");
        Image logoimage1 = logoImageIcon.getImage();
        Image logoimage2 = logoimage1.getScaledInstance(400, 400,  Image.SCALE_AREA_AVERAGING);
        logoImageIcon = new ImageIcon(logoimage2);
        logoTelaInicial.setIcon(logoImageIcon);
        logoTelaInicial.setHorizontalAlignment(JLabel.CENTER);
        logoTelaInicial.setVerticalAlignment(JLabel.TOP);

        novaOS = new JButton();
        novaOS.setBounds(0,0, 250, 250);
        novaOS.setFocusable(false);
        novaOS.setOpaque(false);
        novaOS.setContentAreaFilled(false);
        novaOS.setBorderPainted(false);
        novaOS.setVerticalAlignment(JButton.TOP);
        ImageIcon iconNovaOS = new ImageIcon("src/View/NOVO.png");
        Image nova = iconNovaOS.getImage();
        Image nova2 = nova.getScaledInstance(200, 200,  Image.SCALE_AREA_AVERAGING);
        iconNovaOS = new ImageIcon(nova2);
        Image nova3 = nova.getScaledInstance(205, 205,  Image.SCALE_AREA_AVERAGING);
        ImageIcon iconNovaOS2 = new ImageIcon(nova3);
        novaOS.setPressedIcon(iconNovaOS2);
        novaOS.setIcon(iconNovaOS);
        novaOS.addActionListener(this);

        editaOS = new JButton();
        editaOS.setBounds(0,0, 250, 250);
        editaOS.setFocusable(false);
        editaOS.setOpaque(false);
        editaOS.setContentAreaFilled(false);
        editaOS.setBorderPainted(false);
        editaOS.setVerticalAlignment(JButton.TOP);
        ImageIcon iconeditaOS = new ImageIcon("src/View/edita.png");
        Image novaeditaOS = iconeditaOS.getImage();
        Image novaeditaOS2 = novaeditaOS.getScaledInstance(200, 200,  Image.SCALE_AREA_AVERAGING);
        iconeditaOS = new ImageIcon(novaeditaOS2);
        Image novaeditaOS3 = novaeditaOS.getScaledInstance(205, 205,  Image.SCALE_AREA_AVERAGING);
        ImageIcon iconeditaOS2 = new ImageIcon(novaeditaOS3);
        editaOS.setPressedIcon(iconeditaOS2);
        editaOS.setIcon(iconeditaOS);
        editaOS.addActionListener(this);

        JLabel textodev = new JLabel();
        textodev.setText("desenvolvido por hrly");
        textodev.setForeground(Color.white);


        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        panel1.setBackground(new Color(0x007290));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel2.setBackground(new Color(0x007290));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        panel3.setBackground(new Color(0x007290));


        panel1.add(logoTelaInicial);
        panel2.add(novaOS);
        panel2.add(editaOS);
        panel3.add(textodev);
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);



        this.setTitle("Luthier+");
        this.setSize(1200,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == novaOS) {
            dispose();
            TelaNovaOS telaNovaOS = new TelaNovaOS();
        } else if (e.getSource() == editaOS) {
            dispose();
            TelaEditaOS telaEditaOS = new TelaEditaOS();
        }
    }

}

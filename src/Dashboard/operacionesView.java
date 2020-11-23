package Dashboard;

import javax.swing.*;

public class operacionesView {
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JButton agregarButton;
    private JLabel estadoLabel;
    private JLabel numeroDeCertificadoLabel;
    private JLabel nombreLabel;
    private JLabel cantidadDeOperacionesLabel;
    private JLabel importeLabel;
    private JLabel numeroDeOperacionLabel;
    private JLabel fechaLabel;
    private JTextField numeroDeOperacionTextField1;
    private JTextField nombreTextField1;
    private JTextArea textArea9;
    private JTextField estadoTextField;
    private JTextField numeroDeCertificadoTextField1;
    private JTextArea textArea10;
    private JTextField cantidadDeOperacionesTextField1;
    private JTextArea textArea11;
    private JTextArea textArea12;
    private JTextField importeTextField1;
    private JTextArea textArea13;
    private JTextField fechaTextField1;
    private JTextArea textArea14;
    private JTextField ingreseElNumeroDeTextField;
    private JTextArea textArea16;
    private JCheckBox estaSeguroCheckBox;
    private JButton borrarButton;
    private JButton editarButton;
    private JTextArea textArea8;
    private JPanel operacionesPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;

    private static JFrame operacionesFrame = new JFrame("Operaciones");

    public static void newOperacionesFrame(){
        operacionesFrame.setContentPane(new operacionesView().operacionesPanel);
        operacionesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        operacionesFrame.pack();
        operacionesFrame.setVisible(true);
    }
}

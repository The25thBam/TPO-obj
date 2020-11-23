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
    private JLabel numeroDeOperacionLabel1;
    private JLabel nombreLabel1;
    private JLabel estadoLabel1;
    private JLabel numeroDeCertificadoLabel1;
    private JLabel cantidadDeOperacionesLabel1;
    private JLabel importeLabel1;
    private JLabel fechaLabel1;
    private JLabel ingreseElNumeroDeLabel;
    private JCheckBox estaSeguroCheckBox;
    private JButton borrarButton;
    private JButton editarButton;
    private JPanel operacionesPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JButton agregarButton1;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;

    private static JFrame operacionesFrame = new JFrame("Operaciones");

    public static void newOperacionesFrame(){
        operacionesFrame.setContentPane(new operacionesView().operacionesPanel);
        operacionesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        operacionesFrame.pack();
        operacionesFrame.setVisible(true);
    }
}

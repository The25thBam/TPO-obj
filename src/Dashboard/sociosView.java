package Dashboard;

import SocioPackage.SocioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sociosView {
    private JTabbedPane tabbedPane1;
    private JPanel sociosPanel;
    private JTextField CUITTextField1;
    private JTextArea textArea1;
    private JTextField razonSocialTextField;
    private JTextArea textArea2;
    private JTextField fechaInicioTextField;
    private JTextArea textArea3;
    private JTextField tipoTextField;
    private JTextArea textArea4;
    private JTextField actividadPrincipalTextField;
    private JTextArea textArea5;
    private JTextField direccionTextField;
    private JTextArea textArea6;
    private JTextField telefonoTextField;
    private JTextArea textArea7;
    private JTextField correoTextField;
    private JTextArea textArea8;
    private JTextField estadoTextField;
    private JCheckBox estaAprobadoCheckBox;
    private JComboBox comboBox1;
    private JTextField CUITTextField;
    private JTextField razonSocialTextField1;
    private JTextArea textArea9;
    private JTextField fechaInicioTextField1;
    private JTextField tipoTextField1;
    private JTextArea textArea10;
    private JTextField actividadPrincipalTextField1;
    private JTextArea textArea11;
    private JTextArea textArea12;
    private JTextField direccionTextField1;
    private JTextArea textArea13;
    private JTextField telefonoTextField1;
    private JTextArea textArea14;
    private JTextField correoTextField1;
    private JTextField estadoTextField1;
    private JTextArea textArea15;
    private JCheckBox estaAprobadoCheckBox1;
    private JButton editarButton;
    private JTextField ingreseElCUITTextField;
    private JTextArea textArea16;
    private JCheckBox estaSeguroCheckBox;
    private JButton borrarButton;
    private JList list1;
    private JButton agregarButton;

    private static JFrame sociosFrame = new JFrame("Socios");

    public sociosView() {
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Test: " + textArea1.getText());
                //System.out.println("Test: " + estaAprobadoCheckBox.isSelected());
                SocioController.addSocio(textArea1.getText(),textArea2.getText(),textArea3.getText(),textArea4.getText(),textArea5.getText(),textArea6.getText(),textArea7.getText(),textArea8.getText(),estaAprobadoCheckBox.isSelected());
            }
        });
    }

    public static void newSociosFrame(){
        sociosFrame.setContentPane(new sociosView().sociosPanel);
        sociosFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sociosFrame.pack();
        sociosFrame.setVisible(true);
    }
}

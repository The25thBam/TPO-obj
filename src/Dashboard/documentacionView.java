package Dashboard;

import javax.swing.*;

public class documentacionView {
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JLabel estadoLabel;
    private JLabel tipoLabel;
    private JTextField ingreseNombreDelArchivoTextField;
    private JCheckBox estaSeguroCheckBox;
    private JButton borrarButton;
    private JButton cargarArchivoButton;
    private JButton agregarButton;
    private JPanel documentacionPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    private static JFrame documentacionFrame = new JFrame("Documentacion");

    public static void newDocumentacionFrame(){
        documentacionFrame.setContentPane(new documentacionView().documentacionPanel);
        documentacionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        documentacionFrame.pack();
        documentacionFrame.setVisible(true);
    }
}

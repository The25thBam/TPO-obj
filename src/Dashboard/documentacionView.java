package Dashboard;

import javax.swing.*;

public class documentacionView {
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JTextField textArea1;
    private JLabel estadoLabel;
    private JTextField textArea2;
    private JLabel tipoLabel;
    private JTextField ingreseNombreDelArchivoTextField;
    private JTextArea textArea16;
    private JCheckBox estaSeguroCheckBox;
    private JButton borrarButton;
    private JButton cargarArchivoButton;
    private JButton agregarButton;
    private JPanel documentacionPanel;

    private static JFrame documentacionFrame = new JFrame("Documentacion");

    public static void newDocumentacionFrame(){
        documentacionFrame.setContentPane(new documentacionView().documentacionPanel);
        documentacionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        documentacionFrame.pack();
        documentacionFrame.setVisible(true);
    }
}

package Dashboard;

import javax.swing.*;

public class otrosView {
    private JPanel otrosPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private static JFrame otrosFrame = new JFrame("Otros");

    public static void newOtrosFrame(){
        otrosFrame.setContentPane(new otrosView().otrosPanel);
        otrosFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        otrosFrame.pack();
        otrosFrame.setVisible(true);
    }
}

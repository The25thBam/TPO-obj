package Dashboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homeView {
    private JTextField homeTextField;
    private JButton sociosButton;
    private JButton operacionesButton;
    private JButton documentacionButton;
    private JButton otrosButton;
    private JPanel homePanel;

    private static JFrame homeFrame = new JFrame("Home");

    public homeView() {
        sociosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                sociosView.newSociosFrame();
            }
        });
        operacionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                operacionesView.newOperacionesFrame();
            }
        });
        documentacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                documentacionView.newDocumentacionFrame();
            }
        });
        otrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeFrame.setVisible(false);
                otrosView.newOtrosFrame();
            }
        });
    }

    public static void main(String[] args){
        System.out.println("Test");
        homeFrame.setContentPane(new homeView().homePanel);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.pack();
        homeFrame.setVisible(true);
    }

}

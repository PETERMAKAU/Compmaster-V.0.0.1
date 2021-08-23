/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author peter
 */
public class ClockPanel extends JPanel { 
    private final JLabel current;

    public ClockPanel() {
        current = new JLabel(now());
        add(current);

        new Timer (1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                current.setText(now());
            }
        }).start();
    }

    private static String now() {
        // implement your own
        return new Date().toString();
    }

    public static void main(String[] args) {
        JFrame main = new JFrame("Simple Clock");
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(200, 200);
        main.setContentPane(new ClockPanel());
        main.setVisible(true);
    }
}
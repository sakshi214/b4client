package com.ehelpy.brihaspati4.authenticate;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Emailid_exist {
    private JFrame frame;
    public static void id_exist() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Emailid_exist window = new Emailid_exist();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Emailid_exist() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JLabel lblNewLabel = new JLabel("Certificate with Given EmailID Exists \n ");
        lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(43, 44, 329, 35);
        frame.getContentPane().add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel(" For Further Query Contact Network Administartor");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(12, 96, 408, 44);
        frame.getContentPane().add(lblNewLabel_1);
        JButton btnNewButton = new JButton("OK");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnNewButton.setBounds(156, 188, 97, 25);
        frame.getContentPane().add(btnNewButton);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tickettest;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author reyza ivana yolanda
 */
public class Login extends javax.swing.JFrame {
    Connect con = new Connect ();
    public Login() {
        initComponents();
    }
    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftInputPanel = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        headline = new javax.swing.JLabel();
        signupPanel = new javax.swing.JPanel();
        signUpButton = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        inpUsername = new javax.swing.JTextField();
        userText = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordText = new javax.swing.JLabel();
        inpPassword = new javax.swing.JPasswordField();
        loginPanel = new javax.swing.JPanel();
        loginButtoin = new javax.swing.JButton();
        rightPicturePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        leftInputPanel.setPreferredSize(new java.awt.Dimension(400, 0));

        welcomePanel.setPreferredSize(new java.awt.Dimension(400, 100));

        headline.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headline.setText("Welcome To Fantastix");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(headline)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(headline)
                .addGap(10, 10, 10))
        );

        leftInputPanel.add(welcomePanel);

        signupPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        signUpButton.setText("Sign Up For Free");
        signUpButton.setPreferredSize(new java.awt.Dimension(250, 30));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        signupPanel.add(signUpButton);

        leftInputPanel.add(signupPanel);

        infoPanel.setPreferredSize(new java.awt.Dimension(400, 120));

        userPanel.setPreferredSize(new java.awt.Dimension(250, 40));
        userPanel.setLayout(new java.awt.BorderLayout());
        userPanel.add(inpUsername, java.awt.BorderLayout.CENTER);

        userText.setText("Username");
        userPanel.add(userText, java.awt.BorderLayout.PAGE_START);

        infoPanel.add(userPanel);

        passwordPanel.setPreferredSize(new java.awt.Dimension(250, 40));
        passwordPanel.setLayout(new java.awt.BorderLayout());

        passwordText.setText("Password");
        passwordPanel.add(passwordText, java.awt.BorderLayout.PAGE_START);
        passwordPanel.add(inpPassword, java.awt.BorderLayout.CENTER);

        infoPanel.add(passwordPanel);

        leftInputPanel.add(infoPanel);

        loginPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        loginButtoin.setText("Login");
        loginButtoin.setPreferredSize(new java.awt.Dimension(250, 30));
        loginButtoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtoinActionPerformed(evt);
            }
        });
        loginPanel.add(loginButtoin);

        leftInputPanel.add(loginPanel);

        getContentPane().add(leftInputPanel, java.awt.BorderLayout.WEST);

        rightPicturePanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPicturePanel.setPreferredSize(new java.awt.Dimension(400, 0));
        rightPicturePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/18966075 (Custom).jpg"))); // NOI18N
        rightPicturePanel.add(jLabel1);

        getContentPane().add(rightPicturePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Register newUser = new Register ();
        newUser.setVisible(true);
        
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void loginButtoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtoinActionPerformed
        try {
            String query  = "SELECT * FROM usertable WHERE Username = '" + inpUsername.getText() + 
                "' and Password = '" + inpPassword.getText()+ "'";
        
            ResultSet rs = con.executeQuery(query);
          if(rs.next ()){
               JOptionPane.showMessageDialog(null, "Login Successfully");
               this.dispose();
               mainMenu menu = new mainMenu ();
               menu.SetUserID(rs.getString("UserId"));
               menu.setVisible(true);
           }else{
               JOptionPane.showMessageDialog(null, "Wrong Username or Password");
               inpPassword.requestFocus();
           }
        
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }    
    }//GEN-LAST:event_loginButtoinActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headline;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPasswordField inpPassword;
    private javax.swing.JTextField inpUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftInputPanel;
    private javax.swing.JButton loginButtoin;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel passwordText;
    private javax.swing.JPanel rightPicturePanel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel userText;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
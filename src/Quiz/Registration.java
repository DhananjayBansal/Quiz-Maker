/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.awt.Color;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class Registration extends javax.swing.JFrame {
ConnectionClass cobj;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        cobj=new ConnectionClass();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        usernamejLabel2 = new javax.swing.JLabel();
        emailjLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerjButton1 = new javax.swing.JButton();
        resetjButton2 = new javax.swing.JButton();
        usernamejTextField1 = new javax.swing.JTextField();
        emailjTextField2 = new javax.swing.JTextField();
        errjLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phjTextField1 = new javax.swing.JTextField();
        pajPasswordField1 = new javax.swing.JPasswordField();
        copajPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registration");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration");

        usernamejLabel2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        usernamejLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamejLabel2.setText("Username");

        emailjLabel3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        emailjLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailjLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password");

        registerjButton1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        registerjButton1.setText("Register");
        registerjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerjButton1ActionPerformed(evt);
            }
        });

        resetjButton2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        resetjButton2.setText("Reset");
        resetjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetjButton2ActionPerformed(evt);
            }
        });

        errjLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel2.setText("Phone No.");

        phjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phjTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(usernamejLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(registerjButton1)
                        .addGap(43, 43, 43)
                        .addComponent(resetjButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(copajPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailjLabel3)
                                    .addComponent(jLabel4))
                                .addGap(185, 185, 185)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pajPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamejLabel2)
                    .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(emailjLabel3))
                    .addComponent(emailjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pajPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(copajPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerjButton1)
                    .addComponent(resetjButton2))
                .addGap(11, 11, 11)
                .addComponent(errjLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phjTextField1ActionPerformed

    private void registerjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerjButton1ActionPerformed
        // TODO add your handling code here
        
        errjLabel2.setForeground(Color.red);
        if(usernamejTextField1.getText().equals(""))
        {errjLabel2.setText("Enter Name");}
        else if(emailjTextField2.getText().equals(""))
            errjLabel2.setText("Enter Email");
        else if(pajPasswordField1.getText().equals(""))
            errjLabel2.setText("Enter Password");
        else if (copajPasswordField2.getText().equals(""))
            errjLabel2.setText("Enter Confirm Password");
        else if(phjTextField1.getText().equals(""))
        { errjLabel2.setText("Enter PhoneNo.");}
        
        else if (!pajPasswordField1.getText().equals(copajPasswordField2.getText()))
            errjLabel2.setText("Password and Confirm Password are not matching");
        else{
            String x=emailjTextField2.getText();
         int atpos=x.indexOf("@");
        int dotpos=x.lastIndexOf(".");
       if (atpos<1||dotpos<atpos+2||dotpos+2>=x.length())
           errjLabel2.setText("Not a valid e-mail address");  
            else{
            cobj.Connect();
            try{
                pst=cobj.con.prepareCall("{call InsRegister(?,?,?,?)}");
                pst.setString(1,usernamejTextField1.getText());
                pst.setString(2,emailjTextField2.getText());
                pst.setString(3,pajPasswordField1.getText());
                pst.setLong(4,Long.parseLong(phjTextField1.getText()));
                if(pst.execute()==false)
                {
                    if(pst.getUpdateCount()>0)
                    {
                        errjLabel2.setForeground(Color.green);
            errjLabel2.setText("Registered Successfully");
            usernamejTextField1.setText("");
        emailjTextField2.setText("");
        pajPasswordField1.setText("");
        copajPasswordField2.setText("");
        phjTextField1.setText("");
            Player_Login pl=new Player_Login();
        pl.setVisible(true);
                    }
                    else{
                        errjLabel2.setText("This Username already exists");
                    }        
                }
            }
            catch(Exception ex)
            {
                System.out.print("Error in Register"+ex);
            }
                
            cobj.DisConnect();
            }}
    }//GEN-LAST:event_registerjButton1ActionPerformed

    private void resetjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetjButton2ActionPerformed
        // TODO add your handling code here:
        errjLabel2.setText("");
        usernamejTextField1.setText("");
        emailjTextField2.setText("");
        pajPasswordField1.setText("");
        copajPasswordField2.setText("");
        phjTextField1.setText("");
    }//GEN-LAST:event_resetjButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField copajPasswordField2;
    private javax.swing.JLabel emailjLabel3;
    private javax.swing.JTextField emailjTextField2;
    private javax.swing.JLabel errjLabel2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pajPasswordField1;
    private javax.swing.JTextField phjTextField1;
    private javax.swing.JButton registerjButton1;
    private javax.swing.JButton resetjButton2;
    private javax.swing.JLabel usernamejLabel2;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}
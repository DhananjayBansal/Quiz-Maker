/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author Admin
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminjMenuBar1 = new javax.swing.JMenuBar();
        adminjMenu1 = new javax.swing.JMenu();
        adminjMenuItem1 = new javax.swing.JMenuItem();
        adminjMenuItem2 = new javax.swing.JMenuItem();
        masterjMenu2 = new javax.swing.JMenu();
        masterjMenuItem3 = new javax.swing.JMenuItem();
        masterjMenuItem4 = new javax.swing.JMenuItem();
        reportjMenu3 = new javax.swing.JMenu();
        reportjMenuItem5 = new javax.swing.JMenuItem();
        reportjMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMIN");
        setFocusTraversalPolicyProvider(true);

        adminjMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        adminjMenu1.setText("Admin");

        adminjMenuItem1.setText("Change Password");
        adminjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminjMenuItem1ActionPerformed(evt);
            }
        });
        adminjMenu1.add(adminjMenuItem1);

        adminjMenuItem2.setText("Exit");
        adminjMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminjMenuItem2ActionPerformed(evt);
            }
        });
        adminjMenu1.add(adminjMenuItem2);

        adminjMenuBar1.add(adminjMenu1);

        masterjMenu2.setText("Master");
        masterjMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterjMenu2ActionPerformed(evt);
            }
        });

        masterjMenuItem3.setText("Categories");
        masterjMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterjMenuItem3ActionPerformed(evt);
            }
        });
        masterjMenu2.add(masterjMenuItem3);

        masterjMenuItem4.setText("Questions");
        masterjMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterjMenuItem4ActionPerformed(evt);
            }
        });
        masterjMenu2.add(masterjMenuItem4);

        adminjMenuBar1.add(masterjMenu2);

        reportjMenu3.setText("Report");

        reportjMenuItem5.setText("Registrations");
        reportjMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportjMenuItem5ActionPerformed(evt);
            }
        });
        reportjMenu3.add(reportjMenuItem5);

        reportjMenuItem6.setText("Results");
        reportjMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportjMenuItem6ActionPerformed(evt);
            }
        });
        reportjMenu3.add(reportjMenuItem6);

        adminjMenuBar1.add(reportjMenu3);

        setJMenuBar(adminjMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportjMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportjMenuItem6ActionPerformed
        // TODO add your handling code here:
       new allResults().setVisible(true);
    }//GEN-LAST:event_reportjMenuItem6ActionPerformed

    private void adminjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminjMenuItem1ActionPerformed
        // TODO add your handling code here:
        AdminChangePassword adcp=new AdminChangePassword();
        adcp.setVisible(true);
        
    }//GEN-LAST:event_adminjMenuItem1ActionPerformed

    private void masterjMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterjMenuItem4ActionPerformed
        // TODO add your handling code here:
        AdminQuestions qi=new AdminQuestions();
        qi.setVisible(true);
    }//GEN-LAST:event_masterjMenuItem4ActionPerformed

    private void adminjMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminjMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_adminjMenuItem2ActionPerformed

    private void masterjMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterjMenu2ActionPerformed
        // TODO add your handling code here:
        AdminQuestions adq=new AdminQuestions();
        adq.setVisible(true);
    }//GEN-LAST:event_masterjMenu2ActionPerformed

    private void reportjMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportjMenuItem5ActionPerformed
        // TODO add your handling code here:
        allquestions aw=new allquestions();
        aw.setVisible(true);
    }//GEN-LAST:event_reportjMenuItem5ActionPerformed

    private void masterjMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterjMenuItem3ActionPerformed
        // TODO add your handling code here:
        new AdminCategories().setVisible(true);
    }//GEN-LAST:event_masterjMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminjMenu1;
    private javax.swing.JMenuBar adminjMenuBar1;
    private javax.swing.JMenuItem adminjMenuItem1;
    private javax.swing.JMenuItem adminjMenuItem2;
    private javax.swing.JMenu masterjMenu2;
    private javax.swing.JMenuItem masterjMenuItem3;
    private javax.swing.JMenuItem masterjMenuItem4;
    private javax.swing.JMenu reportjMenu3;
    private javax.swing.JMenuItem reportjMenuItem5;
    private javax.swing.JMenuItem reportjMenuItem6;
    // End of variables declaration//GEN-END:variables
}

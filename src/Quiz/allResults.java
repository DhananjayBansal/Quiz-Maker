/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;
import javax.swing.*;
import java.awt.*;	
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class allResults extends javax.swing.JFrame {
DefaultTableModel model;
ConnectionClass cobj;
JTable table;
JScrollPane js;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form allResults
     */
    public allResults() {
        initComponents();
            cobj=new ConnectionClass();
        model = new DefaultTableModel();
    table = new JTable(model);
js = new JScrollPane(table);
//setLayout(null);
  model.addColumn("Result ID");
    model.addColumn("Category ID");
   model.addColumn("Quiz Date");
  model.addColumn("No. of Ques" );


   model.addColumn("Correct Answers");
  model.addColumn("Wrong Answers");
  model.addColumn("Score");


  table.setShowGrid(true);
  table.setEnabled(false);
  js.setBounds(50,50,750,150);// used to set colummn width(3rd parameter)
  add(js);
    cobj.Connect();
   try{
   
   pst=cobj.con.prepareStatement("select Resultid,categoryid,QuizDate,NoofQues,RightAnswers,WrongAnswers,Score from tbResult ");
   rst=pst.executeQuery();
   while(rst.next())
 {
   model.insertRow(model.getRowCount(), new Object[] { rst.getLong(1),rst.getLong(2),rst.getString(3),rst.getInt(4),rst.getInt(5),rst.getInt(6),rst.getFloat(7)});
 }
 rst.close();
 } 
    
  catch(Exception ex)
{
   System.out.println("error "+ ex.getMessage());
}
  cobj.DisConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(allResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                allResults al=new allResults();
                al.setVisible(true);
                al.setSize(1000, 700);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
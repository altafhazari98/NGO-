/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author altaf
 */
public class Totals extends javax.swing.JFrame {

    /**
     * Creates new form Totals
     */
    public Totals() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        mf = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bh = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ka = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        wl = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        stm = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Total Amounts Donated");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Total Amount Donated");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Meer Foundation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Being Human");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setText("Khalsa Aid");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("World Leader");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setText("Share The Meal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        stm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stmActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setText("CLEAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setText("Click on the buttons below to find amount donated ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(241, 241, 241)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3)
                                    .addComponent(jButton2)
                                    .addComponent(jButton4)
                                    .addComponent(jButton6)
                                    .addComponent(jButton5))
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ka, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(mf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(ka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(stm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(wl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://donorinfo.colvmrnasyyf.us-east-2.rds.amazonaws.com:3306/donorinfo", "root", "rootcloud");  
        String sql="select  sum(amount) from donor_infonb ";  
            PreparedStatement stmt=myConn.prepareStatement(sql);
             ResultSet rs=stmt.executeQuery();
             if(rs.next()){
             total.setText(rs.getString("sum(amount)"));}
    }                                        
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://donorinfo.colvmrnasyyf.us-east-2.rds.amazonaws.com:3306/donorinfo", "root", "rootcloud");  
        String sql="select  sum(amount) from donor_infonb where organisation=\"Meer Foundation\"";  
            PreparedStatement stmt=myConn.prepareStatement(sql);
             ResultSet rs=stmt.executeQuery();
             if(rs.next()){
             mf.setText(rs.getString("sum(amount)"));}
    }                                        
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://donorinfo.colvmrnasyyf.us-east-2.rds.amazonaws.com:3306/donorinfo", "root", "rootcloud");  
        String sql="select  sum(amount) from donor_infonb where organisation=\"Being Human\"";  
            PreparedStatement stmt=myConn.prepareStatement(sql);
             ResultSet rs=stmt.executeQuery();
             if(rs.next()){
             bh.setText(rs.getString("sum(amount)"));}
    }                                        
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://donorinfo.colvmrnasyyf.us-east-2.rds.amazonaws.com:3306/donorinfo", "root", "rootcloud");  
        String sql="select  sum(amount) from donor_infonb where organisation=\"KhalsaAid\"";  
            PreparedStatement stmt=myConn.prepareStatement(sql);
             ResultSet rs=stmt.executeQuery();
             if(rs.next()){
             ka.setText(rs.getString("sum(amount)"));}
    }                                        
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://donorinfo.colvmrnasyyf.us-east-2.rds.amazonaws.com:3306/donorinfo", "root", "rootcloud");  
        String sql="select  sum(amount) from donor_infonb where organisation=\"Share The Meal\"";  
            PreparedStatement stmt=myConn.prepareStatement(sql);
             ResultSet rs=stmt.executeQuery();
             if(rs.next()){
             stm.setText(rs.getString("sum(amount)"));}
    }                                        
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://donorinfo.colvmrnasyyf.us-east-2.rds.amazonaws.com:3306/donorinfo", "root", "rootcloud");  
        String sql="select  sum(amount) from donor_infonb where organisation=\"WorldLeader\"";  
            PreparedStatement stmt=myConn.prepareStatement(sql);
             ResultSet rs=stmt.executeQuery();
             if(rs.next()){
             wl.setText(rs.getString("sum(amount)"));}
    }                                        
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mf.setText("");
        bh.setText("");
        ka.setText("");
        stm.setText("");
        wl.setText("");
        total.setText("");
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new donorDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void kaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kaActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void stmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stmActionPerformed

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
            java.util.logging.Logger.getLogger(Totals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Totals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Totals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Totals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Totals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField ka;
    private javax.swing.JTextField mf;
    private javax.swing.JTextField stm;
    private javax.swing.JTextField total;
    private javax.swing.JTextField wl;
    // End of variables declaration//GEN-END:variables
}

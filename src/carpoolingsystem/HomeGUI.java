/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Annamalai
 */
public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    static HomeGUI homegui;

    public HomeGUI() {
        initComponents();
    }

    public HomeGUI(CarPoolingSystem cps) {
        this();
        this.cps = cps;
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
        b_searchForRideMatch = new javax.swing.JButton();
        b_searchSched = new javax.swing.JButton();
        b_searchRide = new javax.swing.JButton();
        b_searchCust = new javax.swing.JButton();
        b_generateReport = new javax.swing.JButton();
        b_createCust = new javax.swing.JButton();
        b_review = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carpooling System");

        b_searchForRideMatch.setText("Search For Ride Match");
        b_searchForRideMatch.setPreferredSize(new java.awt.Dimension(115, 23));
        b_searchForRideMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchForRideMatchActionPerformed(evt);
            }
        });

        b_searchSched.setText("Search Schedule");
        b_searchSched.setMaximumSize(new java.awt.Dimension(115, 23));
        b_searchSched.setMinimumSize(new java.awt.Dimension(115, 23));
        b_searchSched.setPreferredSize(new java.awt.Dimension(115, 23));
        b_searchSched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchSchedActionPerformed(evt);
            }
        });

        b_searchRide.setText("Search Ride");
        b_searchRide.setPreferredSize(new java.awt.Dimension(115, 23));
        b_searchRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchRideActionPerformed(evt);
            }
        });

        b_searchCust.setText("Search Customer");
        b_searchCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchCustActionPerformed(evt);
            }
        });

        b_generateReport.setText("Generate Report");
        b_generateReport.setPreferredSize(new java.awt.Dimension(115, 23));
        b_generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_generateReportActionPerformed(evt);
            }
        });

        b_createCust.setText("Create Customer");
        b_createCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createCustActionPerformed(evt);
            }
        });

        b_review.setText("Review");
        b_review.setPreferredSize(new java.awt.Dimension(115, 23));
        b_review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reviewActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.setPreferredSize(new java.awt.Dimension(115, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b_searchSched, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_searchCust, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_searchRide, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(b_searchForRideMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_createCust, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b_review, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_createCust, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_searchCust, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_searchRide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_searchSched, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_searchForRideMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_review, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_searchCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchCustActionPerformed
        // TODO add your handling code here:
        SearchCustomerGUI sc = new SearchCustomerGUI(cps, this);

        sc.setVisible(true);


    }//GEN-LAST:event_b_searchCustActionPerformed

    private void b_createCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createCustActionPerformed
        // TODO add your handling code here:
        CreateCustomerGUI sc = new CreateCustomerGUI(cps, this);
        sc.setVisible(true);
    }//GEN-LAST:event_b_createCustActionPerformed

    private void b_searchSchedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchSchedActionPerformed
        // TODO add your handling code here:
        SearchScheduleGUI sc = new SearchScheduleGUI(cps, this);
        sc.setVisible(true);
    }//GEN-LAST:event_b_searchSchedActionPerformed

    private void b_searchRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchRideActionPerformed
        // TODO add your handling code here:
        SearchRideGUI sc = new SearchRideGUI(cps, this);
        sc.setVisible(true);
    }//GEN-LAST:event_b_searchRideActionPerformed

    private void b_searchForRideMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchForRideMatchActionPerformed
        // TODO add your handling code here:
        SearchRideMatchGUI sc = new SearchRideMatchGUI(cps, this);
        sc.setVisible(true);
    }//GEN-LAST:event_b_searchForRideMatchActionPerformed

    private void b_generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generateReportActionPerformed
        // TODO add your handling code here:
        ReportsGUI sc = new ReportsGUI(cps, this);
        sc.setVisible(true);
    }//GEN-LAST:event_b_generateReportActionPerformed

    private void b_reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reviewActionPerformed
        // TODO add your handling code here:
        SearchRideMatchGUI sc = new SearchRideMatchGUI(cps, this);
        sc.setVisible(true);
    }//GEN-LAST:event_b_reviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CarPoolingSystem.serialize(cps, "CarPoolingSystem.dat");
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CarPoolingSystem.serialize(cps, "CarPoolingSystem.dat");
        //JOptionPane.showMessageDialog(null, "CLOSING", "EXCEPTION", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

//            new HomeGUI().setVisible(true);
                homegui = new HomeGUI();
                homegui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_createCust;
    private javax.swing.JButton b_generateReport;
    private javax.swing.JButton b_review;
    private javax.swing.JButton b_searchCust;
    private javax.swing.JButton b_searchForRideMatch;
    private javax.swing.JButton b_searchRide;
    private javax.swing.JButton b_searchSched;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private CarPoolingSystem cps;
}

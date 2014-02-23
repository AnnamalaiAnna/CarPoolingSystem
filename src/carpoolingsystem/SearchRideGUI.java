/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Annamalai
 */
public class SearchRideGUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchRide
     */
    public SearchRideGUI() {
        initComponents();
    }

    public SearchRideGUI(CarPoolingSystem cps, HomeGUI homegui) {
        this();
        this.cps = cps;
        this.homegui = homegui;
        homegui.setEnabled(false);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        tbCustomerId = new javax.swing.JTextField();
        btCreateRide = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbDriverName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dpEndDate = new org.jdesktop.swingx.JXDatePicker();
        dpStartDate = new org.jdesktop.swingx.JXDatePicker();
        tbNumberPlate = new javax.swing.JTextField();
        tbOrigin = new javax.swing.JTextField();
        tbDestination = new javax.swing.JTextField();
        tbCapacity = new javax.swing.JTextField();
        btModifyRide = new javax.swing.JButton();
        btDeleteRide = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tbDriverLicense = new javax.swing.JTextField();
        btPrintReceipt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Ride");
        jLabel1.setToolTipText("");

        jLabel2.setText("Customer Id");

        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        tbCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCustomerIdActionPerformed(evt);
            }
        });

        btCreateRide.setText("Create Ride");
        btCreateRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateRideActionPerformed(evt);
            }
        });

        jLabel3.setText("Driver Name");

        jLabel4.setText("Number Plate");

        jLabel5.setText("Origin");

        jLabel6.setText("Destination");

        jLabel7.setText("Capacity");

        jLabel9.setText("Start Date");

        jLabel10.setText("End Date");

        dpStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpStartDateActionPerformed(evt);
            }
        });

        btModifyRide.setText("Modify Ride");
        btModifyRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifyRideActionPerformed(evt);
            }
        });

        btDeleteRide.setText("Delete Ride");
        btDeleteRide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteRideActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        jLabel8.setText("Driver License");

        btPrintReceipt.setText("Print Receipt");
        btPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbCapacity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(tbDestination, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbOrigin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbNumberPlate, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSearch))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(tbDriverLicense))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tbDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCreateRide)
                        .addGap(18, 18, 18)
                        .addComponent(btModifyRide)
                        .addGap(18, 18, 18)
                        .addComponent(btDeleteRide)
                        .addGap(18, 18, 18)
                        .addComponent(btPrintReceipt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tbDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbNumberPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tbOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tbCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreateRide)
                    .addComponent(btPrintReceipt)
                    .addComponent(btModifyRide)
                    .addComponent(btDeleteRide))
                .addGap(44, 44, 44)
                .addComponent(btCancel)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        goBack();
    }//GEN-LAST:event_btCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        goBack();;
    }//GEN-LAST:event_formWindowClosing

    private void tbCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCustomerIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tbCustomerIdActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        clearFields();
        if (tbCustomerId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Customer Id");
        } else {
            long id = Long.parseLong(tbCustomerId.getText());
            returnList = cps.searchCustomer(id, null, null, null, null);
            if (returnList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Customer Not Found. Please Create the Customer");
            } else if (returnList.getFirst() instanceof Passenger) {
                JOptionPane.showMessageDialog(null, "Passenger cannot have a ride");
            } else {
                driver = (Driver) returnList.getFirst();
                tbDriverName.setText(driver.getfName() + driver.getlName());
                tbDriverLicense.setText(driver.getDlNumber());
                tbNumberPlate.setText(driver.getCarNumber());
                ride = driver.getActiveRide();
                if (ride == null) {
                    JOptionPane.showMessageDialog(null, "No Rides Found.");
                } else {
                    tbOrigin.setText(ride.getOrigin());
                    tbDestination.setText(ride.getDestination());
                    tbCapacity.setText(Integer.toString(ride.getCapacity()));
                    dpStartDate.setDate(ride.getStartDate());
                    dpEndDate.setDate(ride.getEndDate());
                    tbOrigin.setEnabled(false);
                    tbDestination.setEnabled(false);
                    tbCapacity.setEnabled(false);
                    tbDriverName.setEnabled(false);
                    tbDriverLicense.setEnabled(false);
                    tbNumberPlate.setEnabled(false);

                    Date today = new Date();
                    if (dpStartDate.getDate().compareTo(today) < 0) {
                        dpStartDate.setEnabled(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btCreateRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateRideActionPerformed
        if (tbOrigin.getText().equals("") || tbDestination.getText().equals("") || tbCapacity.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter All the Details");
        } else {
            Date Today = new Date();
            if (dpStartDate.getDate().compareTo(dpEndDate.getDate()) > 0 || dpStartDate.getDate().compareTo(Today) < 0) {
                JOptionPane.showMessageDialog(null, "Invalid Dates");
            } else {
                ride = new Ride(tbOrigin.getText(), tbDestination.getText(), Integer.parseInt(tbCapacity.getText()), dpStartDate.getDate(), dpEndDate.getDate(), driver);
                driver.addRide(ride);
                JOptionPane.showMessageDialog(null, "Ride successfully created", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                goBack();
            }
        }
    }//GEN-LAST:event_btCreateRideActionPerformed

    private void dpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpStartDateActionPerformed

    private void btModifyRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifyRideActionPerformed
        Date Today = new Date();
        if ((ride.getStartDate() == dpStartDate.getDate() && ride.getEndDate() == dpEndDate.getDate()) || dpStartDate.getDate().compareTo(dpEndDate.getDate()) > 0 || dpStartDate.getDate().compareTo(Today) < 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Dates");
        } else {
            LinkedList<Customer> affectedCustomers = ride.getAffectedSchedules(dpStartDate.getDate(), dpEndDate.getDate());
            ride = ride.modifyNRecreate(dpStartDate.getDate(), dpEndDate.getDate());
            driver.addRide(ride);
            JOptionPane.showMessageDialog(null, "Ride successfully modified", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            if ((affectedCustomers != null) && (!affectedCustomers.isEmpty())) {
                AffectedCustomersGUI afc = new AffectedCustomersGUI(affectedCustomers, homegui);
                afc.setVisible(true);
                this.dispose();
            } else {
                goBack();
            }
        }
    }//GEN-LAST:event_btModifyRideActionPerformed

    private void btDeleteRideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteRideActionPerformed
        LinkedList<Customer> affectedCustomers = ride.deactivateRide();
        JOptionPane.showMessageDialog(null, "Ride successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        if ((affectedCustomers != null) && (!affectedCustomers.isEmpty())) {
            AffectedCustomersGUI afc = new AffectedCustomersGUI(affectedCustomers, homegui);
            afc.setVisible(true);
            this.dispose();
        } else {
            goBack();
        }
    }//GEN-LAST:event_btDeleteRideActionPerformed

    private void clearFields() {
        tbDriverName.setText("");
        tbDriverLicense.setText("");
        tbNumberPlate.setText("");
        tbOrigin.setText("");
        tbDestination.setText("");
        tbCapacity.setText("");
        dpStartDate.setDate(null);
        dpEndDate.setDate(null);
        driver = null;
        returnList = null;
        ride = null;

    }

    private void btPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintReceiptActionPerformed
        if (ride != null) {
            ride.printReceipt(driver);
            JOptionPane.showMessageDialog(null, "Receipt successfully generated in receipt folder", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            goBack();
        } else {
            JOptionPane.showMessageDialog(null, "No ride found", "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btPrintReceiptActionPerformed

    private void goBack() {
        homegui.setEnabled(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(SearchRideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRideGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRideGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCreateRide;
    private javax.swing.JButton btDeleteRide;
    private javax.swing.JButton btModifyRide;
    private javax.swing.JButton btPrintReceipt;
    private javax.swing.JButton btSearch;
    private org.jdesktop.swingx.JXDatePicker dpEndDate;
    private org.jdesktop.swingx.JXDatePicker dpStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tbCapacity;
    private javax.swing.JTextField tbCustomerId;
    private javax.swing.JTextField tbDestination;
    private javax.swing.JTextField tbDriverLicense;
    private javax.swing.JTextField tbDriverName;
    private javax.swing.JTextField tbNumberPlate;
    private javax.swing.JTextField tbOrigin;
    // End of variables declaration//GEN-END:variables

    private CarPoolingSystem cps;
    //  CarPoolingSystem cs1 = new CarPoolingSystem();
    HomeGUI homegui;
    LinkedList<Customer> returnList = new LinkedList<Customer>();
    Driver driver;
    Ride ride;
}

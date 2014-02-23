/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Nagul
 */
public class ReviewGUI extends javax.swing.JFrame {

    /**
     * Creates new form ReviewGUI
     */
    public ReviewGUI() {
        initComponents();
    }

    ReviewGUI(CarPoolingSystem cps, HomeGUI homegui) {
        this();
        this.cps = cps;
        this.homegui = homegui;
        homegui.setEnabled(false);

        lbAssociatedCustomers.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList source = (JList) event.getSource();
                    displayReview(source);
                }
            }
        });
    }

    public void displayReview(JList source) {
        int index = source.getSelectedIndex();
        if (index >= 0) {
            customerReviewee = returnList.get(index);
            review = customerReviewee.searchReview(customerReviewer);
            if (review != null) {
                tbSummary.setText(review.getSummary());
                tbComments.setText(review.getComments());
                sbRatings.setValue(review.getRating());
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbCustomerId = new javax.swing.JTextField();
        tbSummary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbAssociatedCustomers = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbComments = new javax.swing.JTextArea();
        sbRatings = new javax.swing.JSlider();
        btFetch = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Customer ID");

        jLabel2.setText("Select the Associated Customer");

        jLabel3.setText("Summary");

        jLabel4.setText("Comments");

        jLabel5.setText("Ratings");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Review Customer");
        jLabel7.setToolTipText("");

        lbAssociatedCustomers.setModel(new javax.swing.DefaultListModel());
        jScrollPane1.setViewportView(lbAssociatedCustomers);

        tbComments.setColumns(20);
        tbComments.setRows(5);
        jScrollPane2.setViewportView(tbComments);

        sbRatings.setMajorTickSpacing(1);
        sbRatings.setMaximum(5);
        sbRatings.setPaintLabels(true);
        sbRatings.setPaintTicks(true);

        btFetch.setText("Fetch");
        btFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFetchActionPerformed(evt);
            }
        });

        btSubmit.setText("Submit");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btFetch)))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sbRatings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbSummary)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFetch))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tbSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sbRatings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancel)
                    .addComponent(btSubmit))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFetchActionPerformed
        DefaultListModel m = (DefaultListModel) (lbAssociatedCustomers.getModel());
        String customerId = tbCustomerId.getText();

        CustomerList = cps.searchCustomer(Long.parseLong(customerId), null, null, null, null);
        if (CustomerList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Customer Found", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } else if (CustomerList.getFirst().getCustomerStatus() == true) {
            customerReviewer = CustomerList.getFirst();
            if (customerReviewer instanceof Driver) {
                Driver driver = (Driver) customerReviewer;
                
                if (!(driver.getRideHistory().isEmpty())) {
                    Ride activeRide = driver.getRideHistory().getLast();
                    if (activeRide.getStatus()) {
                        for (Schedule schedule : activeRide.getScheduleList()) {
                            if (schedule.getStatus()) {
                                returnList.add(schedule.getPassenger());
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No associated Passengers found", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (customerReviewer instanceof Passenger) {
                Passenger passenger = (Passenger) customerReviewer;
                if (!(passenger.getScheduleHistory().isEmpty())) {
                    Schedule activeSchedule = passenger.getScheduleHistory().getLast();
                    if (activeSchedule.getStatus()) {
                        returnList.add(activeSchedule.getRide().getDriver());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No associated Drivers found", "INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            for (Customer customer : returnList) {
                m.addElement(customer.getCustomerId() + "/t" + customer.getfName() + "/t" + customer.getlName());
            }

        }
        /*       customerReviewee = null;
         review = customerReviewee.searchReview(customerReviewer);
         if (review != null) {
         tbSummary.setText(review.getSummary());
         tbComments.setText(review.getComments());
         sbRatings.setValue(review.getRating());
    }//GEN-LAST:event_btFetchActionPerformed
    */
    }

    private void goBack() {
        homegui.setEnabled(true);
        this.dispose();
    }

    public DefaultListModel getListModal() {
        return (DefaultListModel) (lbAssociatedCustomers.getModel());
    }

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        goBack();
    }//GEN-LAST:event_btCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        goBack();
    }//GEN-LAST:event_formWindowClosing

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        if (((tbSummary.getText()).length()) == 0 || ((tbComments.getText()).length()) == 0) {
            JOptionPane.showMessageDialog(null, "Enter all the fields", "INFO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (review == null) {
                Review review = new Review(tbSummary.getText(), tbComments.getText(), sbRatings.getValue(), customerReviewee);
                customerReviewee.getReviewList().add(review);
            } else {
                review.modifyReview(tbSummary.getText(), tbComments.getText(), sbRatings.getValue());
            }
        }
    }//GEN-LAST:event_btSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(ReviewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReviewGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btFetch;
    private javax.swing.JButton btSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lbAssociatedCustomers;
    private javax.swing.JSlider sbRatings;
    private javax.swing.JTextArea tbComments;
    private javax.swing.JTextField tbCustomerId;
    private javax.swing.JTextField tbSummary;
    // End of variables declaration//GEN-END:variables
    private CarPoolingSystem cps;
    private HomeGUI homegui;
    private LinkedList<Customer> CustomerList = new LinkedList<Customer>();
    private LinkedList<Customer> returnList = new LinkedList<Customer>();
    private Customer customerReviewee = null;
    private Customer customerReviewer = null;
    private Review review = new Review();
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
// code khá ổn

public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnb2 = new javax.swing.JTextField();
        txtnb1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbb = new javax.swing.JComboBox<>();
        txtkq = new javax.swing.JTextField();
        btnresult = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnrs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULATOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 17, 258, 44));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 523, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Number 1 :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 116, 68, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Number 2 :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 68, -1));

        txtnb2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtnb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnb2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 190, -1));

        txtnb1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtnb1.setForeground(new java.awt.Color(0, 0, 0));
        txtnb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnb1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Operator :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, -1));

        cbb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbb.setForeground(new java.awt.Color(0, 255, 255));
        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        jPanel1.add(cbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, -1));

        txtkq.setEditable(false);
        txtkq.setBackground(new java.awt.Color(255, 153, 255));
        txtkq.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtkq.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtkq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 242, 190, 30));

        btnresult.setBackground(new java.awt.Color(0, 204, 0));
        btnresult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnresult.setForeground(new java.awt.Color(0, 0, 255));
        btnresult.setText("Result");
        btnresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultActionPerformed(evt);
            }
        });
        jPanel1.add(btnresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 243, 70, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        btnrs.setBackground(new java.awt.Color(0, 204, 51));
        btnrs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnrs.setForeground(new java.awt.Color(0, 0, 255));
        btnrs.setText("Reset");
        btnrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrsActionPerformed(evt);
            }
        });
        jPanel1.add(btnrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 243, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnb2ActionPerformed
    // tính tổng
    double Summation(double a, double b) {
        return a + b;
    }
    // tính hiệu
    double Subtraction(double a, double b) {
        return a - b;
    }
    // phép tính chia
    double Division(double a, double b) {
        return a / b;
    }
     // phép tính nhân
    double Multiplication(double a, double b) {
        return a * b;
    }
    private void txtnb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnb1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnb1ActionPerformed

    private void btnresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultActionPerformed
        // TODO add your handling code here:
        // check đầu vào có lỗi hay không nếu lỗi reset các ô
        try {
            String number1 = txtnb1.getText();
            String number2 = txtnb2.getText();
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            String type = cbb.getSelectedItem().toString();
            if (type == "/" && b == 0) {
                JOptionPane.showConfirmDialog(this, "Re-enter the number 2 other than 0 !!", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtnb1.setText("");
                txtnb2.setText("");
                txtkq.setText("");
                txtnb2.requestFocus();
            } else {
                txtkq.setText(" " + Division(a, b));
            }
            if (type == "+") {
                txtkq.setText(" " + Summation(a, b));
            }
            if (type == "-") {
                txtkq.setText(" " + Subtraction(a, b));
            }
            if (type == "*") {
                txtkq.setText(" " + Multiplication(a, b));
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Input incorrect, Please re-enter !!", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtnb1.setText("");
            txtnb2.setText("");
            txtnb1.requestFocus();
            txtkq.setText("");
        }
    }//GEN-LAST:event_btnresultActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // phá hủy đối tượng hiên tại
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrsActionPerformed
        // TODO add your handling code here:
        //làm mới các ô, con trỏ hiện tại tại ô number 1
        txtnb1.setText("");
        txtnb2.setText("");
        txtnb1.requestFocus();
        txtkq.setText("");
    }//GEN-LAST:event_btnrsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnresult;
    private javax.swing.JButton btnrs;
    private javax.swing.JComboBox<String> cbb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtkq;
    private javax.swing.JTextField txtnb1;
    private javax.swing.JTextField txtnb2;
    // End of variables declaration//GEN-END:variables
}

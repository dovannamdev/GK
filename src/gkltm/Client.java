/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gkltm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFieldSecondMostAppearCharacter.setEnabled(false);
        jTextFieldSecondMostAppearTheNumbers.setEnabled(false);
        jTextAreaCipherText.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPlainText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldKey = new javax.swing.JTextField();
        jButtonThucHien = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSecondMostAppearCharacter = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSecondMostAppearTheNumbers = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCipherText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("THUẬT TOÁN MÃ HÓA RAIL FENCE");

        jTextAreaPlainText.setColumns(20);
        jTextAreaPlainText.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPlainText);

        jLabel2.setText("Văn bản");

        jLabel3.setText("Khóa");

        jButtonThucHien.setText("Thực hiện");
        jButtonThucHien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThucHienActionPerformed(evt);
            }
        });

        jTextFieldSecondMostAppearCharacter.setEditable(false);

        jLabel6.setText("Số lần xuất hiện");

        jTextFieldSecondMostAppearTheNumbers.setEditable(false);

        jLabel7.setText("Ký tự xuất hiện nhiều thứ 2");

        jLabel4.setText("Văn bản đã mã hóa");

        jTextAreaCipherText.setEditable(false);
        jTextAreaCipherText.setColumns(20);
        jTextAreaCipherText.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCipherText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldKey)
                                    .addComponent(jTextFieldSecondMostAppearCharacter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSecondMostAppearTheNumbers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                        .addGap(1, 1, 1)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButtonThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldSecondMostAppearCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSecondMostAppearTheNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonThucHien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThucHienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThucHienActionPerformed
        try {
            // TODO add your handling code here:
            if (jTextAreaPlainText.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập bản mã");
                return;
            }
            if (jTextFieldKey.getText().compareTo("") == 0) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập khóa");
                return;
            }
            if(Integer.parseInt(jTextFieldKey.getText()) <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Khóa phải là số dương");
                return;
            }
            
            Socket s = new Socket("localhost", Server.PORT);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            String plainText = jTextAreaPlainText.getText();
            int key = Integer.parseInt(jTextFieldKey.getText());
            plainText = standardizeString(plainText);
            String cipherText = encrypt(plainText, key);
            System.out.println(cipherText + "\n" + key);
            dout.writeUTF(cipherText);
            dout.write(key);

            String recieve = din.readUTF();
            String arr[] = recieve.split(" ");
            jTextFieldSecondMostAppearCharacter.setText(arr[0]);
            jTextFieldSecondMostAppearTheNumbers.setText(arr[1]);
            jTextAreaCipherText.setText(cipherText);
            
            jTextFieldSecondMostAppearCharacter.setEnabled(true);
            jTextFieldSecondMostAppearTheNumbers.setEnabled(true);
            jTextAreaCipherText.setEnabled(true);
            
            s.close();
            din.close();
            dout.close();

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonThucHienActionPerformed

    public static String standardizeString(String plainText) {
        plainText = plainText.toLowerCase().trim();
        plainText = plainText.replaceAll("\\s+", "");
        return plainText;
    }

    public static String encrypt(String plaintText, int key) {
        String cipherText = "";
        for (int row = 0; row < key; row++) {
            int iter = 0;
            for (int i = row; i < plaintText.length(); i += getJump(iter++, row, key)) {
                cipherText += plaintText.charAt(i);
            }
        }
        return cipherText;
    }

    public static int getJump(int iter, int row, int key) {
        if (key == 1) {
            return 1;
        }
        if (row == 0 || row == key - 1) {
            return (key - 1) * 2;
        }
        if (iter % 2 == 0) {
            return (key - 1 - row) * 2;
        }
        return row * 2;
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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonThucHien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaCipherText;
    private javax.swing.JTextArea jTextAreaPlainText;
    private javax.swing.JTextField jTextFieldKey;
    private javax.swing.JTextField jTextFieldSecondMostAppearCharacter;
    private javax.swing.JTextField jTextFieldSecondMostAppearTheNumbers;
    // End of variables declaration//GEN-END:variables
}


package com.mycompany.projetocalculadora;

public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
    Double valor1, valor2;
    String operacao;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTFTela = new javax.swing.JTextField();
        BT0 = new javax.swing.JButton();
        BTvirgu = new javax.swing.JButton();
        BTsoma = new javax.swing.JButton();
        BTigual = new javax.swing.JButton();
        BT3 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        BT1 = new javax.swing.JButton();
        BTmenos = new javax.swing.JButton();
        BTmultipli = new javax.swing.JButton();
        BT6 = new javax.swing.JButton();
        BT5 = new javax.swing.JButton();
        BT4 = new javax.swing.JButton();
        BTlimpa = new javax.swing.JButton();
        BTdivis = new javax.swing.JButton();
        BTon = new javax.swing.JButton();
        BT9 = new javax.swing.JButton();
        BT8 = new javax.swing.JButton();
        BT7 = new javax.swing.JButton();

        jButton13.setText("jButton13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTFTela.setBackground(new java.awt.Color(0, 0, 0));
        jTFTela.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jTFTela.setForeground(new java.awt.Color(255, 255, 255));
        jTFTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelaActionPerformed(evt);
            }
        });

        BT0.setText("0");
        BT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT0ActionPerformed(evt);
            }
        });

        BTvirgu.setText(",");
        BTvirgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvirguActionPerformed(evt);
            }
        });

        BTsoma.setText("+");
        BTsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsomaActionPerformed(evt);
            }
        });

        BTigual.setText("=");
        BTigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTigualActionPerformed(evt);
            }
        });

        BT3.setText("3");
        BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT3ActionPerformed(evt);
            }
        });

        BT2.setText("2");
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });

        BT1.setText("1");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BTmenos.setText("-");
        BTmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTmenosActionPerformed(evt);
            }
        });

        BTmultipli.setText("*");
        BTmultipli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTmultipliActionPerformed(evt);
            }
        });

        BT6.setText("6");
        BT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT6ActionPerformed(evt);
            }
        });

        BT5.setText("5");
        BT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT5ActionPerformed(evt);
            }
        });

        BT4.setText("4");
        BT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT4ActionPerformed(evt);
            }
        });

        BTlimpa.setText("C");
        BTlimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlimpaActionPerformed(evt);
            }
        });

        BTdivis.setText("/");
        BTdivis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdivisActionPerformed(evt);
            }
        });

        BTon.setText("ON");
        BTon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTonActionPerformed(evt);
            }
        });

        BT9.setText("9");
        BT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT9ActionPerformed(evt);
            }
        });

        BT8.setText("8");
        BT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT8ActionPerformed(evt);
            }
        });

        BT7.setText("7");
        BT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFTela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BT0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BT3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(BT6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTvirgu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTmultipli, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(BTsoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTlimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT9, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BTdivis, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTFTela, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTdivis, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(BTon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BT6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTlimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTmultipli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BT3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTvirgu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BT0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsomaActionPerformed
        valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "soma";
    }//GEN-LAST:event_BTsomaActionPerformed

    private void BTonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTonActionPerformed

    private void jTFTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelaActionPerformed

    private void BT0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT0ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "0");
    }//GEN-LAST:event_BT0ActionPerformed

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "1");
    }//GEN-LAST:event_BT1ActionPerformed

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT2ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "2");
    }//GEN-LAST:event_BT2ActionPerformed

    private void BT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT3ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "3");
    }//GEN-LAST:event_BT3ActionPerformed

    private void BT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT4ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "4");
    }//GEN-LAST:event_BT4ActionPerformed

    private void BT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT5ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "5");
    }//GEN-LAST:event_BT5ActionPerformed

    private void BT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT6ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "6");
    }//GEN-LAST:event_BT6ActionPerformed

    private void BT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT7ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "7");
    }//GEN-LAST:event_BT7ActionPerformed

    private void BT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT8ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "8");
    }//GEN-LAST:event_BT8ActionPerformed

    private void BT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT9ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "9");
    }//GEN-LAST:event_BT9ActionPerformed

    private void BTvirguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvirguActionPerformed
        jTFTela.setText(jTFTela.getText()+ ",");
    }//GEN-LAST:event_BTvirguActionPerformed

    private void BTlimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlimpaActionPerformed
        jTFTela.setText(" ");
    }//GEN-LAST:event_BTlimpaActionPerformed

    private void BTmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTmenosActionPerformed
         valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "subtração";
    }//GEN-LAST:event_BTmenosActionPerformed

    private void BTmultipliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTmultipliActionPerformed
         valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "multiplicação";
    }//GEN-LAST:event_BTmultipliActionPerformed

    private void BTdivisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTdivisActionPerformed
         valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "divisão";
    }//GEN-LAST:event_BTdivisActionPerformed

    private void BTigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTigualActionPerformed
         valor2 = Double.parseDouble(jTFTela.getText());
         
         if(operacao == "soma"){
             jTFTela.setText(String.valueOf(valor1 + valor2));
         }
         else if (operacao == "subtração"){
             jTFTela.setText(String.valueOf(valor1 - valor2));
         }
         else if (operacao == "multiplicação"){
             jTFTela.setText(String.valueOf(valor1 * valor2));
         }
          else if (operacao == "divisão"){
             jTFTela.setText(String.valueOf(valor1 / valor2));
         }
    }//GEN-LAST:event_BTigualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT0;
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
    private javax.swing.JButton BT3;
    private javax.swing.JButton BT4;
    private javax.swing.JButton BT5;
    private javax.swing.JButton BT6;
    private javax.swing.JButton BT7;
    private javax.swing.JButton BT8;
    private javax.swing.JButton BT9;
    private javax.swing.JButton BTdivis;
    private javax.swing.JButton BTigual;
    private javax.swing.JButton BTlimpa;
    private javax.swing.JButton BTmenos;
    private javax.swing.JButton BTmultipli;
    private javax.swing.JButton BTon;
    private javax.swing.JButton BTsoma;
    private javax.swing.JButton BTvirgu;
    private javax.swing.JButton jButton13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFTela;
    // End of variables declaration//GEN-END:variables
}

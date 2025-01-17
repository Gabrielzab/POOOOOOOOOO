/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jcalculadora.visao;

import com.mycompany.jcalculadora.controle.CalculadoraController;
import com.mycompany.jcalculadora.enums.EnumOperacao;
import java.text.NumberFormat;

/**
 *
 * @author Aluno
 */
public class JFrTela extends javax.swing.JFrame {

    private CalculadoraController calculadoraController;
    /**
     * Creates new form JFrTela
     */
    public JFrTela() {
        initComponents();
        calculadoraController = new CalculadoraController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btFechar = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btMaisMenos = new javax.swing.JButton();
        btPercentual = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btMult = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btMais = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btVírgul = new javax.swing.JButton();
        btIMC = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btFechar.setText("Fechar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Manual");

        tfValor.setBackground(new java.awt.Color(153, 153, 255));
        tfValor.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        tfValor.setForeground(new java.awt.Color(255, 255, 255));
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btAC.setBackground(new java.awt.Color(153, 153, 255));
        btAC.setText("AC");
        btAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACActionPerformed(evt);
            }
        });
        jPanel1.add(btAC);

        btMaisMenos.setBackground(new java.awt.Color(153, 153, 255));
        btMaisMenos.setText("+/-");
        jPanel1.add(btMaisMenos);

        btPercentual.setBackground(new java.awt.Color(153, 153, 255));
        btPercentual.setText("%");
        jPanel1.add(btPercentual);

        btDividir.setBackground(new java.awt.Color(153, 153, 255));
        btDividir.setText("/");
        jPanel1.add(btDividir);

        bt7.setBackground(new java.awt.Color(153, 153, 255));
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt7);

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt8);

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt9);

        btMult.setText("*");
        jPanel1.add(btMult);

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt4);

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt5);

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt6);

        btMenos.setText("-");
        jPanel1.add(btMenos);

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3);

        btMais.setText("+");
        btMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisActionPerformed(evt);
            }
        });
        jPanel1.add(btMais);

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(bt0);

        btVírgul.setText(",");
        btVírgul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVírgulActionPerformed(evt);
            }
        });
        jPanel1.add(btVírgul);

        btIMC.setText("IMC");
        jPanel1.add(btIMC);

        btIgual.setText("=");
        jPanel1.add(btIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfValor)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    
    private void btACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACActionPerformed
        limpa();
    }//GEN-LAST:event_btACActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        digita("7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        digita("8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        digita("9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        digita("4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        digita("5");
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        digita("6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        digita("1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        digita("2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        digita("3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        digita("0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void btVírgulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVírgulActionPerformed
        digita(",");
    }//GEN-LAST:event_btVírgulActionPerformed

    private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisActionPerformed
       calculadoraController.realizaOperacao(EnumOperacao.SOMA, Double.NaN)
    }//GEN-LAST:event_btMaisActionPerformed

    private Double stringToDouble(String numero){
        NumberFormat nf = NumberFormat.getInstance();
    }
    
    private void limpa(){
        tfValor.setText("0,00");
    }
    
    private void digita(String caractere){
        if (tfValor.getText().equals("0,00")){
            tfValor.setText(caractere);
        }
        else{
            if(caractere.equals(",") && tfValor.getText().contains(",")){
            }
            else{
            tfValor.setText(tfValor.getText().concat(caractere));
        }
    }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAC;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIMC;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMais;
    private javax.swing.JButton btMaisMenos;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMult;
    private javax.swing.JButton btPercentual;
    private javax.swing.JButton btVírgul;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.jcalculadora;

import com.mycompany.jcalculadora.visao.JFrTela;

public class Central {
    public static void main(String[] args){
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrTela().setVisible(true);
            }
        });
    }
}

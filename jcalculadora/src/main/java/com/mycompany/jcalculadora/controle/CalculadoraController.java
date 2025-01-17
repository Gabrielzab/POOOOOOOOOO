
package com.mycompany.jcalculadora.controle;

import com.mycompany.jcalculadora.enums.EnumOperacao;

/**
 *
 * @author Aluno
 */
public class CalculadoraController {
    
    private Double total;
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor ){
        if(operacao.equals(EnumOperacao.SOMA)){
            total = total + valor;
        }
        else if(operacao.equals(EnumOperacao.SUBTRACAO)){
            total = total - valor;
        }
        else if(operacao.equals(EnumOperacao.DIVISAO)){
            total = total / valor;
        }
           if(operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total = total + valor;
        }
           return total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    public void zerar(){
        total = 0.0;
    }
}

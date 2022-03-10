/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author Matheus
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salario_base , gratificacao;
        double imposto , salario_receber;
        salario_base = 3000;
        gratificacao = 50;
        imposto = 1 - 0.1;
        
        System.out.println("Salário base: " + salario_base);
        
        salario_receber = salario_base * imposto + gratificacao;
        System.out.println("Salário a receber: " + salario_receber);
        
    }
    
}

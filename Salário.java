/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg1;

/**
 *
 * @author Matheus
 */
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Salário atual do funcionário: ");
        int salario_funcionario = 1400;
        System.out.println(salario_funcionario);
        
        System.out.println("Percentual de aumento de salário: ");
        double percentual_de_aumento = 1.25;
        System.out.println("25%");
        
        System.out.println("Novo salário: ");
        double novo_salario = salario_funcionario * percentual_de_aumento;
        System.out.println(novo_salario);
        
    }
    
}

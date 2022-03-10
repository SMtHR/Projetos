/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao6;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salario_atual , aumento , novo_salario;
        aumento = 1.25;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o salario atual do funcionario: ");
        salario_atual =  in.nextDouble();
        
        novo_salario = salario_atual * aumento;
        
        System.out.println("Novo salário: " + novo_salario);
    }
    
}

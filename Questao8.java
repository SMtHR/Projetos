/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int A , B , resultado;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insira o valor de A: ");
        A = in.nextInt();
        
        System.out.println("Insira o valor de B: ");
        B = in.nextInt();
        
        resultado = (A * A) - (2 * A * B) + (B * B);
        
        System.out.println("Resultado: " + resultado);
                
    }
    
}

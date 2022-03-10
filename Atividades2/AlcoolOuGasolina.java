/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q7;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double alcool , gasolina;
        
        System.out.print("Digite o valor do alcool: ");
        alcool = in.nextDouble();
        System.out.print("Digite o valor da gasolina: ");
        gasolina = in.nextDouble();
        
        if (alcool < 0.7 * gasolina){
            System.out.println("Compensa abastecer com alcool");
        }
        else{
            System.out.println("Compensa abastecer com gasolina");
        }
    }
    
}

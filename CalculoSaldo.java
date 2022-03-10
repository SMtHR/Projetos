/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double deposito ,saldo_inicial ,saldo_apos_deposito , novo_saldo;
        double cheque1 , cheque2 , cpmf;
        Scanner in = new Scanner(System.in);
        saldo_inicial = 0;
        cpmf = 0.0038;
        
        System.out.println("Valor depositado: ");
        deposito = in.nextDouble();
        
        saldo_apos_deposito = saldo_inicial + deposito;
        
        System.out.println("Valor do primeiro cheque: ");
        cheque1 = in.nextDouble();
        System.out.println("Valor do segundo cheque: ");
        cheque2 = in.nextDouble();
        
        double saldoAposCheque1 , saldoAposCheque2;
        saldoAposCheque1 = saldo_apos_deposito - (cheque1 + cheque1 * cpmf);
        saldoAposCheque2 = saldoAposCheque1 - (cheque2 + cheque2 * cpmf);
        
        novo_saldo = saldoAposCheque2;
        
        System.out.println("Saldo atual: " + novo_saldo);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javadowhile3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaDoWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int contador = 0; 

        do {
            System.out.print("Digite um numero inteiro (0 para sair): ");
            numero = scanner.nextInt(); 
            
            if (numero != 0) {
                contador++; 
            }
        } while (numero != 0);
        System.out.println("Voce digitou " + contador + " numeros.");
        scanner.close();
    }
}

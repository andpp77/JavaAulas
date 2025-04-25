/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author ANDERSONSANTIAGODELI
 */
public class OrdenacaoDePaises {
    public static void main(String[] args) {
        String[] paises = {"Mexico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        System.out.println("Antes Da ordenacao BubbleSort" );
        for (String pais : paises) {
            System.out.println(pais);
        }
        for (int i = 0; i < paises.length - 1; i++) {
            for (int j = 0; j < paises.length - 1 - i; j++) {
                if (paises[j].compareToIgnoreCase(paises[j + 1]) > 0) {
                    String temp = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Depois Da ordenacao BubbleSort" );
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}



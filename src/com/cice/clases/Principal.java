/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

/**
 *
 * @author cecilia
 */
public class Principal {

    public static void main(String[] args) {
        //creamos coches
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
 /*       
        coche1.arrancar();
        coche1.acelerar();
        coche1.frenar();
        coche1.apagar();
*/
        coche1.bastidor = "BA12445";
        coche2.bastidor = "CA12345";
        
        System.out.println(coche1.bastidor);
        System.out.println(coche2.bastidor);
        
        coche1.modelo = "Auris";
        coche2.modelo = "Seat";
        System.out.println(coche2.modelo);
        
        Coche coche3 = new Coche();
        coche3.modelo = "BMW";
        
        System.out.println(coche1.modelo);
}
}
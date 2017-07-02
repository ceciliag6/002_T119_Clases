/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.Date;

/**
 *
 * @author cecilia
 */
public class Coche {
    //Atributos
    static String modelo;
    
    String color;
    String matricula;
    String bastidor;
    int potencia;
    Date fechaMatriculacion;
    boolean esAndado;
    boolean esEncendido;
    
    //Constructor
    public Coche(){
        
    }
    
    //Métodos
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    
    public void frenar(){
        System.out.println("Estoy frenando");
    }
    
    public void arrancar(){
        System.out.println("Estoy arrancando");
    }
    
    public void apagar(){
        System.out.println("Estoy apagando");
    }
}

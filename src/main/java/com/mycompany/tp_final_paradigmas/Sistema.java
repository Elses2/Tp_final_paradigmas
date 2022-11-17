/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
import java.util.Random; 
public class Sistema {
    
    public Cama asignar(Cama a,int dni_paciente){
        Cama result= new Cama(); 
        return result; 
    }
    
    ///me va a devolver el indice de la array donde se encuentra el medico, en vez del dni por cuestiones funcionales
    public int asignar_medico(){
        int result=(int)(Math.random()*5+1);
        return result;
    }
    
}

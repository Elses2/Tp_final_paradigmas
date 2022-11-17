/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
public class Paciente extends Individuo {
    
    public String problema; /// Problema que tiene el paciente
    
    
    public Paciente(int dni){
        super(dni);

    
    }
    public Paciente(int años, String name, int altura, int peso, String dire, String problema){
        super(años,name,altura,peso,dire);
        this.problema=problema; 
    }
}

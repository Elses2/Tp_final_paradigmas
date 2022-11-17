/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
import java.util.Scanner;
public class Medico extends Individuo {
    
    public Scanner input= new Scanner(System.in);
    public String especialidad; 
    public int pacientes[]=new int[5]; 
    
    
    /// Constructor
    public Medico(String especialidad, int años, String name, int altura, int peso, String dire){
        super(años,name,altura,peso,dire);
        this.especialidad=especialidad; 
    }
    
    public int internar(int dni_paciente){
     return 0;      
    }
    public void llenar_his(){
    
        System.out.println("Algo xd");
    
    }
    public void dar_alta(int dni_persona){
        
        System.out.println("Algo xd");
    }
    
}

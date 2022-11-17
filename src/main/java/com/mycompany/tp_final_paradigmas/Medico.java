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
    public Sistema syst=new Sistema(); 
    public Scanner input= new Scanner(System.in);
    public String especialidad; 
    public int pacientes[]=new int[5]; 
    
    
    /// Constructor
    public Medico(int dni){
    
        super(dni);
        this.name="Juan";
    }
    public Medico(String especialidad, int años, String name, int altura, int peso, String dire){
        super(años,name,altura,peso,dire);
        this.especialidad=especialidad; 
    }
    
    public int internar(int dni_paciente,int dni_medico, String fecha_inicio,String motivo, Paciente array[], Historial h[]){
            int indice= 0; 
            for(int i =0; i<20; i++){
                if(array[i].dni== dni_paciente){
                
                    indice =i; 
                    break; 
                }
            
                h[indice].fecha_entrada=fecha_inicio; 
                h[indice].dni_medico=dni_medico; 
                h[indice].motivo=motivo; 
                syst.asignar(h[indice].cama, dni_paciente);
            }
     return 0;      
    }
    public void llenar_his(){
    
        System.out.println("Llenado automatico");
        
    
    }
    public void dar_alta(Paciente pas, Historial historia){
        
        System.out.println("El paciente ha sido dado de alta");
        historia.fecha_salida= input.nextLine();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
public class Historial {
    
   /// public Patogeno patogenos[]= new Patogeno[5];
    public String fecha_consulta; 
    public String problema;
   ///
   /// public Internacion internaciones[]= new Internacion[5];
    public int dni_medico; 
    public String fecha_entrada;
    public String fecha_salida; 
    public String  motivo; 
    public Cama cama=new Cama();
    ////
    public String alergias[]=new String [5];
    public int dni_paciente;/// conexion con el paciente
    public String medicamentos[]=new String[5]; 
    
    public Historial(int dni){
    
        dni= dni_paciente ; 
    }
    
    public void Mostrar(){
            System.out.println("Mostrar: ");
            
            
        
        }
}


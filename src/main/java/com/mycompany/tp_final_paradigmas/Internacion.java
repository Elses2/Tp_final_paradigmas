/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
public class Internacion {
        
    public int dni_medico; 
    public String fecha_entrada;
    public String fecha_salida; 
    public String  motivo;  /// patalogia
    
    public Internacion(String fecha_entrada, String motivo){
    
        this.fecha_entrada=fecha_entrada;
        this.motivo=motivo;
    
        }
    
}
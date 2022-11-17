/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
public class Cama {
        
        public boolean ocupa; /// para saber si la cama esta ocupada o no
        public int dni_paciente; /// para saber la persona que ocupa la cama
        /// El resto de datos lo tenemos en Historial
    
        /// Contructor
           public Cama(){
           ocupa=false;/// de base esta desocupada 
           dni_paciente=0; /// 0 indica que no hay nadie asignado
           }
}

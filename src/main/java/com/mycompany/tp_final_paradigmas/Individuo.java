/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */
public class Individuo {
    
    public String dire; 
    public int años;
    public String name;
    public int dni;/// Identificador
    public int altura;
    public int peso;
    
    public Individuo(int años, String name, int altura, int peso, String dire) {
        this.años = años;
        this.name = name;
        this.altura = altura;
        this.dni = dni;
        this.peso = peso;
        this.dire=dire; 
    }
}

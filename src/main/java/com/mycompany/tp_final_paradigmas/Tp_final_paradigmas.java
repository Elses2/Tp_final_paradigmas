/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp_final_paradigmas;

/**
 *
 * @author eberc
 */


///Menu 
import java.util.Scanner; 
public class Tp_final_paradigmas {

    public static void main(String[] args) {
        Sistema syst=new Sistema();
        Scanner input=new Scanner(System.in);
        Cama camas[]=new Cama[10];
        Medico medicos[]=new Medico[5];
        Historial historiales[]= new Historial[20];
        Paciente pacientes[]=new Paciente[20]; 
        for(int i =0; i<5;i++){
        
            medicos[i]=new Medico(0); 
        }
        for (int i=0; i<20;i++){
            pacientes[i]= new Paciente(0);
        }
         for (int i=0; i<20;i++){
            historiales[i]= new Historial(0);
        }
        int boton=0; 
        int n=2; 
        /// variables de entrada 
        int dni=0; 
        String problema; 
        int num;///medico asignado
        int j=2;/// condicional de un bucle
        String motivo; ///motivo de internacion
        String fecha_inicio, fecha_fin; 
        int indicador=0; /// muestra el indice donde registrar al nuevo paciente
            
       do{
        
       menu_1();
       boton= input.nextInt();
       switch(boton)
       {
           case 1: 
               System.out.println("Cual es el dni del paciente ingresado? ");
               dni= input.nextInt();
               input.nextLine();///Para limpiar el buffer
               if (esta_registrado(dni, pacientes) ==false){
                   System.out.println("El paciente no esta registrado registrar");
                   ///registrar paciente
                   
                   /// Para saber donde almacenar el nuevo paciente
                   for(int i= 0; i<20; i++){
                       if(pacientes[i].dni==0){
                           indicador=i;
                           break; 
                       }
                   }
                   historiales[indicador].dni_paciente=dni; 
                   pacientes[indicador]= new Paciente(dni);
                   
                   
                   
                   
               }
               System.out.println("Cual es el problema del paciente? ");
               problema= input.nextLine();
               ///input.nextLine(); ///limpiar buffer
               
               
               
             
               pacientes[indice_paciente(dni,pacientes)].problema=problema; //// Temporal mejorable
               
               System.out.print("Medico asignado a este paciente: ");
               num= syst.asignar_medico()-1; 
               System.out.println(medicos[num].name);
                System.out.println("Hola medico: "+ medicos[num].name+"por favor elige entre las siguientes opciones");
                j=2;/// Cuando se reutilize esta opcion, el valor de j vuelva a ser 2 y se reutilize nuevamente 
                while(j==2){
                    System.out.println("1:Internar");
                    System.out.println("2:Llenar historial");
                    System.out.println("3:Dar de alta");
                    System.out.println("4:Dejar de atender");
                    boton= input.nextInt();
                    input.nextLine();/// Limpiar buffer
                switch(boton){
                    case 1: 
                        System.out.println("Dime el motivo de internacion: ");
                        motivo=input.nextLine();
                        System.out.println("Dime la fecha de internacion: ");
                        fecha_inicio= input.nextLine(); 
                        medicos[num].internar(dni,medicos[num].dni , fecha_inicio, motivo, pacientes, historiales);
                
                        
                        break; 
                    case 2: 
                        medicos[num].llenar_his();
                        break;
                    case 3: 
                        medicos[num].dar_alta(pacientes[indice_paciente(dni,pacientes)], historiales[indice_paciente(dni,pacientes)]);
                        
                        break; 
                    case 4:
                            j=5;
                            System.out.println("Gracias por su trabajo doctor");
                        break; 
                    default:
                        System.out.println("Error: Valor fuera de rango");
                          
                    
                
                }
                }
               
               break; 
               
           case 2: 
               System.out.println("Gracias por usarnos");
               n=3;
               break;
           default:
               System.out.println("Error: valor fuera de rango");
       
       
       }
        
       }while(n==2);
       input.close();
    }
    public static  void menu_1(){

    System.out.println("1: Ingreso de paciente");
    System.out.println("2: Fin");

        }
    public static boolean esta_registrado(int dnia, Paciente array[] ){
        boolean result= false; 
         for(int i=0; i<20; i++){
             if(array[i].dni==dnia){
                 result= true; 
                 break;
             }
         }
         return result; 
    }
    public static int indice_paciente(int dnia, Paciente array[]){
        int result=0; 
        
        for (int i=0; i<20; i++){
            if(array[i].dni== dnia){
                result=i; 
                break; 
            }
        }
    
    
        return result;
    }
}

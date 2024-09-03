/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.automotora;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaDos = new Scanner(System.in);
        
        Persona vPersona = new Persona();
        Vendedor vendedor = new Vendedor();
        Categoria_vehiculo categoria = new Categoria_vehiculo(1, "Sedan");
                    vehiculo vehiculo1 = new vehiculo(1,
                            1000000, 
                            "abcf209",
                            "Peugot", 
                            "301", 
                            categoria);
        
        int opcion = 0;
        
        while(opcion != 5){
            System.out.println("=======Menu======");
            System.out.println("[1]- Agregar Vendedor");
            System.out.println("[2]- Agregar Cliente");
            System.out.println("[3]- Mostrar vehiculos");
            System.out.println("[4]- Generar Venta");
            System.out.println("[5]- Salir");
            
            
            
            opcion = entrada.nextInt();
            
            
            
            switch(opcion){
                case 1:
                    String nombre = " ";
                    while(true){
                        System.out.println("Ingrese el nombre del vendedor: ");
                        nombre = entrada.nextLine();
                        
                        if(nombre.isEmpty()){
                            System.out.println("Debe ingresar un nombre valido. ");
                           
                        }else{
                            vPersona.setNombre(entradaDos.nextLine());
                            break;
                        }                   
                    
                    }                 
                    
                    System.out.println("Ingrese el apellido del vendedor : ");
                    vPersona.setApellido(entrada.next());
                    
                    System.out.println("Ingrese el rut del Vendedor: ");
                    vPersona.setRut(entrada.next());
                    
                    System.out.println("Ingrese el telefono del vendedor: ");
                    vPersona.setTelefono(entrada.nextInt());
                    
                    int anio, mes, dia;
                    System.out.println("Ingresa el año de nacimiento del vendedor: ");
                    anio = entrada.nextInt();
                    
                    System.out.println("Ingresa el mes de nacimiento del vendedor: ");
                    mes = entrada.nextInt();
                    
                    System.out.println("Ingresa el dia de nacimiento del vendedor: ");
                    dia = entrada.nextInt();
                    
                    vPersona.setFecha_nacimiento(LocalDate.of(anio,mes,dia));
                    
                    vendedor.setId_vendedor(1);
                    vendedor.setPersona(vPersona);
                    
                    System.out.println(vendedor);
                    
                    
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Vehiculos y precio");
                    System.out.println(vehiculo1.getMarca()+ " " + vehiculo1.getModelo());
                    System.out.println("CLP : "+vehiculo1.CalcularPrecioVehiculoConIva());
                    vehiculo1.calcularDescuento();
                    
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                   
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
          
            
        }
    }
}

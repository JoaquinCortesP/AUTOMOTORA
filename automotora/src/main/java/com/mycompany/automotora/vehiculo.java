/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automotora;

/**
 *
 * @author Cetecom
 */
public class vehiculo {
    private int id_vehiculo,precio;
    private String patente, marca, modelo;
    private Categoria_vehiculo categoria;

    public vehiculo() {
    }

    public vehiculo(int id_vehiculo, int precio, String patente, String marca, String modelo, Categoria_vehiculo categoria) {
        this.id_vehiculo = id_vehiculo;
        this.precio = precio;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Categoria_vehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria_vehiculo categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "vehiculos{" + "id_vehiculo=" 
                + id_vehiculo + 
                ", precio=" + precio + 
                ", patente=" + patente +
                ", marca=" + marca + 
                ", modelo=" + modelo + 
                ", categoria=" + categoria + '}';
    }
    
    public double CalcularPrecioVehiculoConIva(){
        if(precio> 0 ){
            return precio * 1.19;
        }else{
            return 0;
        }
        
    }
    //50% de descuento
    public void calcularDescuento(){
        double descuento = 0;
        
    if(CalcularPrecioVehiculoConIva() > 1500){
        descuento = CalcularPrecioVehiculoConIva() * 0.4;
        System.out.println("Su descuento es de : " + descuento);
    }else{
        System.out.println("No hay descuento.");
    }
    }
    
    
    
}
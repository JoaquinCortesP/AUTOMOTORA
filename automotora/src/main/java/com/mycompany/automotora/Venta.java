/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Venta {
    private int id_venta;
    private vehiculo auto;
    private Vendedor vendedor;
    private Cliente cliente;
    private LocalDate fecha_compra;

    public Venta() {
    }

    public Venta(int id_venta, vehiculo auto, Vendedor vendedor, Cliente cliente, LocalDate fecha_compra) {
        this.id_venta = id_venta;
        this.auto = auto;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.fecha_compra = fecha_compra;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public vehiculo getAuto() {
        return auto;
    }

    public void setAuto(vehiculo auto) {
        this.auto = auto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + 
                ", auto=" + auto.getMarca() + 
                ", vendedor=" + vendedor.getPersona().getNombre() + 
                ", cliente=" + cliente.getPersona().getNombre() + 
                ", fecha_compra=" + fecha_compra + '}';
        
    }
    
}

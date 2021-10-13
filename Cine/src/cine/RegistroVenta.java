/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author EDUARD
 */
public class RegistroVenta {
    
    String nombreCliente, pelicula;
    int cantidadAsientos;
    double total,tipoAsiento;
    
    RegistroVenta(String nombre, String pelicula, int cantidadAsientos,double tipoAsiento, double total){
        this.nombreCliente = nombre;
        this.pelicula = pelicula;
        this.cantidadAsientos = cantidadAsientos;
        this.tipoAsiento = tipoAsiento;
        this.total = total;
    }
    
    public String getNombre(){
        return nombreCliente;
    }
    
    public String getPelicula(){
        return pelicula;
    }
    
    public int getCantidad(){
        return cantidadAsientos;
    }
    
    public double getTipoAsiento(){
        return tipoAsiento;
    }
    
    public double getTotal(){
        return total;
    }
    
}

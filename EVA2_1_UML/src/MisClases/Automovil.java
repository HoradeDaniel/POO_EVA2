/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

public class Automovil {
    private String marca;
    private String modelo;
    private int fecha;
    
    public void setMarca(String p){
        marca = p;
    }
    public void setModelo(String p){
        modelo = p;
    }
    public void setFecha(int p){
        fecha = p;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getFecha(){
        return fecha;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: "+ fecha);
    }
}


    

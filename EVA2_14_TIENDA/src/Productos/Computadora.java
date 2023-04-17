
package Productos;

import SuperClase.Electronica;

public final class Computadora extends Electronica{
    private int memoria;
    private double tamanno;
    private int discoDuro;

    public Computadora() {
        super();
        this.memoria = 0;
        this.tamanno = 0.0;
        this.discoDuro = 0;
    }

    public Computadora(int memoria, double tamano, int discoDuro, String fabricante, String modelo, int garantia, double precio, String desc, String unidad) {
        super(fabricante, modelo, garantia, precio, desc, unidad);
        this.memoria = memoria;
        this.tamanno = tamano;
        this.discoDuro = discoDuro;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getTamano() {
        return tamanno;
    }

    public void setTamano(double tamano) {
        this.tamanno = tamano;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    
    @Override
    public double precioVenta(int cant){
        // despues de cierta cantidad, hay descuento
        if (cant <= 10)
            return precio * cant;
        else
            return (precio * 0.8) * cant;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Computadora{" + "Memoria: " + memoria + " GB, Tamaño de pantalla: " + tamanno + " pulgadas, Disco duro: " + discoDuro + " GB}";
    }
    
}

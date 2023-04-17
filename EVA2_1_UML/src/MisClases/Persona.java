
package MisClases;

public class Persona {
    private String id;
    private String nombre;
    private int edad;
    
    public void setID(String p){
        id = p;
    }
    public void setNombre(String p){
        nombre = p;
    }
    public void setEdad(int p){
        edad = p;
    }
    
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    public void imprimirDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ edad);
    }
}

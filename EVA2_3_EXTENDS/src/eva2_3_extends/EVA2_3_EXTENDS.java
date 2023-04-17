/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author dyca3
 */
public class EVA2_3_EXTENDS {
 public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Daniel");
        estu.setApellidos("Castruita");
        estu.setEdad(20);
        estu.setNoControl("22550365");
        
        System.out.println("Datos del estudiante:");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellidos());
        System.out.println(estu.getEdad() + " años");
        System.out.println(estu.getNoControl());
        
        Docentes doce1 = new Docentes();
        doce1.setNombre("Omar");
        doce1.setApellidos("Palomino");
        doce1.setEdad(30);
        doce1.setPlaza("Central/&%$#96");
    }
    
}

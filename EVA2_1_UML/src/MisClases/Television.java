
package MisClases;

public class Television {
    private int canal;
    private int vol;
    private boolean power;
    
    public void setCanal(int p){
        canal = p;
    }
    public void setVol(int p){
        vol = p;
    }
    public void setPower(boolean p){
        power = p;
    }
    
    public int getCanal(){
        return canal;
    }
    public int getVol(){
        return vol;
    }
    public boolean getPower(){
        return power;
    }
    
    public void imprimirDatos(){
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + vol);
        System.out.println("Power: " + power);
    }
}

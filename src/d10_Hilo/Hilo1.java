
package d10_Hilo;
  

public class Hilo1 extends Thread{
    private String nombre;

    public Hilo1(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre);
        }
    }
}

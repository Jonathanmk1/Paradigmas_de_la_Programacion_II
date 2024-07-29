
package d10_Hilo;
//concurrente lo hace paralelo
public class Hilo2 extends Thread{
    private String nombre;

    public Hilo2(String nombre) {
        this.nombre = nombre;
    }
    
    public void run(){
        for (int i = 5; i < 10; i++) {
            System.out.println(nombre);
        }
    }
    
}

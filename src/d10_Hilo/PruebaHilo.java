
package d10_Hilo;


public class PruebaHilo {

    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error");
        }
        //System.out.println("Hola hilo");
        Hilo1 h1 = new Hilo1("hilo1");
        h1.start();
        Hilo2 h2 = new Hilo2("hilo2");
        h2.start();
    }
}

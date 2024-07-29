package d11_rec;

import java.util.logging.Level;
import java.util.logging.Logger;

public class pruebarecur {
    static long i1, i2;
    static double t1, t2;

    public static void main(String[] args) {

        Hilofib0 h1, h2;
        h1 = new Hilofib0();
        h2 = new Hilofib0();
        h1.setN(46);
        h2.setN(46);
        Hilofibo h3, h4;
        h3 = new Hilofibo();
        h4 = new Hilofibo();
        h3.setN(10000);
//        Funciones_recursiva s = new Funciones_recursiva();
//       int ri = s.iterativo(5);
//       int rr = s.recursiva(5);
//        System.out.println(ri);
//        System.out.println(rr);
        //long inicio = System.nanoTime();
//        long r = s.fibo(45);
//        long r2 = s.fibo(45);
        long inicio = System.nanoTime();
        h1.start();

        h2.start();

        h3.start();
        long f3 = System.nanoTime();
        
        try {
            i1 = System.nanoTime();
            h1.join();
            long f1 = System.nanoTime();
            t1 = (f1 - i1) / 1e9;
            
            i2 = System.nanoTime();
            h2.join();
            long f2 = System.nanoTime();
            t2 = (f2 - i2) / 1e9;
        } catch (InterruptedException ex) {

        }

        long fin = System.nanoTime();
        double t = (fin - inicio) / 1e9;
        double t3 = (f3 - inicio) / 1e9;
        
        System.out.printf("%-10s %-10s %-10s %-10s", "t_total", "t_h1", "t_h2", "t_h3");
        System.out.println(" ");
        System.out.printf("%-10.4f %-10.4f %-10.4f %-10.4f", t, t1, t2, t3);

        System.out.println("\ntermino el hilo principal");
    }

}

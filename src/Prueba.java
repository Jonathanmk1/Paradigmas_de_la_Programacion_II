
import java.util.Random;
/*
2 metodo de ordenacion 
-2 iterativo
-2 recursivos
despues lo manejemos con hilos

*/
public class Prueba {

    public static void main(String[] args) {
        Random r = new Random();
        int nums[];
        nums = new int[1000];

        MediaHilo h1 = new MediaHilo(nums, 0, 250);
        MediaHilo h2 = new MediaHilo(nums, 250, 500);
        MediaHilo h3 = new MediaHilo(nums, 500, 750);
        MediaHilo h4 = new MediaHilo(nums, 750, 1000);
        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            float m1 = h1.getMedia();
            float m2 = h2.getMedia();
            float m3 = h3.getMedia();
            float m4 = h4.getMedia();
            float mediatotal=(m1+m2+m3+m4)/4;
            System.out.println("Media" + mediatotal);
            
        } catch (InterruptedException ex) {
            
        }

    }

}

package FiboGrafico;

/**
 *
 * @author jonat
 */
public class MediaHilo extends Thread{
    
    private int num[], inicio, fin;
    private float media;

    public MediaHilo(int[] num, int inicio, int fin) {
        this.num = num;
        this.inicio = inicio;
        this.fin = fin;
        this.media = media;
        this.media=0;
    }
     
    @Override
    public void run(){
        int s=0;
        for (int i = inicio; i < fin; i++) {
            s+=num[i];
        }
        media = s /(fin-inicio);
    }

    public float getMedia() {
        return media;
    }
    
    
}

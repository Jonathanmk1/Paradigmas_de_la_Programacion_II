
public class MediaHilo extends Thread{
    private int num[];
    private int inicio;
    private int fin;
    private float media;

    public MediaHilo(int[] num, int inicio, int fin) {
        this.num = num;
        this.inicio = inicio;
        this.fin = fin;
        this.media = media;
        this.media = 0;
    }

    public float getMedia() {
        return media;
    }
    
    
    @Override
    public void run(){
        int s=0;
        for (int i = inicio; i < fin; i++) {
            s+=num[i];
        }
        this.media = s / this.fin;
        
    }
}

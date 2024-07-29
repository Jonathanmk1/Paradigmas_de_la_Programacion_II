package FiboGrafico;

public class PruebaMediaHilos {

    public static void main(String[] args) {
        
        int nums[]=new int[1000];
        
        for (int i = 0; i < nums.length; i++) {
            int n=(int) Math.random();  
            nums[i]=n;          
        }
        
        MediaHilo mH1 = new MediaHilo(nums, 0, 250);
        MediaHilo mH2 = new MediaHilo(nums, 250, 500);
        MediaHilo mH3 = new MediaHilo(nums, 500, 750);
        MediaHilo mH4 = new MediaHilo(nums, 750, 1000);
        
        mH1.start();
        mH2.start();
        mH3.start();
        mH4.start();
        
        try {
            mH1.join();
            mH2.join();
            mH3.join();
            mH4.join();
            
            float m1=mH1.getMedia();
            float m2=mH2.getMedia();
            float m3=mH3.getMedia();
            float m4=mH4.getMedia();
            float mT =(m1+m2+m3+m4)/4;
            
            System.out.println("Media: "+mT);
            
        } catch (InterruptedException ex) {
            System.out.println();
        }
        
        
        
    }
    
}

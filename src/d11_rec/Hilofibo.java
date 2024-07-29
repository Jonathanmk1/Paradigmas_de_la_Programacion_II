
package d11_rec;

public class Hilofibo extends Thread {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
//    @Override
//    public void run(){
//        double f = Funciones_recursiva.fibo(n);
//        System.out.printf("Fibo(%d)=%.0f\n", n, f);
//    }
    
    @Override
    public void run(){
        double f = Funciones_recursiva.iterativo(n);
        System.out.printf("Fibo(%d)=%.0f\n", n, f);
    }
}

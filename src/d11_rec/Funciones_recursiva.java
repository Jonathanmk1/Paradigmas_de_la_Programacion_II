package d11_rec;

public class Funciones_recursiva extends Thread{

    public static int iterativo(int n) {
        int suma;
        suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public int recursiva(int n) {
        //caso base
        //paso recursividad
        if (n == 0) {
            return n;
        } else {
            return n + recursiva(n - 1);
        }
    }

    public void imprimir(int n) {
        //caso base
        //paso recursividad
        if (n == 0) {
            System.out.println("HM");
        } else {
            System.out.println("HM");
        }
    }
    
    public static long fibo(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fibo(n-2) + fibo(n - 1);
        }
    }
}

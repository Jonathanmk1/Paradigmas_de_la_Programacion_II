package d22022023Polim;

import java.io.Serializable;

public class Triangulo implements FiguraGeometrica1, Serializable{
    
   private float b, a;

    public Triangulo(float b, float a) {
        this.b = b;
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }
    
   @Override
    public float area(){
        return (b*a)/2;
    }

   @Override
    public  String toString(){
        return String.format("%-10.2f  %-10.2f  2%-10.2f",b, a, area());
    }
    
}

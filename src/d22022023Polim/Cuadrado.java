package d22022023Polim;

import java.io.Serializable;

public class Cuadrado implements FiguraGeometrica1, Serializable{
    
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float area(){
        return lado*lado;
    }
    
    @Override
    public String toString(){
        return String.format("%-10.2f  %-10.2f", lado, area());
    }
    
}

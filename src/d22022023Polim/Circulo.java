package d22022023Polim;

import java.io.Serializable;

/**
 *
 * @author jonat
 */
public class Circulo implements FiguraGeometrica1, Serializable{
    
    private float r;

    public Circulo(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    public float area(){
        return (float)(Math.PI*Math.pow(r, 2));
    }
    
    public String toString(){
        return String.format("%-10.2f  %-10.2f", r, area());
    }
}

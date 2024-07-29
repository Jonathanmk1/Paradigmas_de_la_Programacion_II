
package d3_Repaso;

import model.Auto;

public class PruebaAutos {
    public static void main(String[] args) {
        //Declaro y creo
        Auto a[];
        a= new Auto[2];
        a[0] = new Auto(1, "Lol", "hhsk", "ll");
        
        for (Auto a1 : a) {
            System.out.println(a1);
        }
       //a.setColor("Blanco");
        //System.out.println(a.toString());
        //a.arrancar();
        
    }
}

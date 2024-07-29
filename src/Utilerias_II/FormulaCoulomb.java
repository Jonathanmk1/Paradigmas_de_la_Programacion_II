
package Utilerias_II;

public class FormulaCoulomb {
    
    public static float form(float q1, float q2, float r){
        float F, k= (float)(9 * Math.pow(-9, 10));
        
        F= (float) ((k *(q1 * q2)) / Math.pow(2, r));
        return F;
    }
}

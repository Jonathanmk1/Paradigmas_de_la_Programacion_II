package FiboGrafico;

import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author jonat
 */
public class Reloj_Hilo extends Thread {

    private javax.swing.JLabel lblReloj;

    public Reloj_Hilo(JLabel lblReloj) {
        this.lblReloj = lblReloj;
    }

    @Override
    public void run() {
        while (true) {
            Calendar t = Calendar.getInstance();
            int h = t.get(Calendar.HOUR);
            int m = t.get(Calendar.MINUTE);
            int s = t.get(Calendar.SECOND);
            String tiempo = String.format("%02d:%02d:%02d",h,m,s);
            lblReloj.setText(tiempo);
        }
    }
}


import java.util.Calendar;
import javax.swing.JLabel;


public class RelojHilo extends Thread{
    private javax.swing.JLabel lblReloj;

    public RelojHilo(JLabel lblReloj) {
        this.lblReloj = lblReloj;
    }
    
    @Override
    public void run(){
        while (true) {            
            Calendar t = Calendar.getInstance();
            int h = t.get(Calendar.HOUR);
            int m = t.get(Calendar.MINUTE);
            int s = t.get(Calendar.SECOND);
            String tiempo = String.format("%02d:%02d:%02d", (h)-1, m, s);
            lblReloj.setText(tiempo);
//            if (m < 10) {
//                tiempo = h + ":0" + m + ":" + s;
//            } else {
//            }
//            tiempo = h + ":" + m + ":" + s;
//            lblReloj.setText(tiempo);
        }
    }
    
}

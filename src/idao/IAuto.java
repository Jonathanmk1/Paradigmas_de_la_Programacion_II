
package idao;

import java.util.ArrayList;
import model.Auto;

public interface IAuto {
    //CRUD 
    //crear un metodo que no regrese pero reciba un objeto  
    void createAuto(Auto p);
    //metodo que reciba y regrese 
    Auto readAuto(int id);
    //trae todo los datos de la BD
    ArrayList<Auto> readAuto();
    //recibe el objeto para update
    void updateAuto(Auto a);
    //recibe el objeto para poder borrar
    void deleteAuto(Auto a);
}

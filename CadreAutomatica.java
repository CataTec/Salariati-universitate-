

package universitate.main;
import java.util.Scanner;

public class CadreAutomatica {
   
    int id;
    String nume;
    String prenume;

    public CadreAutomatica(int newID, String newNume, String newPrenume){
        id = newID;
        nume = newNume;
        prenume = newPrenume;
        
    }    
 
    public int getID(){
        return id;
    }

    public void setID(int newID){
        id = newID;
    }
    
    public String getNume(){
        return nume;
    }
    
    public void setNume(String newNume) {
        nume = newNume;
    }
    
    public String getName(){
        return prenume;
    }
    
    public void setPrenume(String newPrenume) {
        prenume = newPrenume;
    }

    public String toString(){
        return id + " " + nume + " " + prenume ;
    }
}

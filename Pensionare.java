
package universitate.main;
import java.util.Scanner;

public class Pensionare {
      
    int id;
    String nume;
    String prenume;
    int varsta;
    
      
    

    public Pensionare(int newID, String newNume, String newPrenume, int newVarsta){
        id = newID;
        nume = newNume;
        prenume = newPrenume;
        varsta = newVarsta;
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
       
    public int getVarsta(){
        return varsta;
    }
    
    public void setVarsta(int newVarsta){
        varsta = newVarsta;
    }

    public String toString(){
        return id + " " + nume + " " + prenume + " " + varsta;
    }
}

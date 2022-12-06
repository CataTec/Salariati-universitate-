
package universitate.main;

import java.util.Scanner;


public class SalariiMici {
    
     
    int id;
    String nume;
    String prenume;
    int venituri;
    
        
    

    public SalariiMici(int newID, String newNume, String newPrenume, int newVenituri){
        id = newID;
        nume = newNume;
        prenume = newPrenume;
        
        venituri = newVenituri;
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
       
    public double getVenituri(){
        return venituri;
    }
    
    public void setVenituri(int newVenituri){
        venituri = newVenituri;
    }

    public String toString(){
        return id + " " + nume + " " + prenume + " " + venituri;
    }
    
}


package universitate.main;
import java.util.Scanner;

public  class Plecari {
    
    int id;
    String nume;
    String prenume;
    int ani;
    
       
    

    public Plecari(int newID, String newNume, String newPrenume,  int newAni){
        id = newID;
        nume = newNume;
        prenume = newPrenume;
        ani = newAni;
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
       
    public double getAni(){
        return ani;
    }
    
    public void setAni(int newAni){
        ani = newAni;
    }

    public String toString(){
        return id + " " + nume + " " + prenume + " " + ani;
    }  
}

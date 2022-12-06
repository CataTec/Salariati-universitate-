
package universitate.main;
import java.util.Scanner;

public class Rate {
     
    int id;
    String nume;
    String prenume;
    int suma;
    
    

    public Rate(int newID, String newNume, String newPrenume, int newSuma){
        id = newID;
        nume = newNume;
        prenume = newPrenume;
        suma = newSuma;
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
       
    public double getSuma(){
        return suma;
    }
    
    public void setSuma(int newSuma){
        suma = newSuma;
    }

    public String toString(){
        return id + " " + nume + " " + prenume + " " + suma;
    }
}

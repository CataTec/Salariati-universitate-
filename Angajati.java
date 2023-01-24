
public class Angajati {

    int id;
    String nume;
    String prenume;
    int varsta;
    int venituri;
    boolean arerate;
    int rate;
    boolean cadruautomatica;

    public Angajati(int newID, String newNume, String newPrenume, int newVarsta,  int newVenituri, boolean newArerate, int newRate,boolean newCadruAutomatica){
        id = newID;
        nume = newNume;
        prenume = newPrenume;
        varsta = newVarsta;
        venituri = newVenituri;
        arerate = newArerate;
        rate = newRate;
        cadruautomatica = newCadruAutomatica;
    }

    public int getVarsta(){
        return varsta;
    }

    public double getVenituri(){
        return venituri;
    }

    public boolean getArerate(){
        return arerate;
    }

    public boolean getCadruAutomatica(){
        return cadruautomatica;
    }


    public String toString(){
        return  id + "|" + nume + "|" + prenume + "|" + varsta + "|" + venituri + "|" + rate;
    }
}
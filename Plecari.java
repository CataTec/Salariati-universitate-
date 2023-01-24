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

    public String toString(){
        return id + "|" + nume + "|" + prenume + "|" + ani;
    }
}

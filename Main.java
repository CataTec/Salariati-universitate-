
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;


        ArrayList<Angajati> listaAngajati = new ArrayList<>();
        ArrayList<Plecari> listaPlecari = new ArrayList<>();


        Angajati angajat = new Angajati(1, "Popescu", "Stefan", 36, 3000, false, 0, false);
        listaAngajati.add(angajat);
        angajat = new Angajati(2, "Sandu", "Mihai", 45, 4000, true, 10000 , true);
        listaAngajati.add(angajat);
        angajat = new Angajati(3, "Popescu", "Dan", 57, 4500, false, 0, false);
        listaAngajati.add(angajat);
        angajat = new Angajati(4, "Nascu", "Andrei", 34, 3500, false, 0, false);
        listaAngajati.add(angajat);
        angajat = new Angajati(5, "Stanescu", "Gabriel", 63, 5300, false, 0, true);
        listaAngajati.add(angajat);
        angajat = new Angajati(6, "Ionescu", "Eduard", 65, 6000, false, 0, false);
        listaAngajati.add(angajat);
        angajat = new Angajati(7, "Stan", "Alexandru", 43, 4300, true, 15000, false);
        listaAngajati.add(angajat);


        Plecari plecari = new Plecari(8, "Tomescu", "Dan", 2);
        listaPlecari.add(plecari);
        plecari = new Plecari(9, "Georgescu", "Andrei", 4);
        listaPlecari.add(plecari);


        Scanner input = new Scanner(System.in);
        int option = 0;

        System.out.println("[1]:Angajati");
        System.out.println("[2]:Angajati cu salarii mai mici de 4000 lei");
        System.out.println("[3]:Angajati care au plecat in ultimii 5 ani");
        System.out.println("[4]:Angajati care au implinit sau implinesc varsta de pensionare(63)");
        System.out.println("[5]:Angajati care au rate la banca si suma totala");
        System.out.println("[6]:Cadrele didactice de la facultatea de automatica si calculatoare");
        System.out.println("[0]:Iesire");

        do{

            System.out.println("\nIntroduceti o comanda:");
            option = input.nextInt();
            System.out.println("\n");

            switch(option){

                case 1:
                    System.out.println("ID|Nume|Prenume|Varsata|Venituri|Rate \n");
                    for (i=0 ; i<=listaAngajati.size()-1; i++){
                        angajat = listaAngajati.get(i);
                        System.out.println(angajat.toString());
                    }
                    break;

                case 2:
                    System.out.println("ID|Nume|Prenume|Varsata|Venituri|Rate \n");
                    for (i=0 ; i<=listaAngajati.size()-1; i++){
                        angajat = listaAngajati.get(i);
                        if(angajat.getVenituri()< 4000){
                            System.out.println(angajat.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("ID|Nume|Prenume|AniPlecare \n");
                    for (i=0 ; i<=listaPlecari.size()-1; i++){
                        plecari = listaPlecari.get(i);
                        System.out.println(plecari.toString());
                    }
                    break;

                case 4:
                    System.out.println("ID|Nume|Prenume|Varsata|Venituri|Rate \n");
                    for (i=0 ; i<=listaAngajati.size()-1; i++){
                        angajat = listaAngajati.get(i);
                        if(angajat.getVarsta()> 62){
                            System.out.println(angajat.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("ID|Nume|Prenume|Varsata|Venituri|Rate \n");
                    for (i=0 ; i<=listaAngajati.size()-1; i++){
                        angajat = listaAngajati.get(i);
                        if(angajat.getArerate()== true){
                            System.out.println(angajat.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("ID|Nume|Prenume|Varsata|Venituri|Rate \n");
                    for (i=0 ; i<=listaAngajati.size()-1; i++){
                        angajat = listaAngajati.get(i);
                        if(angajat.getCadruAutomatica()== true){
                            System.out.println(angajat.toString());
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nIesire");
                    break;

                default:
                    System.out.println("\nEroare: Comanda Invalida");
                    option = input.nextInt();
                    break;
            }
            System.out.println("\n");
        }while(option!=0);
    }
}
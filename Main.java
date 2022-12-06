package universitate.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        int i;
        
        ArrayList<Angajati> listaAngajati = new ArrayList<>(); 
        ArrayList<SalariiMici> listaSalarii = new ArrayList<>();
        ArrayList<Plecari> listaPlecari = new ArrayList<>();
        ArrayList<Pensionare> listaPensionare = new ArrayList<>();
        ArrayList<Rate> listaRate = new ArrayList<>();
        ArrayList<CadreAutomatica> listaCadre = new ArrayList<>();
        
        
        Angajati angajat = new Angajati(1, "Popescu", "Stefan", 36, 3000);
        listaAngajati.add(angajat);
        angajat = new Angajati(2, "Sandu", "Mihai", 45, 4000);
        listaAngajati.add(angajat);
        angajat = new Angajati(3, "Popescu", "Dan", 57, 4500);
        listaAngajati.add(angajat);
        angajat = new Angajati(4, "Nascu", "Andrei", 34, 3500);
        listaAngajati.add(angajat);
        angajat = new Angajati(5, "Stanescu", "Gabriel", 63, 5300);
        listaAngajati.add(angajat);
        angajat = new Angajati(6, "Ionescu", "Eduard", 65, 6000);
        listaAngajati.add(angajat);
        angajat = new Angajati(7, "Stan", "Alexandru", 43, 4300);
        listaAngajati.add(angajat);
        
        
        SalariiMici salarii = new SalariiMici(1, "Popescu", "Stefan", 3000);
        listaSalarii.add(salarii);
        salarii = new SalariiMici(4, "Nascu", "Andrei", 3500);
        listaSalarii.add(salarii);
        
        Plecari plecari = new Plecari(8, "Tomescu", "Dan", 2);
        listaPlecari.add(plecari);
        plecari = new Plecari(9, "Georgescu", "Andrei", 4);
        listaPlecari.add(plecari);
        
        Pensionare pensionare = new Pensionare(5, "Stanescu", "Gabriel", 63);
        listaPensionare.add(pensionare);
        pensionare = new Pensionare(6, "Ionescu", "Eduard", 65);
        listaPensionare.add(pensionare);
        
        Rate rate = new Rate(2, "Sandu", "Mihai",  10000);
        listaRate.add(rate);
        rate = new Rate(7, "Stan", "Alexandru",  15000);
        listaRate.add(rate);
        
        CadreAutomatica cadre = new CadreAutomatica(2, "Sandu", "Mihai");
        listaCadre.add(cadre);
        cadre = new CadreAutomatica(5, "Stanescu", "Gabriel");
        listaCadre.add(cadre);
        
        
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
        for (i=0 ; i<=listaAngajati.size()-1; i++){
            angajat = listaAngajati.get(i);
            System.out.println(angajat.toString());
        }
        break;
        
        case 2:
        for (i=0 ; i<=listaSalarii.size()-1; i++){
            salarii = listaSalarii.get(i);
            System.out.println(salarii.toString());
        }
        break;
        
        case 3:
        for (i=0 ; i<=listaPlecari.size()-1; i++){
            plecari = listaPlecari.get(i);
            System.out.println(plecari.toString());
        }
        break;
        
        case 4:
        for (i=0 ; i<=listaPensionare.size()-1; i++){
            pensionare = listaPensionare.get(i);
            System.out.println(pensionare.toString());
        }
        break;
        
        case 5:
        for (i=0 ; i<=listaRate.size()-1; i++){
            rate = listaRate.get(i);
            System.out.println(rate.toString());
        }
        break;
        
        case 6:
        for (i=0 ; i<=listaCadre.size()-1; i++){
            cadre = listaCadre.get(i);
            System.out.println(cadre.toString());
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
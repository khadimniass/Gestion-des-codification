import models.Etudiant;
import models.Pavillon;
import models.Responsable;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********* TAPER 1 POUR AJOUTER PAVILLON *********");
        int choix = sc.nextInt();
        switch (choix){
            case 1:
                Responsable responsable = new Responsable();
                Pavillon pavillon = new Pavillon();
                pavillon.setId(1);
                pavillon.setNumPavillon(1);
                responsable.addPavillon(pavillon);
                responsable.listerPavillon();
            case 2:
                System.out.println("Fin");
            default:
                System.out.println("ce choix n'est paris en charge");
        }

    }
}
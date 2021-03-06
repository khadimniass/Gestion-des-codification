import models.Chambre;
import models.Pavillon;
import service.ServiceTableau;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ServiceTableau service = new ServiceTableau();
        Scanner sc = new Scanner(System.in);
        System.out.println("****************** TAPER 1 POUR AJOUTER PAVILLON ******************");
        System.out.println("****************** TAPER 2 POUR AJOUTER CHAMBRE ******************");
        int choix = sc.nextInt();
        switch (choix) {
            case 1 -> {
                System.out.println("Combien de pavillon voulez vous ajouter ? :");
                int indexpav = sc.nextInt();
                for (int i = 0; i < indexpav; i++) {
                    Pavillon pavillon = new Pavillon();
                    pavillon.setId(i+1);
                    System.out.println("remplissage du pavillon " + (i + 1));
                    System.out.print("numero du pavillon : ");
                    int numeroPav = sc.nextInt();
                    pavillon.setNumPavillon(numeroPav);
                    System.out.print("Nombre etage ? ");
                    int numbEtage = sc.nextInt();
                    pavillon.setNombreEtage(numbEtage);
                    service.addPavillon(pavillon);
                }
                service.listerPavillon();
            }
            case 2 -> {
                System.out.println("Combien de pavillon voulez vous ajouter ? :");
                int indexchambre = sc.nextInt();
                for (int i = 0; i < indexchambre; i++) {
                    Chambre chambre = new Chambre();
                    chambre.setId(i+1);
                    chambre.setNumeroChambre(chambre.genNumberchambre(i));
                    service.listerPavillon();
                    System.out.println("entre le numero de pavillon du chambre");
                    int idPav= sc.nextInt();
                    Pavillon p = new Pavillon();
                    chambre.setPavillon(p);
                }
                service.listerChambre();
            }
            default -> System.out.println("ce choix n'est paris en charge");
        }
    }
}
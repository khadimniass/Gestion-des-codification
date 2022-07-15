import models.Pavillon;
import service.CollectionService;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        CollectionService service = new CollectionService();
        Scanner sc = new Scanner(System.in);
        System.out.println("****************** TAPER 1 POUR AJOUTER PAVILLON ******************");
        System.out.println("****************** TAPER 2 POUR AJOUTER CHAMBRE ******************");
        int choix = sc.nextInt();
        switch (choix){
            case 1->{
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
                 //  System.out.println(pavillon);
                   service.addPavillon(pavillon);
                }
                service.listerPavillon();
            }
            case 2 -> {
                System.out.println("Combien de chambre voulez vous ajouter ? :");
                int indexchambre = sc.nextInt();
                System.out.println("terminer");
            }
            default -> System.out.println("ce choix n'est paris en charge");
        }
    }
}
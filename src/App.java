import models.Etudiant;
import models.Responsable;

public class App {
    public static void main(String[] args) {
        Responsable responsable = new Responsable();
      //  Etudiant etudiant = new Etudiant(1,"Ndiaye","Adama","77 549 77 49","GATTE","ndaiaye@gmail.com","19/02/1995");
        responsable.ajouterEtudiant();
    }
}
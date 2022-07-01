package models;

import service.IService;
import java.util.Scanner;

public class Responsable extends Personne implements IService {
    private final int TAILLE = 10;
    private Pavillon[] pavillons = new Pavillon[TAILLE];
    private int indexPavillon;

    @Override
    public void addPavillon(Pavillon pavillon) {
        if(indexPavillon<TAILLE){
            pavillons[indexPavillon]=pavillon;
            indexPavillon++;
        }else{
            System.out.println("le tableau est plein");
        }
    }

    @Override
    public void SupprimerPavillon() {

    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon: pavillons) {
            if (pavillon!=null){
                System.out.println(pavillon);
            }
        }
    }

    @Override
    public void addChambre() {

    }

    @Override
    public void ArchiverChambre() {

    }

    @Override
    public void listerChambre() {

    }

    @Override
    public void affecterPavillonEtudiant() {

    }

    @Override
    public void ajouterEtudiant() {
        Scanner sc = new Scanner(System.in);
        Etudiant e =new Etudiant();
        Etudiant [] etudiants = new Etudiant[2];
        for (int i = 0; i < etudiants.length; i++) {
            System.out.println("**************************Etudiant "+(i+1)+"**************************");
            System.out.println("nom");
            e.nom = sc.next();

            System.out.println("prenom");
            e.prenom = sc.next();

            System.out.println("telephone");
            e.telephone=sc.next();
        etudiants[i]=e;
        }
        displayEtudiant(etudiants);
    }
    @Override
    public void affecterChambreBoursierLoge() {

    }

    @Override
    public void listerChambrePavillon() {

    }

    @Override
    public void listerEtudiantChambre() {

    }

    @Override
    public void displayEtudiant(Etudiant [] e) {
        System.out.println("la list des etudiants");
        for (int i = 0; i < e.length ; i++) {
                System.out.println(e);
        }
    }
}
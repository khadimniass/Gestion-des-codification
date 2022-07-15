package service;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau  implements IService{
    private final int TAILLE = 10;
    private Pavillon[] pavillons = new Pavillon[TAILLE];
    private int index=0;
    private Chambre[] chambres = new Chambre[TAILLE];

    @Override
    public void addPavillon(Pavillon pavillon){
        if(index<TAILLE){
            pavillons[index]=pavillon;
            index++;
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
    public void addChambre(Chambre chambre) {
        if (index<TAILLE){
            chambres[index]=chambre;
            index++;
        }
    }

    @Override
    public void ArchiverChambre() {

    }

    @Override
    public void listerChambre() {
        for (Chambre chambre: chambres) {
            if (chambre!=null){
                System.out.println(chambre);
            }
        }
    }

    @Override
    public void affecterPavillonEtudiant() {

    }

    @Override
    public void ajouterEtudiant() {

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
    public void displayEtudiant(Etudiant[] e) {

    }
}
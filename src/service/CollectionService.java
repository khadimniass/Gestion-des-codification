package service;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionService implements IService{
    Collection<Pavillon> pavillons = new ArrayList<>();
    @Override
    public void addPavillon(Pavillon pavillon) {

        pavillons.add(pavillon);
    }

    @Override
    public void SupprimerPavillon() {

    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : pavillons) {
                System.out.println(pavillon);
        }
    }

    @Override
    public void addChambre(Chambre chambre) {

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

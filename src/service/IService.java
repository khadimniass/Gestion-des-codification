package service;

import models.Etudiant;
import models.Pavillon;

public interface IService {
    public void addPavillon(Pavillon pavillon);
    public void SupprimerPavillon();
    public void listerPavillon();

    public void addChambre();
    public void ArchiverChambre();
    public void listerChambre();

    public void affecterPavillonEtudiant();
    public void ajouterEtudiant();
    public void affecterChambreBoursierLoge();

    public void listerChambrePavillon();
    public void listerEtudiantChambre();
    public void displayEtudiant(Etudiant[] e);
}

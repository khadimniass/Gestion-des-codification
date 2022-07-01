package service;

import models.Etudiant;

public interface IService {
    public void addPavillon();
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

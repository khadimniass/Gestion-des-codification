package models;

public class Etudiant extends Personne{
protected String matricule;
protected String email;
protected String dateNaissance;

/*    public Etudiant(int id, String nom, String prenom,String telephone, String matricule, String email, String dateNaissance) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.matricule = matricule;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }
 */

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "prenom : "+this.getPrenom()+", prnom :"+getNom()+" telephone :"+this.telephone;
    }
}

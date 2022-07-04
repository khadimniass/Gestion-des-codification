package models;

public class Pavillon {
private int id;
public static int nbrePav=0;
private int nombreEtage;
private int numPavillon;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPavillon() {
        return numPavillon;
    }

    public void setNumPavillon(int numPavillon) {
        this.numPavillon = numPavillon;
    }

    public int getNombreEtage() {
        return nombreEtage;
    }

    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }

    @Override
    public String toString() {
        return "[ id : "+id + " numeropav : "+numPavillon+ " Nombre etage : "+ nombreEtage+ " ] \n";
    }
}

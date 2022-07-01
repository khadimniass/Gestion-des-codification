package models;

public class Pavillon {
private int id;
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

    @Override
    public String toString() {
        return "[ id :"+id + "numeropav : "+numPavillon+" ]";
    }
}

package models;

public class Chambre {
    private int id;
    private String numeroChambre;

    private Pavillon pavillon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public String genNumberchambre(int numb){
        return "CHAMBRE"+numb;
    }
    @Override
    public String toString() {
        return "Chambre { " +
                "id=" + id +
                ", numeroChambre=" + numeroChambre +
                ", pavillon=" + pavillon +
                " } ";
    }
}
package fr.app.produit;

public class Produit {

    int id;
    String label;
    float prix;

    public Produit() {

    }


    public Produit(int id, String label, float prix) {
        this.id = id;
        this.label = label;
        this.prix = prix;
    }

    public String getLabel() {
        return label+" "+prix+"€";
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void changeProduct(int id){

    }


    public void addProduct(int id, String label, float prix){

    }


    public void contains(String p) {
    }
}

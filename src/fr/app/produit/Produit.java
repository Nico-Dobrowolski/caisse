package fr.app.produit;

public class Produit implements IProduit {

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
        return id+":"+label+" "+prix+"€";
    }

    public float getPrix() {
        return prix;
    }


}

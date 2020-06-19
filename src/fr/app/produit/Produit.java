package fr.app.produit;

public class Produit implements IProduit {

    int id;
    String label;
    float prix;

    public Produit() {

    }
    //Instance d'un produit
    public Produit(int id, String label, float prix) {
        this.id = id;
        this.label = label;
        this.prix = prix;
    }
    //récupère les info des produits
    public String getLabel() {
        return id+":"+label+" "+prix+"€";
    }
    //récupère son prix
    public float getPrix() {
        return prix;
    }


}

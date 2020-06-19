package fr.app.panier;

import fr.app.produit.IProduit;
import fr.app.produit.Produit;

import java.util.List;

public class Panier implements IPanier {
    List produit;
    float prixTotal;

    public Panier() {
    }
    //Recupere une liste de produit
    public void saveOrder(List produit) {
        this.produit = produit;
    }
    //Affiche le prix gloabl
    public float getPrixTotal() {
        return prixTotal;
    }
    //Sert à faire le cumule des achats
    public void setPrixTotal(float prixTotal) {
        this.prixTotal = this.prixTotal + prixTotal;
    }
}

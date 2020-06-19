package fr.app.panier;

import fr.app.produit.IProduit;
import fr.app.produit.Produit;

import java.util.List;

public class Panier implements IPanier {
    List produit;
    float prixTotal;

    public Panier() {

    }

    public void saveOrder(List produit) {
        this.produit = produit;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = this.prixTotal + prixTotal;
    }
}

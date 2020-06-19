package fr.app;
import fr.app.produit.Produit;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Produit> listeProduit = new ArrayList<>();

        System.out.println("_________________");
        System.out.println("CESI Marketplace");
        System.out.println("_________________");
        Scanner sc = new Scanner(System.in);
        int sousmenu = 0;
        boolean arret = false;
        while (!arret){
            System.out.println("=== Menu principal ===");
            System.out.println("1 - Gestion produit");
            System.out.println("2 - Gestion panier");
            System.out.println("9 - Quitter ");
            sousmenu = sc.nextInt();
            switch(sousmenu)
            {
                case 1 :{
                    int choix_sm_one = 0;
                    System.out.println("---Gestion produit---");
                    System.out.println("1 - Ajouter un produit");
                    System.out.println("2 - Modifier un produit");
                    System.out.println("3 - Supprimer un produit ");
                    System.out.println("4 - Modifier un produit");
                    System.out.println("9 - Quitter ");
                    choix_sm_one =  sc.nextInt();
                    switch(choix_sm_one){
                        //Call function addProduct
                        case 1 : {

                            /*
                            *
                            * /!\ impossible d'ajouter des produits avec new Produit en boucle car il ne garde pas le n-1
                            *
                            * */

                            //Récuperation des infos produit
                            System.out.println("id du produit");
                            int product_id =  sc.nextInt();
                            //////////////////////////////////////
                            System.out.println("Label du produit");
                            String product_label =  sc.next();
                            //////////////////////////////////////
                            System.out.println("Prix du produit");
                            float product_prix = sc.nextFloat();
                            //////////////////////////////////////
                            //Création du produit avec la class Produit
                            Produit newProduit = new Produit(product_id,product_label,product_prix);
                            listeProduit.add(newProduit);
                        }
                        break;
                        //Call function changeProduct
                        case 2 : {
                            System.out.println("Voici la liste des produits");
                            Stream<Produit> str = listeProduit.stream();
                            str.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                            //Récuperation des infos produit
                            System.out.println("id du produit");
                            int product_id =  sc.nextInt();
                            //////////////////////////////////////
                            System.out.println("Label du produit");
                            String product_label =  sc.next();
                            //////////////////////////////////////
                            System.out.println("Prix du produit");
                            float product_prix = sc.nextFloat();
                            //////////////////////////////////////
                            System.out.println("Selectionner un porduit à modifier ex: 0 -> le produit le plus haut de la liste");
                            int index =  sc.nextInt();
                            //Modification du produit avec la class Produit
                            listeProduit.set(index,  new Produit(product_id,product_label,product_prix));
                        }
                        break;
                        //Call function deleteProduct
                        case 3 : {
                            System.out.println("Voici la liste des produits");
                            Stream<Produit> str = listeProduit.stream();
                            str.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                            System.out.println("Selectionner un porduit à supprimer ex: 0 -> le produit le plus haut de la liste");
                            int index =  sc.nextInt();
                            listeProduit.remove(index);
                            System.out.println("Voici la nouvelle liste des produits");
                            Stream<Produit> strNew = listeProduit.stream();
                            strNew.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            strNew.close();
                        }
                        break;
                        case 9 : sousmenu = 0;
                        break;
                        default : System.out.println("entrez un choix entre");
                        break;
                    }
                } break;
                case 2 :{
                    int choix_sm_two = 0;
                    System.out.println("--- Gestion panier ---");
                    System.out.println("1 - Ajouter un produit au panier");
                    System.out.println("2 - Supprimer un produit du panier");
                    System.out.println("4 - Afficher le détail du Panier avec le total");
                    System.out.println("5 - Valider le panier ");
                    System.out.println("9 - Quitter");
                    choix_sm_two =  sc.nextInt();
                    switch(choix_sm_two){
                        case 1 : System.out.println("Sous menu 1-1");
                        break;
                        case 2 : System.out.println("Sous menu 1-2");
                        break;
                        case 3 : System.out.println("Sous menu 1-3");
                        break;
                        case 4 : System.out.println("Sous menu 1-4");
                        break;
                        case 5 : System.out.println("Sous menu 1-5");
                        break;
                        case 9 : sousmenu = 0;
                        break;
                        default : System.out.println("entrez un choix");
                        break;
                    }
                } break;
                case 9 : arret = true;
                break;
                default : System.out.println("entrez un choix");
                break;
            }
        }
    }
}

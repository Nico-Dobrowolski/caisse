package fr.app;
import fr.app.panier.Panier;
import fr.app.produit.Produit;

import java.util.Scanner;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Collections;
import java.io.*;
import java.io.PrintWriter;
public class Main {

    public static void main(String[] args) {
        Panier panier = new Panier();
        List<Produit> listeProduit = new ArrayList<>();
        List<Produit> listeMyProduit = new ArrayList<>();
        //Generation de jeux de données pour les tests
        listeProduit.add(new Produit(0,"PC",842));
        listeProduit.add(new Produit(1,"Tablette",210));
        listeProduit.add(new Produit(2,"TV",980));
        System.out.println("_________________");
        System.out.println("CESI Marketplace");
        System.out.println("_________________");
        //Input clavier
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
                    System.out.println("3 - Afficher le détail du Panier avec le total");
                    System.out.println("4 - Valider le panier ");
                    System.out.println("9 - Quitter");
                    choix_sm_two =  sc.nextInt();
                    switch(choix_sm_two){
                        case 1 : {
                            System.out.println("---------------------------------------");
                            System.out.println("Voici la liste des produits en vente");
                            Stream<Produit> str = listeProduit.stream();
                            str.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                            System.out.println("---------------------------------------");
                            System.out.println("Voici ton panier");
                            Stream<Produit> strMyProduit = listeMyProduit.stream();
                            strMyProduit.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                            System.out.println("Selectionne un porduit à ajouter ex: 0 -> le produit le plus haut de la liste");
                            int index = sc.nextInt();
                            listeMyProduit.add(listeProduit.get(index));
                            System.out.println("Mise à jour du panier");
                            Stream<Produit> updateStrMyProduit = listeMyProduit.stream();
                            updateStrMyProduit.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                        }
                        break;
                        case 2 : {
                            System.out.println("Voici Ton panier");
                            Stream<Produit> str = listeMyProduit.stream();
                            str.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                            System.out.println("Selectionner un porduit à supprimer ex: 0 -> le produit le plus haut de la liste");
                            int index =  sc.nextInt();
                            listeProduit.remove(index);
                            System.out.println("Voici l'update de ton panier");
                            Stream<Produit> strNew = listeMyProduit.stream();
                            strNew.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            strNew.close();
                        }
                        break;
                        case 3 : {
                            System.out.println("Voici Ton panier qui ne demande qu'a être vérifié");
                            Stream<Produit> str = listeMyProduit.stream();
                            str.map(p -> p.getLabel()).forEach(p -> System.out.println(p));
                            str.close();
                            System.out.println("Total de la commande");

                            Stream<Produit> strPrix= listeMyProduit.stream();

                            strPrix.map(p -> p.getPrix()).forEach(p -> panier.setPrixTotal(p));

                            strPrix.close();
                            System.out.println(panier.getPrixTotal() +"€");
                        }
                        break;
                        case 4 : {
                            System.out.println("Avez vous bien vérifier avant achat definitif ? (true or false)");

                            boolean check = sc.nextBoolean();
                            if(check){
                                System.out.println("Achat validé !");
                                //écriture dans le fichier serai bien
                                panier.saveOrder(listeMyProduit);
                            }else{
                                System.out.println("Retour au menu pour vérification");
                            }
                            ///
                        }
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

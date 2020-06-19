package fr.app;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
                        case 1 : System.out.println("Sous menu 1-1");
                        break;
                        //Call function changeProduct
                        case 2 : System.out.println("Sous menu 1-2");
                        break;
                        //Call function deleteProduct
                        case 3 : System.out.println("Sous menu 1-3");
                        break;
                        //Call function modifyProduct
                        case 4 : System.out.println("Sous menu 1-4");
                        break;
                        case 9 : arret = true;
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
                        case 9 : arret = true;
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

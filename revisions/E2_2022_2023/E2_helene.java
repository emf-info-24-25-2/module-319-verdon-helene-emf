import java.util.Scanner;

public class E2_helene {

    public final static int PRIX_CATEGORIE_UN = 25;
    public final static int PRIX_CATEGORIE_DEUX = 18;
    public final static int PRIX_CATEGORIE_TROIS = 12;
    public final static int[] CATEGORIE_SALLE = { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3 };

    public static void afficherTarifs() {
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
        System.out.println("Catégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF");
    }

    // méthode qui sert à afficher la catégorie et quelle place sont occupées ou
    // libres
    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("Occupation de la salle :");
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {          
            if (i == occupationSalle.length - 1) {
                System.out.println(" " + CATEGORIE_SALLE[i] + " ");
            } else {
                System.out.print(" " + CATEGORIE_SALLE[i] + " ");
            }
        }

        for (int i = 0; i < occupationSalle.length; i++) {
            if (occupationSalle[i] == true) {
                if (i == occupationSalle.length - 1) {
                    System.out.println(" X ");
                } else {
                    System.out.print(" X ");
                }
            } else {
                if (i == occupationSalle.length - 1) {
                    System.out.println(" O ");
                } else {
                    System.out.print(" O ");
                }
            }
        }
    }

    // méthode qui trouve la première place libre qui correspond a la catégorie
    // demandée
    public static int trouverPlace(int categorie, boolean[] occupationSalle) {
        int index = -1;
        for (int i = 0; i < occupationSalle.length; i++) {
            if ((CATEGORIE_SALLE[i] == categorie) && !occupationSalle[i] ) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static boolean[] commanderBillet(boolean[] occupationSalle) {
        System.out.print("Quelle catégorie voulez vous : ");
        Scanner scanner1 = new Scanner(System.in);
        int categorie = scanner1.nextInt();
        if ((categorie == 1) || (categorie == 2) || (categorie == 3)) {
            int positionPlace = trouverPlace(categorie, occupationSalle);
            if (positionPlace != -1) {
                occupationSalle[positionPlace] = true;
                switch (categorie) {
                    case 1:
                        System.out.println("Votre place est réservée et coûte " + PRIX_CATEGORIE_UN + " CHF");
                        break;
                    case 2:
                        System.out.println("Votre place est réservée et coûte " + PRIX_CATEGORIE_DEUX + " CHF");
                        break;
                    case 3:
                        System.out.println("Votre place est réservée et coûte " + PRIX_CATEGORIE_TROIS + " CHF");
                        break;
                }
            } else {
                System.out.println("Aucune place disponible");
            }
        } else {
            System.out.println("Cette catégorie n'existe pas");
        }
        return occupationSalle;
    }

    public static void main(String[] args) {
        boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length];
        int commande = -1;
        while (commande != 0) {
            System.out.print("---------------------------------------------------------------------------------------------");
            System.out.println("-");
            System.out.println(
            "1 = Commander un billet, 2 = Afficher les tarifs, 3 = Afficher l'état de la salle, 0 = Quitter");
            Scanner scanner2 = new Scanner(System.in);
            commande = scanner2.nextInt();
        switch (commande) {
            case 0:
                System.out.println("Au revoir");
                break;
            case 1:
                occupationSalle = commanderBillet(occupationSalle);
                break;
            case 2:
                afficherTarifs();
                break;
            case 3:
                afficherSalle(occupationSalle);
                break;
            default:
                System.out.println("Commande inconnue");
                break;
        }
    }

    }

}
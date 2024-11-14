public class devoir06 {
    public static void main(String[] args) {
        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "]" + " = " + "[" + tableau[i] + "]");
        }
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);
        System.out.println("La plus grande valeur trouvée est : " + max);

        int valeur1 =12;
        int index = rechercheValeur(tableau, valeur1);
        if (index >=0) {
            System.out.println("La valeur " + valeur1 + " se trouve dans la cellule numéro " + index + ".");
        } else {
            System.out.println("La valeur " + valeur1 + " n'apparaît pas dans le tableau.");
        }
        //utilisez aussi votre méthode de recherche de valeur
    }

    public final static int TAILLE_TABLEAU = 20;
    public final static int VALEUR_MIN = 0;
    public final static int VALEUR_MAX = 50;
    public final static int VALEUR_RECHERCHE = 7;

    public static int[] genereTableau(int valeurMin, int valeurMax, int tailleTableau) {
        int[] tableau = new int[tailleTableau];
        for (int i = 0; i < tableau.length; i++) {
            int nombreAleatoire = (int) (Math.random() * (valeurMax - valeurMin)) + valeurMin;
            tableau[i] = nombreAleatoire;
        }
        return tableau;
    }

    public static int rechercheMin(int[] tableau) {
        //pensez à toujours donner des noms de variables avec des minuscules
        int min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static int rechercheValeur(int[] tableau, int valeurRecherche) {
        int index = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherche) {
                index = i;
                break;
            }
        }
        return index;
    }

}

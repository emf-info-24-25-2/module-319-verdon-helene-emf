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
        int Min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < Min) {
                Min = tableau[i];
            }
        }
        return Min;
    }

    public static int rechercheMax(int[] tableau) {
        int Max = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > Max) {
                Max = tableau[i];
            }
        }
        return Max;
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

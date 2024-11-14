import java.nio.channels.Pipe.SourceChannel;

public class devoir07 {

    public final static int TAILLE_TABLEAU = 10;
    public final static int MIN_NOMBRE = -8;
    public final static int MAX_NOMBRE = 8;
    public final static int VALEUR_RECHERCHE = 7;
    
    public static int[] genererValeurAleatoires(int nbrValeurAGenerer, int min, int max) {
        int[] tableau = new int[nbrValeurAGenerer];
        for (int i = 0; i < tableau.length; i++ ) {
            tableau[i] = ( int ) ( Math.random() * ( max - min + 1) ) + min;
        }
        return tableau;
    }

    public static int positionValeur(int[]tableau, int valeurAChercher) {
        int index = -1;
        for (int i = 0; i < tableau.length; i++ ) {
            if (tableau[i] == valeurAChercher ) {
                index = i;
                continue;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] tableau = genererValeurAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);
        int index = positionValeur(tableau, VALEUR_RECHERCHE);
        System.out.println("Le tableau d'entier généré contient : " + TAILLE_TABLEAU + " valeurs" );
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < tableau.length; i++ ) {
            System.out.println("tableau[" + i + "]" + " = " + tableau[i]);
        }
        if (index >= 0) {
            System.out.println("La valeur " + VALEUR_RECHERCHE + " se trouve dans la cellule " + index + " pour la première fois.");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHE + " ne se trouve pas dans le tableau");
        }
    }
}
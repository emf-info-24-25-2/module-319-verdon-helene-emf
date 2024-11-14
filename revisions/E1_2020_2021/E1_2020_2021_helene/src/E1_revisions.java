public class E1_revisions {
  
    public final static int LIBRE = 0;
    public final static int OCCUPEE = 1;
    public final static int TOUCHEE = 2;

    public final static int TAILLE_GRILLE = 20;
    public final static int NBRE_BATEAUX = 5;

    // methode pour choisir un nombre aleatoire entre 1 et le dernier index de la grille
    public static int choisirIndexAleatoire(int min, int max) {
        int aleatoire = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return aleatoire;
    }

    // methode pour générer une grille et tant que tous les bateaux a placer ne le sont pas, elle choisit un nouvel index aleatoire
    public static int[] gernererGrille(int tailleGrille, int nbreBateaux) {
        int[] grille = new int[tailleGrille];
        int nbreBateauxPlaces = 0;
        int min = 1;
        int max = tailleGrille--;
        while (nbreBateauxPlaces < nbreBateaux) {
            int aleatoire = choisirIndexAleatoire(min, max);
            if (grille[aleatoire] == LIBRE) {
                grille[aleatoire] = OCCUPEE;
                nbreBateauxPlaces ++;
            }
        }
        return grille;
    }

    public static boolean testerGrille(int[]tableau) {
        int nbreIndexOccupes = 0;
        boolean testSiTermine = true;
        for (int i = 0; 0 < tableau.length; i++) {
            if (tableau[i] == OCCUPEE) {
                nbreIndexOccupes ++;
            }
        }
        if (nbreIndexOccupes > 0) {
            testSiTermine = false;
        }
        return testSiTermine;
        }


    public static void main(String[] args) {
        boolean jeuTermine = false;
        int nbreCoups = 0;
        int[] grille = gernererGrille(TAILLE_GRILLE, NBRE_BATEAUX);
        boolean terminer = testerGrille(grille);
        int min = 1;
        int max = TAILLE_GRILLE-1;
        while (terminer == false) {
            int aleatoire = choisirIndexAleatoire(min, max);
            int valeurCelluleVisee = grille[aleatoire];
            int celluleVisee = aleatoire;
            nbreCoups++;
            System.out.println("Le joueur vise la cellule " + celluleVisee + "...");

            switch (valeurCelluleVisee) {
                case LIBRE :
                System.out.println("A l'eau");
                case OCCUPEE :
                System.out.println("Touché");
                grille[aleatoire] = TOUCHEE;
                case TOUCHEE :
                System.out.println("Deja touchée...");
            }

            if (jeuTermine == true) {
                System.out.println("Le jeu est terminé en " + nbreCoups + " coups.");
                jeuTermine = true;
            }
        }
    }
}

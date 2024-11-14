public class E1_2021_2022 {
    
    public final static int MIN = 2;
    public final static int MAX = 14;

    public static int tirerUneCarte(int min, int max) {
        int carteTiree = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return carteTiree;
    }

    public static int determinerIndexGagnant(int[] score) {
        int indexValeur = 0;
        for (int i = 0; i < score.length; i++) {
            if ((score[i] > indexValeur) && (score[i] >= 21)) {
               indexValeur = i;
            }
        }
        return indexValeur;
    }
    
    public static String donnerNomCarte(int carte) {
        String nom;
        if ((carte >= 2) && (carte <= 10)) {
            nom = String.valueOf(carte)
        } else {
            switch (carte) {
                case 11:
                    nom = "valet";
                    break;
                case 12:
                nom = "dame";
                    break;
                case 13 :
                nom = "roi";
                    break;
                case 14:
                nom = "as";
                    break;
                default :
                nom = "indeterminé";

            }
        }
    }

    public static void main(String[] args) throws Exception {
        String[] joueurs = {"Jacques", "Pierre", "Paul"};
        int[] scores = new int[3];
        boolean jeuTermine = false;
        while (jeuTermine == false) {
            for (int i = 0; i < joueurs.length; i++) {
                int[] carte = new int[joueurs.length];
                carte[i] = tirerUneCarte(MIN, MAX);
            }
        }
        
    }
}

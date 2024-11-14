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
        if ((carte > 2) && (carte < 10)) {
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        
    }
}

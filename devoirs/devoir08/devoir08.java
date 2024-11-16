package devoirs.devoir08;

public class devoir08 {

    public final static String[] CARACTERE = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};
    public final static int TAILLE_MOT_DE_PASSE = 15;
    public final static int NBR_ESSAI = 5;

    public final static String genereMotDePasse(int tailleMdp) {
        String resultat = "";
        while (resultat.length() < tailleMdp) {
            int min = 0;
            int max = 19;
            int random = ( int ) ( Math.random() * (max - min + 1) ) + min;
            resultat += CARACTERE[random];
        }
        return resultat;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE);
            System.out.println(motDePasse);
        }
    }
}

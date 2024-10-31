
import java.util.Random;

public class methodesTableaux {

    public static void main(String[] args) {
      int[] tableauMain = creerTableau(5);
      for(int j = 0; j < tableauMain.length; j++) {
        System.out.println(tableauMain[j]);
      }

      remplirTableau(tableauMain, 15);
      for(int k = 0; k < tableauMain.length; k++) {
        System.out.println(tableauMain[k]);
      }
      remplirTableauAleatoire(tableauMain);
      for(int l = 0; l < tableauMain.length; l++) {
        System.out.println(tableauMain[l]);
      }
    }




    //1
    public static int[] creerTableau(int taille) {
        int[] monTableau = new int[taille];
        return monTableau;
    }

    //2
    public static int[] remplirTableau(int[] tableauMain, int valeur) {
        for(int i = 0; i < tableauMain.length; i++) {
            tableauMain[i] = valeur;
        }
        return tableauMain;
    }

    //3
    public static int[] remplirTableauAleatoire(int[] tableauMain) {
        for (int i = 0; i < tableauMain.length; i++) {
            
            int valeurAleatoire = new Random().nextInt(100);
            tableauMain[i] = valeurAleatoire;
        }
        return tableauMain;
    }
}



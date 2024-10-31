
import java.util.Random;

public class methodesTableaux {

    public static void main(String[] args) {
      System.out.println("Exercice 1 :");
      int[] tableauMain = creerTableau(5);
      for(int j = 0; j < tableauMain.length; j++) {
        System.out.println(tableauMain[j]);
      }

      System.out.println("Exercice 2 :");
      remplirTableau(tableauMain, 15);
      for(int k = 0; k < tableauMain.length; k++) {
        System.out.println(tableauMain[k]);
      }

      System.out.println("Exercice 3 :");
      remplirTableauAleatoire(tableauMain);
      for(int l = 0; l < tableauMain.length; l++) {
        System.out.println(tableauMain[l]);
      }

      System.out.println("Exercice 4 :");
      obtenirTaille(tableauMain);
      System.out.println("Voici la taille du tableau : " + obtenirTaille(tableauMain));
      
      System.out.println("Exercice 5 :");
      contenuTableau(tableauMain);

      System.out.println("Exercice 6 :");
      trouverMinimum(tableauMain);

      System.out.println("Exercice 7 :");
      trouverMaximum(tableauMain);

      System.out.println("Exercice 8 :");
      int valeur = 15;
      System.out.println("La valeur " + valeur + " se retrouve " +  trouverFrequence(tableauMain,valeur) + " fois dans le tableau.");
    }




    //1 créer un tableau
    public static int[] creerTableau(int taille) {
        int[] monTableau = new int[taille];
        return monTableau;
    }

    //2 remplir le tableau avec une valeur fixe
    public static int[] remplirTableau(int[] tableauMain, int valeur) {
        for(int i = 0; i < tableauMain.length; i++) {
            tableauMain[i] = valeur;
        }
        return tableauMain;
    }

    //3 remplir le tableau avec des valeurs aléatoires
    public static int[] remplirTableauAleatoire(int[] tableauMain) {
        for (int i = 0; i < tableauMain.length; i++) {
            
            int valeurAleatoire = new Random().nextInt(100);
            tableauMain[i] = valeurAleatoire;
        }
        return tableauMain;
    }

    //4 donner la taille du tableau
    public static int obtenirTaille(int[]tableauMain) {
        return tableauMain.length;
    }

    //5 afficher le contenu d'un tableau
    public static void contenuTableau(int[]tableauMain) {
        for (int i = 0; i < tableauMain.length; i++) {
            System.out.println(tableauMain[i]);
        }
    }
    
    //6 trouver la valeur minimum d'un tableau
    public static int trouverMinimum(int[]tableauMain) {
       int valeurMinimum = tableauMain[0];
       for (int i = 0; i < tableauMain.length; i++) {
        if (tableauMain[i] < valeurMinimum) {
            valeurMinimum = tableauMain[i];
        }
       }
       System.out.println(valeurMinimum);
       return valeurMinimum;
    }

    //7 trouver la valeur maximum d'un tableau
    public static int trouverMaximum(int[]tableauMain) {
        int valeurMaximum = tableauMain[0];
        for (int i = 0; i < tableauMain.length; i++) {
         if (tableauMain[i] > valeurMaximum) {
             valeurMaximum = tableauMain[i];
         }
        }
        System.out.println(valeurMaximum);
        return valeurMaximum;
     }

     //8 trouver la fréquence d'une valeur d'un tableau
     public static int trouverFrequence(int[]tableauMain, int valeur) {
        int fréquence = 0; 
        for (int i = 0; i < tableauMain.length; i++) {
            if (tableauMain[i] == valeur) {
                fréquence++;
            }
        }
        return fréquence;
    }
}




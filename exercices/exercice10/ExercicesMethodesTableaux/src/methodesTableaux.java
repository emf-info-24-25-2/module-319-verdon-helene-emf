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

      System.out.println("Exercice 9 :");
      System.out.println("Somme de toutes les valeurs du tableau : " + trouverSomme(tableauMain));

      System.out.println("Exercice 10 :");
      double moyenneTableau = trouverMoyennes(tableauMain);
      System.out.println("La moyenne du tableau est de : " + moyenneTableau);

      System.out.println("Exercice 11 :");
      for (int i = 0; i < tableauMain.length; i++) {
        System.out.println(tableauMain[i]);
      }
      int valeurAvant = 6;
      int valeurApres = 12;
      System.out.println("tableauMain avant : ");
      for (int i = 0; i < tableauMain.length; i++) {
        System.out.println(tableauMain[i]);
      }
      System.out.println("tableauMain après");
      tableauMain = remplacerValeurTableau(tableauMain, valeurAvant, valeurApres);
      for (int i = 0; i < tableauMain.length; i++) {
        System.out.println(tableauMain[i]);
      }

      System.out.println("Exercice 12 :");
      int nbrRecherche = 16;
      int premiereOccurence = recherchePremiereOcurrence(tableauMain, nbrRecherche);
      if (premiereOccurence >= 0) { 
        System.out.println("La première occurence du nombre " + nbrRecherche + " dans le tableau est dans la cellule numéro " + premiereOccurence );
      } else {
        System.out.println("Le nombre " + nbrRecherche + " n'apparaît pas dans le tableau");
      }
    }





    //1 créer un tableau
    public static int[] creerTableau(int taille) {
        int[] monTableau = new int[taille];
        return monTableau;
    }

    //2 remplir le tableau avec une valeur fixe
    public static int[] remplirTableau(int[] stroumf, int valeur) {
        for(int i = 0; i < stroumf.length; i++) {
            stroumf[i] = valeur;
        }
        return stroumf;
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
    

    //9 faire la somme de chaque valeur du tableau
    public static int trouverSomme(int[] tableauMain) {
        int somme = 0;
        for (int i = 0; i < tableauMain.length; i++) {
           somme += tableauMain[i];
        }
        return somme;
    }

    //10 Etablir la moyenne des valeurs contenues dans un tableau
    public static double trouverMoyennes(int[] tableauMain) {
        double moyenne = 0;
        for (int i = 0; i < tableauMain.length; i++) {
            moyenne += tableauMain[i];
        }
        moyenne /= tableauMain.length;
        return moyenne;
 
    }

    
    //11 Remplacer une valeru par une autre dans un tableau
  
    public static int[] remplacerValeurTableau (int[]tableauMain, int valeurRechercher, int valeurRemplacement) {
        for (int i = 0; i < tableauMain.length; i++) {
            if (tableauMain[i] == valeurRechercher) {
            tableauMain[i] = valeurRemplacement;
            }
        }
        return tableauMain;
    }


    //12 Rechercher la prmière occurence d'une valeur dans un tableau
    public static int recherchePremiereOcurrence (int[]tableauMain, int valeurRechercher) {
        int premiereOccurence = -1;
        for (int i = 0; i < tableauMain.length; i++) {
            if (tableauMain[i] == valeurRechercher) {
                premiereOccurence = i;
                break;
            }
        }
        return premiereOccurence;
    }

}







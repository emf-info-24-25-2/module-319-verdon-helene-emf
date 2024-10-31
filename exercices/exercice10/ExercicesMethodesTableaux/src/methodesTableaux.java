public class methodesTableaux {
    public static void main(String[] args) {
        int[] tableauMain = creerTableau(5);
        for(int j = 0; 0 < tableauMain.length; j++) {
            System.out.println(tableauMain[j]);
        }

        remplirTableau(tableauMain, 15);
        for(int k = 0; 0 < tableauMain.length; k++) {
            System.out.println(tableauMain[k]);
        }
    }





    public static int[] creerTableau(int taille) {
        int[] monTableau = new int[taille];
        return monTableau;
    }


    public static int[] remplirTableau(int[] tableauMain, int valeur) {
        for(int i = 0; i < tableauMain.length; i++) {
            tableauMain[i] = valeur;
        }
        return tableauMain;
    }

}


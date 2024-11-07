public class inversionTableau {
    public final static int MIN = 0;
    public final static int MAX = 100; 
    public static void main(String[] args) {
        System.out.println("Premier tableau Initial");
        int[] tableauInitial1 = {1, 2, 3, 4, 5};
        int[] tableauInverse;
        tableauInverse = inverseLeTableau(tableauInitial1);

        System.out.println("Premier tableau inversé : ");
        for (int i = 0; i < tableauInverse.length; i++) {
            System.out.println(tableauInverse[i]);
        }

       
        System.out.println("Deuième tableau initial");
        int[] tableauInitial2;
        tableauInitial2 = new int[4];
        for (int i = 0; i < tableauInitial2.length; i++) {
            tableauInitial2[i] = ( int ) (Math.random() * (MAX - MIN) ) + MIN;
            System.out.println(tableauInitial2[i]);
        }

        System.out.println("Deuxième tableau inversé : ");
        int[] tableauFinal;
        tableauFinal = inverseLeTableau(tableauInitial2);
        for (int j = 0; j < tableauFinal.length; j++) {
            System.out.println(tableauFinal[j]);
        }
    }
    
    
    
    //méthode inverseLeTableau
    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i ];
        }

        return tableauInverse;

    }


}
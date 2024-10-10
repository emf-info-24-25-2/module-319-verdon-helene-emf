public class App {
    
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        int[] tableauInverse = inverseLeTableau(tableau);

        System.out.println("Tableau inversé : ");
        for (int i = 0; i < tableauInverse.length; i++) {
            System.out.println(tableauInverse[i]);
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

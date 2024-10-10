public class App {
    
    int[] tableau = {1, 2, 3, 4};

    public static void  inverseLeTableau (int[] tableau) {
       
    
        int[] tableauInverse = new int[tableau.length];
        
        for (int j = 0; j < tableau.length; j++) {
            System.out.println(tableau[j]);
        }
        
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length-1-i];
            System.out.println(tableau[i]);

        }
    }
    public static void main(String[] args) throws Exception {  
    }



    

}

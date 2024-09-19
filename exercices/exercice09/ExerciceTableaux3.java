public class ExerciceTableaux3 {
    public final static int VALEUR_MAX = 6;
    public final static int VALEUR_MIN = 0;
    
     public static void main(String[] args) {
         
       
        int [] tableau1;
        tableau1 = new int[10];
 
        //assigner la valeur aléatoire différente à chaque cellule
         for (int a = 0; a<tableau1.length; a++) {
             int valeurAleatoire = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
             tableau1[a] = valeurAleatoire;
         }
         for (int b = 0; b<tableau1.length; b++){
             System.out.println("Cellule " + b + " : " + tableau1[b]);
         }

         //calculer la moyenne de l'adition des valeur de chaques cellules
         int somme = 0;
         for (int c = 0; c<tableau1.length; c++) {
           somme += tableau1[c];
         }
         somme /= tableau1.length;
         System.out.println("La moyenne de la classe est de " + somme);
        
 
    } 
}

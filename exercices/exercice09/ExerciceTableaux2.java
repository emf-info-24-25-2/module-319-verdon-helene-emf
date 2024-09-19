public class ExerciceTableaux2 {
   
   
   
    public static void main(String[] args) {
        
      
       int [] tableau1;
       tableau1 = new int[10];

       //assigner la valeur aléatoire de la constante à chaque cellule
        for (int a = 0; a<10; a++) {
            int valeurAleatoire = (int) (Math.random() * (6 - 0 + 1)) + 0;
            tableau1[a] = valeurAleatoire;
        }
        for (int b = 0; b<10; b++){
            System.out.println("Cellule " + b + " : " + tableau1[b]);
        }

   } 
}

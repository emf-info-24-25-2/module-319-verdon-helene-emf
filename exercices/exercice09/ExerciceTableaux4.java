public class ExerciceTableaux4 {
    
    public final static int VALEUR_MAX = 100;
    public final static int VALEUR_MIN = 0;

     
    public static void main(String[] args) {
        
    int valeur1 = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN) ) + VALEUR_MIN;

    int [] tableau1;
    tableau1 = new int [5];
   

    for (int i = 0; i < tableau1.length; i++){
        tableau1 [i] = valeur1 ++;
        System.out.println("Cellule " + i + " : " + tableau1 [i]);
    

    }
    
    }
}

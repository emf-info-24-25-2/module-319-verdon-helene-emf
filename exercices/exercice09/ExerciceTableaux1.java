public class ExerciceTableaux1 {
    public static void main(String[] args) {
        
        //déclaration d'un tableau int de 10 cellules
        int [] tableau1;
        tableau1 = new int[10];
                
       
        //déclaration d'un tableau String de 10 cellules
        String [] tableau2;
        tableau2 = new String[10];

       
    
        //lire toutes les cellules des deux tableaux
        for(int a=0; a<tableau1.length; a++) {
            System.out.println("Cellule " + a + " : " +  tableau1[a]);
        }
        for(int b=0; b<tableau2.length; b++) {
            System.out.println("Cellule" + b + " : " + tableau2[b]);
        }




    }
}

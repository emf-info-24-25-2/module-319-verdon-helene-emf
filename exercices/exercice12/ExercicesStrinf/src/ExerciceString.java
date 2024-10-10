public class ExerciceString {
    public static void main(String[] args) {
       String maChaineDeCaractere;
       maChaineDeCaractere = "Voici le contenu stocké dans un String.";
       
       System.out.println("nombre de caractères contenus dans la variable maChaineDeCaractère : " + maChaineDeCaractere.length());
       
       System.out.println("le mot 'contenu' commence à la position : " + maChaineDeCaractere.lastIndexOf("contenu"));
        //il commence a 0
       
        System.out.println("La position 10 contient la lettre : " + maChaineDeCaractere.charAt(10));
        //il commence a 0

        String monPrenom;
        monPrenom = "Hélène";

        for (int i = 0; i < monPrenom.length(); i++ ) {
            System.out.println( "La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }
         
        String texte = "test";
    
        
        if (monPrenom.contains(texte)) {
            System.out.println("La chaine " + monPrenom + " contient le texte " + texte);
        } else {
            System.out.println("La chaine de caractère  " + monPrenom + " ne contient pas le texte " + texte);
        }
    }
}

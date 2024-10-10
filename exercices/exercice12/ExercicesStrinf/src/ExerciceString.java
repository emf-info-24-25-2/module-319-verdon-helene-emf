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
            System.out.println( monPrenom.charAt(i));
        }




    }
}

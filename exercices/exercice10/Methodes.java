public class Methodes {
   
   
   
    public static void main(String[] args) {
       //appel de la méthode qui affiche Bonjour
        direBonjour(); 
       //appel de la méthode qui affiche le contenu de "texte"
       dire("il fait beau");


       //appel et test sur les méthodes Math. dans le main
       int lePlusPetitNombre = Math.min(46, 14);
       System.out.println("Math.min trouve le plus petit chiffre : " + lePlusPetitNombre);

       int lePlusGrandNombre = Math.max(98, 107);
       System.out.println("Math.max trouve le plus grand chiffre : " + lePlusGrandNombre);

       double laPuissanceDuNombre = Math.pow(2, 3);
       System.out.println("Math.pow met le premier chiffre à la puissance du 2ème : " + laPuissanceDuNombre);

       double laRacineDuNombre = Math.sqrt(16);
       System.out.println("Math.sqrt trouve la racine carré du nombre : " + laRacineDuNombre);

       int laValeurAbsolue = Math.abs(-10);
       System.out.println("Math.abs trouve la valeur absolue du nombre, sa distance à 0 : " + laValeurAbsolue);

    }


   
   //méthodes qui ne (retournent rien)
    public static void direBonjour() {
        System.out.println("Bonjour");
    }
    public static void dire (String texte) {
        System.out.println(texte);
    }

    


}
package devoirs.devoir05;

import java.util.Scanner;

public class devoir05 {

    public final static int MAX = 100;
    public final static int MIN = 1;

    public static void main(String[] args) {

        // déclarer un nouveau scanner
        Scanner scanner1 = new Scanner(System.in);

        // faire choisir un nombre entre un et cent à la machine
        int nombreMystere;
        nombreMystere = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        // dire au joureur que la machine a choisit un nombre entre 1 et cent
        System.out.println("L'ordinateur a choisi un nombre entre 1 et 100.");

        // faire une boucle qui se répète tant que le joueur de trouve pas la réponse
        int nombreDevine;
        do {
            // dire au joueur d'essayer de deviner le nombre et de l'écrire dans la console
            System.out.println("Essayez de deviner le nombre et entrez votre réponse dans la Console");

            // demander à la machine de lire le prochain int que le joueur va entrer et de
            // l'assigner a la variable
            nombreDevine = scanner1.nextInt();

            // faire en sorte que la machine analyse la réponse et renvoie la réponse au
            // joueur
            if (nombreDevine > nombreMystere) {
                System.out.println("Le nombre est trop grand, réaissayez");
            } else if (nombreDevine < nombreMystere) {
                System.out.println("Le nombre est trop petit, réaissayez");
            }
        } while (nombreDevine != nombreMystere);

        // si le nombre est deviné, le dire au joueur et fermer le scanner.
        System.out.print("Bravo, vous avez trouvé!");
        System.out.println(" " + "Le nombre à deviner était " + nombreMystere);

        // fermer le scanner
        scanner1.close();
    }
}
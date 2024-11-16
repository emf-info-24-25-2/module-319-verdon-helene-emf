public class devoir09 {

public final static int NBRE_CHIFFRES = 6;
public final static int MIN = 0;
public final static int MAX = 42;

public static int[] genereTirage(int nbreChiffreTirage, int min, int max) {
    int[] grille = new int[nbreChiffreTirage]; // Taille de la grille définie par nbreChiffreTirage
    int random;

    for (int i = 0; i < grille.length; i++) {
        boolean existeDeja;

        do {
            random = (int) (Math.random() * (max - min + 1)) + min; // Générer un nombre aléatoire
            existeDeja = false;

            // Vérifier si le nombre existe déjà dans la grille
            for (int j = 0; j < i; j++) {
                if (grille[j] == random) {
                    existeDeja = true;
                    break; // Sortir de la boucle si un doublon est trouvé
                }
            }
        } while (existeDeja); // Si doublon trouvé, régénérer un autre nombre

        // Ajouter le nombre unique à la grille
        grille[i] = random;
    }

    return grille;
}

}
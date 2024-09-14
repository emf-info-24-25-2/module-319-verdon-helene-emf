public class ExerciceBoucles1 {

    public static void main(String[] args) {

        // essais boucle for
        for (int a = 0; a < 6; a++) {
            System.out.println("Boucle for, itération " + a);
        }

        // essais boucle while
        int b = 0;
        while (b < 5) {
            b++;
            System.out.println("Boucle while, itération " + b);
        }

        // essais boucle do while
        int c = 0;
        do {
            c++;
            System.out.println("Boucle do while, itération " + c);
        } while (c < 5);

        // essais boucle for en n'affiachant
        for (int a = 0; a < 6; a++) {
            if (a == 3) {
                continue;
            }
            System.out.println("Boucle for, itération " + a);
        }

        // essais boucle while en s'arrêtant après la 3ème itération
        int d = 0;
        while (d < 5) {
            d++;
            if (d == 4) {
                break;
            }
            System.out.println("Boucle while, itération " + d);

        }

    }
}
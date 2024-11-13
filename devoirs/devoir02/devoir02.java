public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    //RIF: très bien!
    public static void main(String[] args) {

        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * ((CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B) - 0 + 1)) + 0;
        
        System.out.println("Le remplissage est de " + remplissage);


        while ((reservoirA < CAPACITE_RESERVOIR_A) && (reservoirA + reservoirB != remplissage)) {
            reservoirA++;
            System.out.println("le reservoir A est à " + reservoirA + " et le reservoir B est à " + reservoirB);

        }
        while ((reservoirB < CAPACITE_RESERVOIR_B) && (reservoirA + reservoirB != remplissage)) {
            reservoirB++;
            System.out.println("Le reservoir A est à " + reservoirA + " et le reservoir B est à " + reservoirB);

        }

    }

}

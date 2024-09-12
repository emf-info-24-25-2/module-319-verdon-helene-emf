public class ExerciceSwitch1 {

    public static void main(String[] args) {

        // essais avec un test if/else

        int noteDuModule = 6;

        if (noteDuModule == 1) {
            System.out.println("Travail non rendu");
        } else if (noteDuModule == 2) {
            System.out.println("Très insuffisant");
        } else if (noteDuModule == 3) {
            System.out.println("insuffisant");
        } else if (noteDuModule == 4) {
            System.out.println("suffisant");
        } else if (noteDuModule == 5) {
            System.out.println("Bien");
        } else if (noteDuModule == 6) {
            System.out.println("Très bien");
        }

        // essais avec un switch

        switch (noteDuModule) {
            case 1:
                System.out.println("Travail non rendu");
                break;

            case 2:
                System.out.println("Très insuffisant");
                break;

            case 3:
                System.out.println("insuffisant");
                break;

            case 4:
                System.out.println("suffisant");
                break;

            case 5:
                System.out.println("Bien");
                break;

            case 6:
                System.out.println("Très bien");
                break;
        }

    }
}
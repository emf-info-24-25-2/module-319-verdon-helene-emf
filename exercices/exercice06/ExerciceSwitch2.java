public class ExerciceSwitch2 {
    public static void main(String[] args) {

        int age = 11;

        // essais avec un test if/else

        if (age == 7) {
            System.out.println("Poussin (avec if/else)");
        } else if ((age == 8) || (age == 9)) {
            System.out.println("Pupille (avec if/else)");
        } else if ((age == 10) || (age == 11)) {
            System.out.println("Minime (avec if/else)");
        } else {
            System.out.println("Inconnu (avec if/else)");
        }

        // essais avec un switch

        switch (age) {
            case 7:
                System.out.println("Poussin (avec un switch)");
                break;
            case 8:
            case 9:
                System.out.println("Pupille (avec un switch)");
                break;
            case 10:
            case 11:
                System.out.println("Minime (avec un switch)");
                break;
            default:
                System.out.println("Inconnu (avec un switch)");
        }

    }
}

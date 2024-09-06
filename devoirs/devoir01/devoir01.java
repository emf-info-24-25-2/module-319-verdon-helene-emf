public class devoir01 {

  public static void main(String[] args) {

    byte monAge = 16;
    boolean estMajeur = (monAge > 20);

    System.out.println("Je m'appelle Hélène Verdon");
    System.out.println("Mon âge est de " + monAge + " ans.");

    if (estMajeur) {
      System.out.println("Je suis majeure.");
    
    }

    else {
      System.out.println("Je ne suis pas encore majeure.");
    
    }
  }
}
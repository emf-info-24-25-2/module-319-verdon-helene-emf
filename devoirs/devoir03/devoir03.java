public class devoir03 {
    public static void main(String[] args) {

        // déclaration des variables
        int jour;
        int mois;
        int annee;
        int numeroDuJour;
        int moisPair;
        int moisImpair;
        int fevrier;

        int nombreJourParMois;

        // assignation de ces variables
        jour = 23;
        mois = 9;
        annee = 2024;

        numeroDuJour = 0;
        moisPair = 30;
        moisImpair = 31;
        fevrier = 28;

        // déterminer que si le mois est janvier le numero du jour est egal au jour (par
        // exemple le 21 janvier est le jour 21 de l'an)
        
            if (annee % 4 == 0) {
               
               
                if (mois-1 != 0) {

                    if ((mois-1) % 2 == 0) {
                        numeroDuJour = (((mois - 1) / 2) * moisPair) + (((mois - 1) / 2) * moisImpair) + (jour);
                    } else {
                        numeroDuJour = (((mois - 2) / 2) * moisPair) + (((mois - 2) / 2) * moisImpair) + (moisImpair) + (jour);
                    }
                    System.out.println(numeroDuJour);

                } else {
                    System.out.println(jour);
                }
            }

       

    }
}

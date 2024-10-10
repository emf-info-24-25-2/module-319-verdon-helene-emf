public class devoir03 {
    public static void main(String[] args) {

            int jour;
            int mois;
            int annee;
            int numeroDuJour;
            int moisCourt;
            int moisLong;
            int fevrier;
    
            // assignation des  variables.
            jour = 23;
            mois = 9;
            annee = 2024;
    
            numeroDuJour = 0;
            moisCourt = 30;
            moisLong = 31;
    
            // Vérifier si l'année est bissextile
            if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                fevrier = 29;
            } else {
                fevrier = 28;
            }
    
            // Calcul du nombre de jours écoulés avant le mois donné
            switch (mois) {
                case 1:
                    numeroDuJour = jour; // Janvier
                    break;
                case 2:
                    numeroDuJour = moisLong + jour; // Janvier + février
                    break;
                case 3:
                    numeroDuJour = moisLong + fevrier + jour; // Janvier + février + mars
                    break;
                case 4:
                    numeroDuJour = moisLong + fevrier + moisLong + jour; // Jusqu'à avril
                    break;
                case 5:
                    numeroDuJour = moisLong + fevrier + moisLong + moisCourt + jour; // Jusqu'à mai
                    break;
                case 6:
                    numeroDuJour = moisLong + fevrier + moisLong + moisCourt + moisLong + jour;
                    break;
                case 7:
                    numeroDuJour = moisLong + fevrier + moisLong + moisCourt + moisLong + moisCourt + jour;
                    break;
                case 8:
                    numeroDuJour = moisLong + fevrier + moisLong + moisCourt + moisLong + moisCourt + moisLong + jour;
                    break;
                case 9:
                    numeroDuJour = moisLong + fevrier + moisLong + moisCourt + moisLong + moisCourt + moisLong + moisLong + jour;
                    break;
            }
    
            System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + numeroDuJour + " de l'An.");



            /* 
            int jour = 12;
            int mois = 10;
            int annee = 2024;

            // Vérifier si l'année est bissextile
            int fevrier = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0) ? 29 : 28;
            
            // Jours dans chaque mois
            int[] joursParMois = {0, 31, fevrier, 31, 30, 31, 30, 31, 31, 30, 31, 30};

            // Calcul du nombre de jours écoulés avant le mois donné
            int numeroDuJour = jour; // Jours du mois en cours

            for (int i = 1; i < mois; i++) {
                numeroDuJour += joursParMois[i]; // Ajoute les jours des mois précédents
            }

            System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + numeroDuJour + " de l'An.");
            */
        }
    }


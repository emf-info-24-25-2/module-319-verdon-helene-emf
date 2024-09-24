public class devoir03 {
    public static void main(String[] args) {

        /* j'avais essayé quelque chose car je voulais essayer avec une boucle au lieu d'un switch mais (j'ai raté masi ne voulais pas tout supprimer)
        int mois;
        int annee;
        int numeroDuJour;
        int moisPair;
        int moisImpair;
        int fevrier;

        int nombreJourParMois;

   
        jour = 23;
        mois = 9;
        annee = 2024;

        numeroDuJour = 0;
        moisPair = 30;
        moisImpair = 31;
    

      
            if (mois-1 != 0) {

                if (mois > 2) {

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

        */












            int jour;
            int mois;
            int annee;
            int numeroDuJour;
            int moisPair;
            int moisImpair;
            int fevrier;
    
            // assignation des variables
            jour = 23;
            mois = 9;
            annee = 2024;
    
            numeroDuJour = 0;
            moisPair = 30;
            moisImpair = 31;
    
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
                    numeroDuJour = moisImpair + jour; // Janvier + février
                    break;
                case 3:
                    numeroDuJour = moisImpair + fevrier + jour; // Janvier + février + mars
                    break;
                case 4:
                    numeroDuJour = moisImpair + fevrier + moisImpair + jour; // Jusqu'à avril
                    break;
                case 5:
                    numeroDuJour = moisImpair + fevrier + moisImpair + moisPair + jour; // Jusqu'à mai
                    break;
                case 6:
                    numeroDuJour = moisImpair + fevrier + moisImpair + moisPair + moisImpair + jour;
                    break;
                case 7:
                    numeroDuJour = moisImpair + fevrier + moisImpair + moisPair + moisImpair + moisPair + jour;
                    break;
                case 8:
                    numeroDuJour = moisImpair + fevrier + moisImpair + moisPair + moisImpair + moisPair + moisImpair + jour;
                    break;
                case 9:
                    numeroDuJour = moisImpair + fevrier + moisImpair + moisPair + moisImpair + moisPair + moisImpair + moisImpair + jour;
                    break;
            }
    
            System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + numeroDuJour + " de l'An.");
        }
    }


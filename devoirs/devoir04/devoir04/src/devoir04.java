public class devoir04 {
    public static void main(String[] args) {

        int year;
        int month;
        int day;

        year = 2024;
        month = 9;
        day = 29;
        int fevrier;
        String realMonth;

        if (year % 4 == 0) {
            fevrier = 29;
        } else {
            fevrier = 28;
        }

        String[] tableauMonth = { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aoûte", "septembre",
                "octobre ", "novembre", "décembre" };
        realMonth = tableauMonth[month - 1];

        System.out.println("date entrée est le " + day + "/" + month + "/" + year);

        if (year > 9999 || year < 0) {
            System.out.println("L'année [" + year + "] est hors limite !");
        } else {
            if (month < 1 || month > 12) {
                System.out.println("Le mois [" + month + "] est hors limite !");
            } else {
                switch (month) {
                    case 2:
                        if (day < 1 || day > fevrier) {
                            System.out.println("Le jour [" + day + "] est hors limite !");
                        } else {
                            System.out.println("La date formatée est le " + day + " " + realMonth + " " + year);
                        }
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (day < 1 || day > 31) {
                            System.out.println("Le jour [" + day + "] est hors limite !");
                        } else {
                            System.out.println("La date formatée est le " + day + " " + realMonth + " " + year);

                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day < 1 || day > 30) {
                            System.out.println("Le jour [" + day + "] est hors limite !");
                        } else {
                            System.out.println("La date formatée est le " + day + " " + realMonth + " " + year);

                        }
                        break;

                }

            }
        }

    }
}

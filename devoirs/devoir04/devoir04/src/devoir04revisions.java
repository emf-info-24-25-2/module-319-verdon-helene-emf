public class devoir04revisions {
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
        

        


       

    }
}

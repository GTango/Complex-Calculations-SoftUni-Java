import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String type_of_year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        double weekend;
        double play_in_p;
        double play_in_h;
        double extra;
        double play_in_year;
        double weekend_in_year;
        if(type_of_year.equals("leap")){
            weekend_in_year = 48 - h;
            weekend = weekend_in_year * 3.0/4;
            play_in_p = p * 2.0/3;
            play_in_h =  weekend + h + play_in_p;
            extra = 0.15 * play_in_h;
            play_in_year = extra + play_in_h;

            double fl = Math.floor(play_in_year);
            System.out.printf("%.0f", fl);

        }

        else if (type_of_year.equals("normal")){
            weekend_in_year = 48 - h;
            weekend = weekend_in_year * 3.0/4;
            play_in_p = p * 2.0/3;
            play_in_h =  weekend + h + play_in_p;
            double fl = Math.floor(play_in_h);
            System.out.printf("%.0f", fl);
        }
    }
}



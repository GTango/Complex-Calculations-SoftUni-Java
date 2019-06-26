import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        if(money <= 100){
            if (season.equals("summer")){

                money = money * 0.3;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f",money);

            }
            else if (season.equals("winter")){

                money = money * 0.7;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f",money);
            }

        }
        else if(money <= 1000){
            if (season.equals("summer")) {
                money = money * 0.4;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f",money);
            }
            else if (season.equals("winter")){

                money = money * 0.8;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f",money);
            }


        }
        else if (money > 1000){

            money = money * 0.9;

            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f",money);
        }
    }
}


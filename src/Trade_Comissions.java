import java.util.Scanner;
public class Trade_Comissions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine().toLowerCase();
        double sales = Double.parseDouble(scan.nextLine());
        double commission = -1;

        if (town.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {

                commission = 0.05;

            } else if (sales > 500 && sales <= 1000) {

                commission = 0.07;
            } else if (sales > 1000 && sales <= 10000) {

                commission = 0.08;
            } else if (sales > 10000) {

                commission = 0.12;

            }

        } else if (town.equals("varna")) {

            if (sales >= 0 && sales <= 500) {

                commission = 0.045;
            } else if (sales > 500 && sales <= 1000) {

                commission = 0.075;
            } else if (sales > 1000 && sales <= 10000) {

                commission = 0.1;
            } else if (sales > 10000) {

                commission = 0.13;
            }

        } else if (town.equals("plovdiv")) {

            if (sales >= 0 && sales <= 500) {

                commission = 0.055;
            } else if (sales > 500 && sales <= 1000) {

                commission = 0.08;
            } else if (sales > 1000 && sales <= 10000) {

                commission = 0.12;
            } else if (sales > 10000) {

                commission = 0.145;
            }

        }
        if (commission >= 0) {

            System.out.printf("%.2f", commission * sales);
        } else {
            System.out.println("error");
        }
    }

}

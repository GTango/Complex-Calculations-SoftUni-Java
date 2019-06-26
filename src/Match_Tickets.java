import java.util.Scanner;

public class Match_Tickets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int number_of_people = Integer.parseInt(scan.nextLine());
        double remain;
        double budget;
        double cost;

        if (number_of_people == 1 || number_of_people <= 4) {
            budget = money * 0.75;
            remain = money - budget;

            if (category.equals("Normal")) {

                cost = 249.99 * number_of_people;

                if (cost < remain) {

                    remain =  remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            } else if (category.equals("VIP")) {

                cost = 499.99 * number_of_people;
                if ( cost < remain) {

                    remain =  remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            }
        } else if (number_of_people == 5 || number_of_people <= 9) {
            budget = money * 0.60;
            remain = money - budget;

            if (category.equals("Normal")) {

                cost = 249.99 * number_of_people;

                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            } else if (category.equals("VIP")) {

                cost = 499.99 * number_of_people;
                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            }
        } else if (number_of_people == 10 || number_of_people <= 24) {
            budget = money * 0.50;
            remain = money - budget;

            if (category.equals("Normal")) {

                cost = 249.99 * number_of_people;

                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            } else if (category.equals("VIP")) {

                cost = 499.99 * number_of_people;
                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            }
        } else if (number_of_people == 25 || number_of_people <= 49) {
            budget = money * 0.40;
            remain = money - budget;

            if (category.equals("Normal")) {

                cost = 249.99 * number_of_people;

                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost- remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            } else if (category.equals("VIP")) {

                cost = 499.99 * number_of_people;
                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            }
        } else if (number_of_people >= 50) {
            budget = money * 0.25;
            remain = money - budget;

            if (category.equals("Normal")) {

                cost = 249.99 * number_of_people;

                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            } else if (category.equals("VIP")) {

                cost = 499.99 * number_of_people;
                if (cost < remain) {

                    remain = remain - cost;
                    System.out.printf("Yes! You have %.2f leva left.", remain);
                } else {
                    cost = cost - remain;
                    System.out.printf("Not enough money! You need %.2f leva.", cost);
                }
            }
        }
    }
}



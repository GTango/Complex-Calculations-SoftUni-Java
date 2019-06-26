import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);
        int sum;

        if (operator == '+') {

            sum = n1 + n2;
            if (sum % 2 == 0) {
                System.out.printf("%d + %d = %d" + " - even" ,n1 ,n2 ,sum);
            } else {
                System.out.printf("%d + %d = %d" + "- odd",n1 ,n2 ,sum);
            }
        } else if (operator == '-') {

            sum = n1 - n2;
            if (sum % 2 == 0) {
                System.out.printf("%d - %d = %d" + " - even",n1 ,n2 ,sum);
            } else {
                System.out.printf("%d - %d = %d" + " - odd",n1 ,n2 ,sum);
            }
        } else if (operator == '*') {

            sum = n1 * n2;

            if (sum % 2 == 0) {
                System.out.printf("%d * %d = %d" + " - even",n1 ,n2 ,sum);
            } else {
                System.out.printf("%d * %d = %d" + " - odd",n1 ,n2 ,sum);
            }
        } else if (operator == '/') {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double sum1 = (double)n1 / (double)n2;
                System.out.printf("%d / %d = %.2f" ,n1,n2,sum1);
            }
        } else if (operator == '%') {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                sum = n1 % n2;
                System.out.printf("%d %% %d = %d" ,n1,n2,sum);
            }
        }

    }
}


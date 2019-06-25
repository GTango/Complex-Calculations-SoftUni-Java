import java.util.Scanner;

public class Point_in_the_Figure {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        if ((x < 0 || x > 3 * h) || (y < 0  || y > 4 * h) || (x < h && y > h) || (x > 2 * h && y > h)){

            System.out.println("outside");
        }
        else if((x>0 && x < 3*h && y > 0 && y <h) || (x > h && x < 2 * h && y >= h && y < 4 * h)){

            System.out.println("inside");
        }
        else {

            System.out.println("border");
        }
    }
}

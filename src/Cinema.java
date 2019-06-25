import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String ttype_of_projection = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int column = Integer.parseInt(scan.nextLine());
        double price = -1.0;

        if (ttype_of_projection.equals("Premiere")){
            price = row * column * 12.00;
            System.out.printf("%.2f",price);
        }
        else if(ttype_of_projection.equals("Normal")){

            price = row * column * 7.50;
            System.out.printf("%.2f",price);
        }
        else if (ttype_of_projection.equals("Discount")){

            price = row * column * 5.00;
            System.out.printf("%.2f",price);
        }
    }
}



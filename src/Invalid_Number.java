import java.util.Scanner;
public class Invalid_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if(number >= 100 && number <= 200){


        }
        else if(number == 0){

        }
        else {
            System.out.println("invalid");
        }
    }
}



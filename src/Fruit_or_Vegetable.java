import java.util.Scanner;
public class Fruit_or_Vegetable {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        String input = scan.nextLine();

        if(input.equals("banana" )|| input.equals("kiwi")
                || input.equals("apple")
                || input.equals("cherry")
                || input.equals("lemon")
                || input.equals("grapes")){

            System.out.println("fruit");
        }

        else if (input.equals("tomato" )
                || input.equals("cucumber") || input.equals("carrot" ) || input.equals("pepper")){

            System.out.println("vegetable");
        }

        else {

            System.out.println("unknown");
        }
    }
}



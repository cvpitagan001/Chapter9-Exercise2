import java.util.Scanner;

public class App {
    
    static Scanner get = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Enter an integer: ");
        int num = get.nextInt();

        System.out.println("Show (W)hole number");
        System.out.println("Show (O)nce place number");
        System.out.println("Show (T)ens place number");
        System.out.println("Show (H)undreds place number");
        System.out.println("(Q)uit");
        System.out.print("Enter your choice: ");
        String choice = get.next();

        if(choice.equalsIgnoreCase("W")) {
            System.out.println("The whole number is: " + num);
        } else if(choice.equalsIgnoreCase("H")) {
            System.out.println("The hundreds place digit is: " + ((num / 10) / 10));
        } else if(choice.equalsIgnoreCase("T")) {
            System.out.println("The tens place digit is: " + (num / 10));
        } else if(choice.equalsIgnoreCase("O")) {
            System.out.println("The ones place digit is: " + ((num % 10)));
        }
    }
}

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //3) Square generation functionality that takes one number as input.
        System.out.println("Chose number to enter it: ");
        int userNumber = scanner.nextInt();
        int result = userNumber * userNumber;
        System.out.println("Square = " + result);
    }
}






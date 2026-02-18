import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // code:

            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();


            int factorial = 1;
            for (int i = num1; i >=1; i++){
                factorial = factorial * i;
            }
            System.out.println("factorial of first number = " + factorial);



        }}


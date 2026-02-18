import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        num1 = scanner.nextInt();

        int power = 1;
        for (int i = 1; i <= num2; i++) {
            power = power * num1;
        }
        System.out.println("Power result: " + power);

        int factorial = 1;
        for (int i = num1; i >= 1; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of first number = " + factorial);

        num1 = scanner.nextInt();
        int result = num1 * num1;
        System.out.println("Square = " + result);

        if (num1 < 0) {

            int inputNumber = num1 * (-1);
            System.out.println("The number in positive: " + inputNumber);

        } else {
            System.out.println("The number : " + num1);
        }


    }
}



import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter First Number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();
//power function
        int result = (int) Math.round(Math.pow(num1, num2));
        System.out.println(num1 + " is base and " + num2 + " is exponent and the RESULT= " + result);
// Factor function
        for (int number = result; number >= 1; number--) {
            factorial = factorial * number;
        }

        System.out.println("The Factorial of " + result + " = " + factorial);
        //convert to positive number
        if (result < 0) {
            int inputNumber = num1 * (-1);
            System.out.println("The RESULT in Positive= " + inputNumber);

        } else {
            System.out.println("The RESULT = " + result);

        }
        //Even or Odd Number
        if (result % 2 == 0) {
            System.out.println("The RESULT is Even Number");
        } else {
            System.out.println("The RESULT is Odd Number");
        }
        // square function
        int SquareResult = result * result;
        System.out.println("The Square of  RESULT  = " + SquareResult);


    }
}







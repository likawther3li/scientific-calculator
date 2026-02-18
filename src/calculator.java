import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);







//maryam
            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();



            int power = 1;
            for (int i = 1; i<= num2; i++){
                power = power * num1;
            }
            System.out.println("Power result: " +power );


            //rima

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            int inputNumber = number * (-1);
            System.out.println("The number in positive: " + inputNumber);


        } else {
            System.out.println("The number : " + number);
        }

    }
}



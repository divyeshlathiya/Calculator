import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter Operator(+,-,*,/) or ('!' for Exit) : ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+': {
                    System.out.println("Enter a number1 :");
                    int number1 = sc.nextInt();
                    System.out.println("Enter a number2 :");
                    int number2 = sc.nextInt();

                    int sum = number1 + number2;
                    // System.out.println("Sum = " + (number1+number2));
                    System.out.println("Sumation = " + sum);
                    break;

                }
                case '-': {
                    System.out.println("Enter a number1 :");
                    int number1 = sc.nextInt();
                    System.out.println("Enter a number2 :");
                    int number2 = sc.nextInt();

                    int sub = number1 - number2;
                    System.out.println("Subtraction = " + sub);
                    break;

                }
                case '*': {
                    System.out.println("Enter a number1 :");
                    int number1 = sc.nextInt();
                    System.out.println("Enter a number2 :");
                    int number2 = sc.nextInt();

                    int mul = number1 * number2;
                    System.out.println("Multiplication = " + mul);
                    break;

                }
                case '/': {
                    System.out.println("Enter a number1 :");
                    int number1 = sc.nextInt();
                    System.out.println("Enter a number2 :");
                    int number2 = sc.nextInt();

                    int div = number1 / number2;
                    if (number2 == 0) {
                        System.out.println("Can't perform Divison");
                    } else {
                        System.out.println("Division = " + div);
                    }
                    break;
                }
                case '!': {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Invalid Oprator");
                }

            }

        }

        sc.close();

    }
}

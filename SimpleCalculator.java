
    import java.util.Scanner;

    public class SimpleCalculator {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean exit=true;
            while(exit){
            System.out.println("SIMPLE CALCULATOR");
            System.out.println("SELECT OPERATOR TO PERFORM OPERATION ");
            System.out.println("1.Press + to perform Addition");
            System.out.println("2.Press - to perform Subtraction");
            System.out.println("3.Press * to  perform Multiplication");
            System.out.println("4.Press / to  perform Division");
            System.out.println("5.Press E for Exit");


            char operator = scanner.next().charAt(0);


                    double result;
                    switch (operator) {


                        case '+':
                            System.out.print("Enter the first number: ");
                            double number1 = scanner.nextDouble();

                            System.out.print("Enter the second number: ");
                            double number2 = scanner.nextDouble();
                            result = number1 + number2;
                            System.out.println(number1 + " + " + number2 + " = " + result);
                            break;
                        case '-':
                            System.out.print("Enter the first number: ");
                            double number3 = scanner.nextDouble();

                            System.out.print("Enter the second number: ");
                            double number4 = scanner.nextDouble();
                            result = number3 - number4;
                            System.out.println(number3 + " - " + number4 + " = " + result);
                            break;
                        case '*':
                            System.out.print("Enter the first number: ");
                            double number5 = scanner.nextDouble();

                            System.out.print("Enter the second number: ");
                            double number6 = scanner.nextDouble();
                            result = number5 * number6;
                            System.out.println(number5 + " * " + number6 + " = " + result);
                            break;
                        case '/':
                            System.out.print("Enter the first number: ");
                            double number7 = scanner.nextDouble();

                            System.out.print("Enter the second number: ");
                            double number8 = scanner.nextDouble();
                            if (number8 == 0) {
                                System.out.println("Error!: Division by zero is not allowed.");
                                return;
                            }
                            result = number7 / number8;
                            System.out.println(number7 + " / " + number8 + " = " + result);
                            break;
                        case 'E':
                            exit=true;
                            System.out.println("Thank you for using this simple calculator...!");
                            break;

                        default:
                            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    }

                    }
                }
            }


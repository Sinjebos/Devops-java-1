import java.util.Scanner;
public class calculator {
    
    public static void main(final String[] args) {
        boolean calculator = true;
        Scanner sc = new Scanner(System.in);

        while (calculator) {
            System.out.print("Enter a number: "); // First input
            
            while(!sc.hasNextDouble()){ // If first input fails, run this til valid input
                System.out.println("Invalid input");
                System.out.println("Enter a number: ");
                sc.next();
            }
            double number1 = sc.nextDouble();
            System.out.print("Enter another number: "); // Second input

            while(!sc.hasNextDouble()){ // If second input fails, run this til valid input
                System.out.println("Invalid input");
                System.out.println("Enter another number: ");
                sc.next();
            } 
            double number2 = sc.nextDouble();

            System.out.println("Would you like to: ");
            System.out.println("[1] Add your numbers.");
            System.out.println("[2] Subtract your numbers.");
            System.out.println("[3] Multiply your numbers.");
            System.out.println("[4] Divide your numbers. ");
            System.out.println("[5] Exit calculator. ");
            System.out.print("Option: "); 
            String input = sc.next();
            double sum;
            switch(input) {
                case "1":
                    sum = addition(number1, number2);
                    System.out.println(sum);
                    break;
                case "2":
                      sum = subtract(number1, number2);
                      System.out.println(sum);
                      break;
                case "3":
                      sum = multiply(number1, number2);
                      System.out.println(sum);
                      break;
                case "4":
                      sum = divide(number1, number2);
                      System.out.println(sum);
                      break;      

                case "5":
                      calculator = false;
                      System.out.println("Closing calculator. ");
                      break;
                default:
                System.out.println("Please input 1-5!");
                break;       
            }

        }
         sc.close();
    }
    public static double addition(double number1, double number2) {
        return number1 + number2;
    }
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public static double divide(double number1, double number2) {
        return number1 / number2; 
    }
}

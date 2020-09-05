import java.util.Scanner;
public class calculator {
    
    public static void main(final String[] args) {
        boolean calculator = true;
        Scanner sc = new Scanner(System.in);

        while (calculator) {
            System.out.print("Enter a number: ");
            
            while(!sc.hasNextDouble()){ // Prevents crashes from letters
                System.out.println("Invalid input");
                System.out.println("Enter a number: ");
                sc.next();
            }
            Double number1 = sc.nextDouble();
            System.out.print("Enter another number: ");

            while(!sc.hasNextDouble()){ // ""
                System.out.println("Invalid input");
                System.out.println("Enter another number: ");
                sc.next();
            } 
            Double number2 = sc.nextDouble();

            System.out.println("Would you like to: ");
            System.out.println("[1] Add your numbers.");
            System.out.println("[2] Subtract your numbers.");
            System.out.println("[3] Multiply your numbers.");
            System.out.println("[4] Divide your numbers. ");
            System.out.println("[5] Exit calculator. ");
            System.out.print("Option: "); 
            String input = sc.next();
            Double sum = 0.0;
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
    public static Double addition(Double number1, Double number2) {
        return number1 + number2;
    }
    public static Double subtract(Double number1, Double number2) {
        return number1 - number2;
    }
    public static Double multiply(Double number1, Double number2) {
        return number1 * number2;
    }
    public static Double divide(Double number1, Double number2) {
        return number1 / number2; 
    }
}

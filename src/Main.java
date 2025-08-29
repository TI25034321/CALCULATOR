//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;// import scanner to read user input

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scanner object

        // prompt the user to enter any operator
        System.out.println("Please enter one operator uh want to use" + "( + , - , * , / ,)");
        char Operator = scan.next().charAt(0);

            System.out.println("Enter 1st number:");// prompt the user for first number
            double num1 = scan.nextDouble();

            System.out.println("Enter 2nd number:");// prompt the user for second number
            double num2 = scan.nextDouble();

            double results =0; //Store the results

        switch (Operator) { // Compared the operator entered to the case that performs it's function

            //print out january when use entered one and similar when other numbers included in the cases are entered
            case '+': // This adds up the numbers that the user entered
                results = num1 + num2;
                break;

            case '-': // Minus the two numbers that the user enters
                results = num1 - num2;
                break;

            case '*': // Multiply two numbers the user entered
                results = num1 * num2;
                break;

            case '/': // Divides two numbers the user entered
                if(num2!=(0)) {
                    results = num1 / num2;
                }else{
                    System.out.println("Error: No division by zero!");
                }
                break;

            default: // When the user enters what's not in the list, this gets executed
                System.out.println("invalid operator selected");
        }
        System.out.println("Results is:"+results);
    }
}
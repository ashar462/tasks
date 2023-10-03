import java.util.Scanner;

public class task4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1:");
        Float number1 = scanner.nextFloat();

        System.out.print("Enter number 2:");
        Float number2 = scanner.nextFloat();
    
        float add = number1 + number2;
        float multi = number1 * number2;
        float divide = number1 / number2;
        float sub = number1 - number2;
        System.out.println("Addition is " + add);
        System.out.println("Multiplication is " + multi);
        System.out.println("Division is " + divide);
        System.out.println("Subtraction is " + sub);
        
        

        scanner.close();
    }
}
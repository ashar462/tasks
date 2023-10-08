import java.util.Scanner;

public class task6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit: ");
        Float number = scanner.nextFloat();
    
        float Celsius = ( number - 32 ) * 5/9;
        System.out.print("Temperature in Celsius is " + Celsius);
        
        
        

        scanner.close();
    }
}
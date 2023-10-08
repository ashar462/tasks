import java.util.Scanner;

public class task5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        Float number = scanner.nextFloat();
    
        float Fahrenheit = ( number * 9/5 ) + 32 ;
        System.out.print("Temperature in Fahrenheit is " + Fahrenheit);
        
        
        

        scanner.close();
    }
}
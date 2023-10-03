import java.util.Scanner;

public class task6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit:");
        float number = scanner.nextFloat();
    
        // float celsius = (number * 9/5) + 32;
        // System.out.print("Temperature in Celsius is " + celsius);

        scanner.close();
    }
}
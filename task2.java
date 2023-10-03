import java.util.Scanner;

public class task2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length:");
        Float length = scanner.nextFloat();

        System.out.print("Enter width:");
        Float width = scanner.nextFloat();
    
        float area = length * width;
        System.out.print("Area is " + area);

        scanner.close();
    }
}
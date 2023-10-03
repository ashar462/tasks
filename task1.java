import java.util.Scanner;

public class task1{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String userinput = scanner.nextLine();

        System.out.print("Enter Your Salary:");
        int number = scanner.nextInt();

        System.out.print("Enter Your Age:");
        Float age = scanner.nextFloat();


        System.out.println("You name " + userinput);
        System.out.println("You salary is " + number);
        System.out.println("You age is " + age);
        
        scanner.close();
    }
}
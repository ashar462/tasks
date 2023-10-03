import java.util.Scanner;

public class task3{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String userinput = scanner.nextLine();

        System.out.print("Enter Your Email address:");
        String email = scanner.nextLine();

        System.out.print("Enter Your Contact number:");
        String contact = scanner.nextLine();


        System.out.println("You name is" + userinput);
        System.out.println("You Email address is " + email);
        System.out.println("You Contact number is " + contact);
        
        scanner.close();
    }
}
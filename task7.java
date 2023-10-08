import java.util.Scanner;

public class task7{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To: ");
        String to = scanner.nextLine();

        System.out.print("Company name: ");
        String company = scanner.nextLine();

        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        
        
        System.out.print("Write the application: ");
        String application = scanner.nextLine();
        
        
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        

        System.out.println("To,");
        System.out.println(to);
        System.out.println(company);
        System.out.println("Address: " + address);
        System.out.println("Subject:\t\t\t\t\t\t\t\t\t" + subject);
        System.out.println("Respected (Sir/madam),");
        System.out.println("\t\t" + application);
        System.out.println("\t\t\t\t\tThanking you,");
        System.out.println("Yours sincerely,");
        System.out.println(name);

        
        
        scanner.close();
    }
}
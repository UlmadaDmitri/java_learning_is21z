import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Take role ");
        String role = scanner.nextLine();
        System.out.println("Password ");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("12345")) {
            System.out.println("U r admin ");
        } else {
            System.out.println("U r not admin,whats ur name? ");
            String name = scanner.nextLine();
            System.out.println("Nice to meet u,new user " + name);
        }
    }
}

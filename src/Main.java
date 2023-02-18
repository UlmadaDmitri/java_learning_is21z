import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n != 0) {
            sum += n;
            count++;
            System.out.print("Enter a number: ");
            n = sc.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
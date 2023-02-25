import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ое число");
        int num1 = scanner.nextInt();

        System.out.println("Введите 2-ое число");
        int num2 = scanner.nextInt();

        System.out.println("Action");
        String action = scanner.next();

        float res;
        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Result" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result" + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error ");
                else {
                    res = (float) num1 / num2;
                    System.out.println("Result " + res);
                }
                break;
            default:
                System.out.println("wrong ");
        }
    }
}

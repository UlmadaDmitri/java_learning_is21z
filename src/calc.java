import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("Введите число для операции");
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextFloat();
        System.out.println("Второе число");
        float num2 = scan.nextFloat();
        float res = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        System.out.println("Result: " + "\nСложение " + res + "\nВычитание " + res2 + "\nУмножение " + res3 +
                "\nДеление " + res4);
    }
}

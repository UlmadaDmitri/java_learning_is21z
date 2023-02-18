import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        /*System.out.println("Hi\n\tworld! ");

        int vozrast = 25;
        vozrast = 21;
        System.out.println("Возраст: " + vozrast);
        vozrast = 40;*/


        /*Scanner scan = new Scanner(System.in);
        System.out.print("Say your name: ");
        String username = scan.nextLine();
        System.out.println("Hi, " + username);*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 2 числа для операции: ");
        float num1 = scan.nextInt();
        float num2 = scan.nextInt();
        float res = num1 + num2;
        res++;
        System.out.println("Ответ: " + res);
        if(res >= 100) {
            System.out.println("ya gei");
        } else {
            System.out.println("ya ne gei");
        }

    }
}

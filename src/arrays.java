import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter a number to search for: ");
        int num = sc.nextInt();
        if (isInArray(arr, num)) {
            System.out.println(num + " is in the array.");
        } else {
            System.out.println(num + " is not in the array.");
        }
    }

    public static boolean isInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
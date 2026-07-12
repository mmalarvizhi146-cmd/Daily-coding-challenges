import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }
    }
}

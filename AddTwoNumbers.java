import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the value of b : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is : "+sum);
    }
}
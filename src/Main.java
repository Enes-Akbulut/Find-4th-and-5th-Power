import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// If you wanna use the program which calculate 4th power, use this programme.
        Scanner sc = new Scanner(System.in);
        int limitNumber;
        System.out.println("Enter Limit Number : ");
        limitNumber = sc.nextInt();
        for (int number = 1; number <= limitNumber; number *= 4) {
            System.out.print(number + ",");
        }
        /// If you wanna use the program which calculate 5th power, use this programme.
        Scanner input = new Scanner(System.in);
        int limitNumberr;
        System.out.println("\n  Enter  a limit number :");
        limitNumberr = input.nextInt();
        for (int i = 1; i <= limitNumberr; i *= 5) {
            System.out.print(i+",");
        }
    }
}
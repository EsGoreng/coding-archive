import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("//////////////////////////////////////");
        System.out.println("/// Exception Handling Example  01 ///");
        System.out.println("//////////////////////////////////////");
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
        System.out.println("//////////////////////////////////////");
        System.out.println("/// Exception Handling Example  02 ///");
        System.out.println("//////////////////////////////////////");
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("//////////////////////////////////////");
        System.out.println("/// Exception Handling Example  03 ///");
        System.out.println("//////////////////////////////////////");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("null.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("//////////////////////////////////////");
        System.out.println("/// Exception Handling Example  04 ///");
        System.out.println("//////////////////////////////////////");
        InvalidFriend friend = new InvalidFriend(null);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter friend name: ");
        String input = scanner.nextLine();
        try {
            friend.validateFriend(input);
            System.out.println("Friend name is valid: " + input);
        } catch (InvalidFriend e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


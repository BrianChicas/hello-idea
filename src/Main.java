//Brian Chicas
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?\n");
        String name = scanner.nextLine();
        System.out.print("What is your favorite number?\n");

        Double num = 0d;

        try {
        num = scanner.nextDouble();
        } catch (Exception e) {
            System.out.printf(num + " is not a number");
            System.exit(0);
        }
        //double num = scanner.nextDouble();

        System.out.println("Hi " + name + "! " + num + " is a great number!");
    } // End constructor
}
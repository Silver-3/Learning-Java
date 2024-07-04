import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to devide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to devide by");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't devide by zero");
        } catch (InputMismatchException e) {
            System.out.println("You can only devide by whole numbers");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            scanner.close();
        }
    }
}
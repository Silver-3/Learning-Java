import java.util.*;

public class Main {
    public static void main(String[] args) {

        // AND operator

        int temp = 25;

        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

        // OR operator

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game. Type q or Q to quit.");
        String reponse = scanner.nextLine();

        if (reponse.equals("q") || reponse.equals("Q")) {
            System.out.println("You have quit the game.");
        } else{
            System.out.println("You are still playing the game.");
        }

        // NOT operator

        System.out.println("You are playing a game. Type q or Q to quit.");
        String reponse2 = scanner.nextLine();

        if (!reponse2.equals("q") && !reponse2.equals("Q")) {
            System.out.println("You are still playing the game.");
        } else{
            System.out.println("You have quit the game.");
        }

        scanner.close();
    }
}
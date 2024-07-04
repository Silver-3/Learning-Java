import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animao do you want?");
        System.out.println("(1 = dog) or (2 = cat)");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1: animal = new Dog(); animal.speak(); break;
            case 2: animal = new Cat(); animal.speak(); break;
            default: animal = new Animal(); animal.speak(); break;
        }

        scanner.close();
    }
}
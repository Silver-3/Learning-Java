import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(5)+1;
        System.out.println("Random int: " + x);

        double y = random.nextDouble(5)+1;
        System.out.println("Random double: " + y);

        boolean z = random.nextBoolean();
        System.out.println("Random boolean: " + z);
    }
}

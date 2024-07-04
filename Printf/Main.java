public class Main {
    public static void main(String[] args) {
        
        boolean success = true;
        char character = '@';
        String name = "John";
        int number = 50;
        double decimal = 3.14;

        // [conversion-character]
        System.out.println("[conversion-character]");
        System.out.printf("Was it a success? %b", success); System.out.println();
        System.out.printf("My special character is %c", character); System.out.println();
        System.out.printf("My name is %s", name); System.out.println();
        System.out.printf("My number is %d", number); System.out.println();
        System.out.printf("My decimal number is %f", decimal); System.out.println();
        System.out.println();

        // [width]
        System.out.println("[width]");
        System.out.printf("Hello %10s", name); System.out.println();
        System.out.println();

        // [precision]
        System.out.println("[precision]");
        System.out.printf("You have have $%.2f ", decimal); System.out.println();
        System.out.println();

        // [flags]
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded 
        // , : comma grouping seperator if numbers > 1000

        System.out.println("[flags]");
        System.out.printf("You have $%.2f ", decimal); System.out.println();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        String name = "Alex";
        int age = 14;

        hello(name, age);

        int x = 3;
        int y = 4;
        int z = add(x, y);

        System.out.println(z);
    }

    static void hello(String name, int age) {
        
        System.out.println("Hello " + name + "\nYou are " + age + " years old");
    }

    static int add(int x, int y) {
        return x + y;
    }
}
public class Main {
    public static void main(String[] args) {

        int a = add(1, 2);
        int b = add(1, 2, 3);
        int c = add(1, 2, 3, 4);

        double d = add(1.1, 2.2);
        double e = add(1.1, 2.2, 3.3);
        double f = add(1.1, 2.2, 3.3, 4.4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    static int add(int a, int b) {
        System.out.println("int method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("int method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("int method #3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("double method #1");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("double method #2");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("double method #3");
        return a + b + c + d;
    }
}
public class Main {
    public static void main(String[] args) {
    
        double x = 3.14;
        double y = -10;

        double min = Math.min(x, y);
        double max = Math.max(x, y);
        double absolute = Math.abs(y);
        double squareroot = Math.sqrt(x);
        double rounddown = Math.round(x);
        double roundup = Math.ceil(y);

        System.out.println(min);
        System.out.println(max);
        System.out.println(absolute);
        System.out.println(squareroot);
        System.out.println(rounddown);
        System.out.println(roundup);
        
    }
}
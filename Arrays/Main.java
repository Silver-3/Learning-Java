public class Main {
    public static void main(String[] args) {
       
        // String[] cars = {"Camaro", "Corvette", "Telsa", "BMW"};

        // cars[0] = "Mustang";

        // System.out.println(cars[1]);

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
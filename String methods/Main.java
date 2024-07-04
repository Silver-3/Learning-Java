public class Main {
    public static void main(String[] args) {

        String name = "John";

        boolean equals = name.equalsIgnoreCase("John");
        int length = name.length();
        char character = name.charAt(0);
        int index = name.indexOf("o");
        boolean isEmpty = name.isEmpty();
        String upperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();
        String trim = name.trim(); //trim spaces
        String replace = name.replace("o", "a");

        System.out.println(equals);
        System.out.println(length);
        System.out.println(character);
        System.out.println(index);
        System.out.println(isEmpty);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(trim);
        System.out.println(replace);
    }
}
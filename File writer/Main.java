import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");

            writer.write("Roses are red\nViolets are blue\nBob the Builder is handy\nAnd will not give you candy");
            writer.append("\n(A poem by Bob the builder)");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
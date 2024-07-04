import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();

            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }

            reader.close();
        } catch (FileNotFoundException e) { 
            System.out.println("File not found");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
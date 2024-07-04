import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        try {
            File file = new File("song.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(stream);

            String reponse = "";

            while (!reponse.equals("Q")) {
                System.out.println("P = play, S = stop, R = reset, Q = quit");
                System.out.print("Enter your choice: ");

                reponse = scanner.next();
                reponse = reponse.toUpperCase();

                switch(reponse) {
                    case "P": clip.start(); break;
                    case "S": clip.stop(); break;
                    case "R": clip.setFramePosition(0); break;
                    case "Q": clip.stop(); clip.close(); break;
                    default: System.out.println("Invalid choice.");
                }
            }
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio type is not supported (.wav only)");
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Line is unavailable: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
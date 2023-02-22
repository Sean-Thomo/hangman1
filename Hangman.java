import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
    public static void main(String[] args) {
        try {
            String[] wordsArray;
            File myObj = new File("shortwords.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String word = myReader.nextLine();
                wordsArray.add(word);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
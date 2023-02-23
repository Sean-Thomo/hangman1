import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
            ArrayList<String> wordsArray = getStringArray();
            String word = selectRandomWord(wordsArray);
            int wordIndex = getRandomInt(word.length());
            final String modifiedWord = word.replace(word.charAt(wordIndex), '_');
            System.out.println(modifiedWord);
            
    }

    static ArrayList<String> getStringArray() {
        try {
            ArrayList<String> wordsArray = new ArrayList<String>();
            File myObj = new File("shortwords.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String word = myReader.nextLine();
                wordsArray.add(word);
            }
            myReader.close();

            return wordsArray;
    
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        return null;
    }

    static int getRandomInt(int max){
        Random num = new Random(); 
        return num.nextInt((max - 0) + 1) + 0;
    }

    static String selectRandomWord(ArrayList<String> wordsArray) {
        int index = getRandomInt(wordsArray.size());
        final String word = wordsArray.get(index);
        return word;
    }
    
}
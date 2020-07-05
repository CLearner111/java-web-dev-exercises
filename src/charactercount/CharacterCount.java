package charactercount;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

    private static void printHashMap(HashMap<Character, Integer> hashMap) {
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void countCharacters(String str) {
        HashMap<Character, Integer> charCountHashMap = new HashMap<>();

        str = str.replaceAll("[\\.,’'?:\\s*]","");


        char[] charArray = str.toCharArray();
            for (char character:charArray) {
                incrementHashMapValue(charCountHashMap,Character.toLowerCase(character));
        }

        printHashMap(charCountHashMap);
    }

    private static void incrementHashMapValue(HashMap<Character, Integer> charCountHashMap, char key) {

        if(charCountHashMap.containsKey(key)) {
            charCountHashMap.put(key, charCountHashMap.get(key)+1);
        } else {
            charCountHashMap.put(key, 1);
        }
    }

    private static String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userInput = input.nextLine();
        input.close();
        return userInput;
    }

    public static String readFileAsString(String fileName)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) throws Exception {

//        String myString = "If the product of two terms is zero then common sense " +
//                "says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the " +
//                "quadratics into a form that can be factored allowing that side of " +
//                "the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";
//        countCharacters(myString);

        String fileString = readFileAsString("C:\\Users\\115\\IdeaProjects\\LaunchCode\\java-web-dev-exercises\\src\\charactercount\\SomeString.txt");
        countCharacters(fileString);

//        String userInput = getUserInput();
//        countCharacters(userInput);

    }
}

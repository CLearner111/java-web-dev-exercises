package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void arrayListPractice() {
        ArrayList<String> charStars = new ArrayList<>();
        charStars.add("a");
        charStars.add("b");
        charStars.add("c");

        for (String i : charStars) {
            System.out.println(i);
        }
    }

    public static int sumArrayListEven(ArrayList<Integer> arrayList) {
        int evenSum = 0;

        for (Integer i : arrayList) {
            if(i%2 == 0) {
                evenSum += i;
            }
        }

        return evenSum;
    }

    public static void printFiveLetterWords(ArrayList<String> arrayList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of word?: ");
        int wordLength = input.nextInt();

        for (String word : arrayList) {
            if(word.length() == wordLength) {
                System.out.print(word + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(3,5,2,7,9,3,2,5,1,8));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("house","mouse","car","park","bucket","phone","remote","box","table","can"));
        String paragraph = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> stringArrayList2 = new ArrayList<String>(Arrays.asList(paragraph.split("[\\.,\\s*]+")));

//        arrayListPractice();
        int sum = sumArrayListEven(intArrayList);
        System.out.println("Sum of even: " + sum);

//        printFiveLetterWords(stringArrayList);
        printFiveLetterWords(stringArrayList2);

    }
}

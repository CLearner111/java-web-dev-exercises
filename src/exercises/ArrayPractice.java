package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void arrayPractice() {
        int[] intArray = new int[]{1, 1, 2, 3, 5, 8};

        for (int i=0;i<intArray.length;i++) {
            if(i > 0) {
                System.out.print("," + intArray[i]);
            } else {
                System.out.print(intArray[i]);
            }
        }

        System.out.println();

        for (int i=0;i<intArray.length;i++) {
            if(intArray[i] % 2 != 0) {
                if(i > 0) {
                    System.out.print("," + intArray[i]);
                } else {
                    System.out.print(intArray[i]);
                }
            }
        }
        System.out.println();
    }

    public static void arrayPractice2() {
        String[] stringArray = new String[200];

        String paragraph = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

//        stringArray = paragraph.split("[\\.,\\s*]+");
        stringArray = paragraph.split("[\\.]");

        for (String s:stringArray) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(stringArray));
    }


    public static void main(String[] args) {

        arrayPractice();
        arrayPractice2();
    }
}

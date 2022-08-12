package exercises;

import java.util.HashMap;
import java.util.Map;

public class ControlFlow {
    public static void main(String[] args) {
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String testString2 = "Gimme Pie!";

        char[] charactersInString = testString2.toCharArray();
        char[] alphabetAndSuch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ',', '.'};

        HashMap<Character, Integer> characterAndCountHashMap = new HashMap<>();
        int[] currentCount = new int[alphabetAndSuch.length];
        //set the individual counts to zero
        //for each character in the string, loop through the characters in alphabetAndSuch to see if they match the chars in the string

        for (int index = 0; index < charactersInString.length; index++) {

            for (int indexJ = 0; indexJ < alphabetAndSuch.length; indexJ++) {
                if (charactersInString[index] == (alphabetAndSuch[indexJ])) {

//                    System.out.println("this is " + charactersInString[index] + " being successfully looped through and acknowledged");

                    currentCount[indexJ]++;
                    characterAndCountHashMap.put(alphabetAndSuch[indexJ], currentCount[indexJ]);
                       char[] characterArray = new char[characterAndCountHashMap.keySet().size()];
                       int[] countsArray = new int[characterAndCountHashMap.values().size()];
                     }
                    }
                }
        for (Map.Entry<Character, Integer> characterAndCount : characterAndCountHashMap.entrySet()) {
            System.out.println(characterAndCount.getKey() + " (" + characterAndCount.getValue() + ")");
        }
            }
    }


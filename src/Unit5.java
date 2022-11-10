import java.util.*;


/**
 * Imagine a list of numbers from 1 to max_num, inclusive
 * - except that one of these numbers will be missing from the list.
 *
 * Write a function that takes this list of numbers, as well as the max_num, and
 * it should return the missing number.
 */
public class Unit5 {
    public static void main(String[] args){

        int[] arr = new int []{1, 2, 3, 4, 6, 5, 8, 9, 10};
        System.out.println(missingLink(arr, 10));

        String word = "HELl() People (";
        String word1 = "(Hello)";

        System.out.println(equalParantheses(word));
        System.out.println(equalParantheses(word1));

    }

    public static int missingLink(int[] intList, int max){

        Arrays.sort(intList);
        int missing = 0;
        for (int i = 1; i < max-1; i++){
            int start = intList[i-1];
            if(!(intList[i] == (start +1))) {
                missing = intList[i]-1;
            }
            else
                missing = 0;
        }
        return missing;
    }

    /**
     * Write a function that takes in a string and returns true or false depending on whether that string has balanced
     * parentheses. A string has balanced parantheses if every opening paranthesis “(“ has a matching closing paranthesis “)” that closes the corresponding opening paranthesis.
     *
     * For the purposes of this problem, you only need to worry about parentheses “(“and “)”, not other
     * opening-and-closing marks, like curly brackets, square brackets, or angle brackets.
     */

    public static boolean equalParantheses(String word){
        int open = 0;
        int closed = 0;
        boolean pop;

        for(int i=0; i < word.length(); i++){
            if (word.charAt(i) == ')')
                closed ++;
            else if(word.charAt(i) == '(')
                open ++;
        }

        if(closed == open)
            pop = true;
        else
            pop = false;

        return pop;
    }
}


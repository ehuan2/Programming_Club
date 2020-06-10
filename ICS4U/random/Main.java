package random;

import java.util.*;

public class Main {

    static HashMap<Character, Integer> freq;
    // this algorithm runs in O(n) time and has O(n) memory space. Don't know if it is possible in O(1) space.
    public static boolean permutationIsPalindrome(String str){

        freq = new HashMap<>();

        for (char a :
                str.toCharArray()) {
            freq.putIfAbsent(a, 0);
            freq.put(a, freq.get(a)+1);
        }
        
        int oneCount = 0;
        for (Integer integer :
                freq.values()) {
            if((integer % 2) == 1){
                oneCount += 1;
            }
        }
        
        return oneCount <= 1;
    }

    public static String randomPermutation(String str){

        LinkedList<Character> listOfChars = (new LinkedList<Character>());

        for (char a :
                str.toCharArray()) {
            listOfChars.add(a);
        }

        StringBuilder permutation = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int index = (int) (Math.random() * (str.length() - i));
            permutation.append(listOfChars.remove(index));
        }

        return permutation.toString();
    }

    public static void main(String[] args) {
        String input = (new Scanner(System.in)).nextLine();
        System.out.println(randomPermutation(input));

        System.out.println(permutationIsPalindrome(input));

    }

}

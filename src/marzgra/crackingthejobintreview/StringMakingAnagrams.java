/*
TASK:
Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character
deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.
 */

package marzgra.crackingthejobintreview;

import java.util.Scanner;

public class StringMakingAnagrams {
    private static int numberNeeded(String first, String second) {
        int[] letterCounter = new int[26];
        for (char c : first.toCharArray()) {
            letterCounter[c - 'a']++;
        }
        for (char c : second.toCharArray()) {
            letterCounter[c - 'a']--;
        }
        int result = 0;
        for (int i : letterCounter) {
            result += Math.abs(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

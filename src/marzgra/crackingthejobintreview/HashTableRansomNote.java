/*
TASK:
A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know
if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in
his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings
or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note
exactly using whole words from the magazine; otherwise, print No.
 */
package marzgra.crackingthejobintreview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableRansomNote {

    private static Scanner in = new Scanner(System.in);

    private static void toHashMap(HashMap<String, Integer> hashmap, int size) {
        for (int i = 0; i < size; i++) {
            String word = in.next();
            hashmap.put(word, hashmap.getOrDefault(word, 0) + 1);
        }
    }

    private static boolean canCreateRansomNote(HashMap<String, Integer> magazine, HashMap<String, Integer> note) {
        for (Map.Entry<String, Integer> entry : note.entrySet()) {
            Integer i = magazine.get(entry.getKey());

            if (i == null) return false;
            else if (entry.getValue() > i) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        HashMap<String, Integer> magazine = new HashMap<>();
        toHashMap(magazine, m);

        HashMap<String, Integer> note = new HashMap<>();
        toHashMap(note, n);

        System.out.println(canCreateRansomNote(magazine, note) ? "Yes" : "No");
    }
}
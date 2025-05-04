package arrays;

import java.util.Arrays;

//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//Input: s = "racecar", t = "carrace"
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s,t));
    }

}

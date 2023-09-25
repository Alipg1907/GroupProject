import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = areAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check if the lengths are equal; if not, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

/*
Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.

 */
public class Task6 {
    public class practice {
        public static char firstNonRepeatingChar(String s) {
            int[] charCount = new int[256];

            for (char c : s.toCharArray()) {
                charCount[c]++;
            }

            for (char c : s.toCharArray()) {
                if (charCount[c] == 1) {
                    return c;
                }
            }

            return '0';
        }

        public static void main(String[] args) {
            String inputString = "abracadabra";

            char result = firstNonRepeatingChar(inputString);

            if (result != '0') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found");
            }
        }

    }
}

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */
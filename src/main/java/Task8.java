public class Task8 {
    public static String increment(String str) {

// Convert the input string to an integer
        int number = Integer.parseInt(str);

        // Increment the integer value
        number++;

        // Convert the incremented integer back to a string
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "53456";
        String input3 = "29";

        String result1 = increment(input1);
        String result2 = increment(input2);
        String result3 = increment(input3);

        System.out.println("Input: " + input1 + " -> Output: " + result1);
        System.out.println("Input: " + input2 + " -> Output: " + result2);
        System.out.println("Input: " + input3 + " -> Output: " + result3);
    }
}

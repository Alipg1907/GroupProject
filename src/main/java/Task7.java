import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
You have a list of strings  aand you want to keep only those that start
with “A” and you want to return them in lower case
 */
public class Task7 {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Orange");
        inputList.add("apricot");
        inputList.add("Grapes");

        List<String> filteredAndLowercased = filterAndLowercaseStrings(inputList);

        System.out.println("Filtered and Lowercased Strings:");
        for (String str : filteredAndLowercased) {
            System.out.println(str);
        }
    }

    public static List<String> filterAndLowercaseStrings(List<String> inputList) {
        return inputList.stream()
                .filter(str -> str.toLowerCase().startsWith("a"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

}
/*
You have a list of strings  aand you want to keep only those that start
with “A” and you want to return them in lower case
 */
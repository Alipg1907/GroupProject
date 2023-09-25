

/*
Write a program to swap 2 String without a temporary variable?
 */
public class Task1 {
    public static void main(String[] args) {
            String a="car";
            String b="dog";
        System.out.println("before swap " +a+ " "+b);
        //Concatenate the two Strings

        a=a+b;
        //Extract the substrings of concatenated String
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("after swap "+a+" "+b);
        System.out.println("&&&&&&&&");



    }
}

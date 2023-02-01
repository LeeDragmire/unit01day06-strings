// good
public class ShortLongShort {
    public static void main(String[] args) {
        String first = new String("");
        String second = new String("");
        if (args[0].length() == args[1].length()) {
            System.out.println("The Statements are the same length. Please try again");
        } else {
            if (args[0].length() < args[1].length()) {
                first = new String(args[0]);
                second = new String(args[1]); 
            } else {
                first = new String(args[1]);
                second = new String(args[0]);
            }
            System.out.println(args[0] + " | " + args[1] + " | " + first + second + first);
        }
    }
}

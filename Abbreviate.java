public class Abbreviate {
    public static void main(String[] args) {
        if (args[0].length() <= 8) {
            System.out.println(args[0]);
        } else {
            String newString = args[0].substring(0,2) + "..." + args[0].substring(args[0].length() - 2, args[0].length());
            System.out.println(newString);
        }
    }
}

// javac Abbreviate.java; java Abbreviate
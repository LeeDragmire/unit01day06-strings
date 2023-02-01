// this works, but substring (vs indexOf) would be a more natural way to compare the start to "not"
// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        String negate;
        if (args[0].indexOf("not") == 0) {
            negate = args[0];
        } else {
            negate = "not " + args[0];
        }
        System.out.println(negate);
    }
}

// javac NegatePhrase.java; java NegatePhrase 
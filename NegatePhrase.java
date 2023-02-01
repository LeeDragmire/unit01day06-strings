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
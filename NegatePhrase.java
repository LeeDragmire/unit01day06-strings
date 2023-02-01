public class NegatePhrase {
    public static void main(String[] args) {
        String negated;
        if (args[0].indexOf("not") == 0) {
            negated = args[0];
        } else {
            negated = "not " + args[0];
        }
        System.out.println(negated);
    }
}

// javac NegatePhrase.java; java NegatePhrase 
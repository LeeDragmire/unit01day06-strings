public class NegatePhrase {
    public static void main(String[] args) {
        if (args[0].indexOf('n') == 0 && args[0].indexOf('o') == 1 && args[0].indexOf('t') == 2) {
            System.out.println(args[0]);
        } else {
            System.out.println("not " + args[0]);
        }
    }
}

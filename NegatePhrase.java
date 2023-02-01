// this works, but substring (vs indexOf) would be a more natural way to compare the start to "not"
// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        if (args[0].indexOf('n') == 0 && args[0].indexOf('o') == 1 && args[0].indexOf('t') == 2) {
            System.out.println(args[0]);
        } else {
            System.out.println("not " + args[0]);
        }
    }
}

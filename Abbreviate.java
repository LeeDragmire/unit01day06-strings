public class Abbreviate {
    public static void main(String[] args) {
        if ( args[0].length() <= 8) {
            System.out.println(args[0]);
        } else {
            String replace = new String(args[0].substring(2, args[0].length() - 2));
            System.out.println(args[0].replace(replace, "..."));
        }
    
    }
}

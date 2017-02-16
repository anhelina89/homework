package extra;

/**
 * Created by Angelina on 05.02.2017.
 */
public class TestRegex {
    public static final String REGEX = "([-+]?[0-9]*\\.?[0-9]+[\\/\\+\\-\\*])+([-+]?[0-9]*\\.?[0-9]+)";
    public static void main(final String[] args) throws Exception {
        String[] ss = REGEX.split("/+");
        for (String s : ss) {
            System.out.println(s);
        }
    }
}

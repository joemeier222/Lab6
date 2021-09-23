package tarleton.lab6;

/**
 *
 * @author Joseph Meier
 */
public class Question {
    private String text;
    private int id;

    @Override
    public String toString() {
        return Integer.toString(id) + ": " + text;
    }
}

package tarleton.lab6;

/**
 *
 * @author Joe Meier
 */
public class Answer {
    private int id;
    private String text;

    public Answer(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return Integer.toString(id) + ": " + text;
    }
}

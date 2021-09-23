package tarleton.lab6;

/**
 *
 * @author Joseph Meier
 */
public class Question {
    private final String text;
    private final int id;

    public Question(int id, String text) {
        this.text = text;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return Integer.toString(id) + ": " + text;
    }
}

package tarleton.lab6;

/**
 *
 * @author Joseph Meier
 */

//Class to contain question and id
public class Question {
    private final String text;
    private final int id;

    public Question(int id, String text) {
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return Integer.toString(id) + ": " + text;
    }
}

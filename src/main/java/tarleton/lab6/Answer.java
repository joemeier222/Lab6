package tarleton.lab6;

/**
 *
 * @author Joe Meier
 */

//Question to contain answer and id
public class Answer {
    private int id;
    private String text;

    public Answer(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
    
    @Override
    public String toString() {
        return Integer.toString(id) + ": " + text;
    }
}

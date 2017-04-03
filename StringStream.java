/**
 * Created by Alex on 01/04/17.
 */
public class StringStream implements Stream {

    private String stream;
    private int currentChar;

    public StringStream(String stream) {
        this.stream = stream;
    }

    @Override
    public char getNext() {
        return this.stream.charAt(currentChar++);
    }

    @Override
    public boolean hasNext() {
        return this.stream.length() > currentChar;
    }
}

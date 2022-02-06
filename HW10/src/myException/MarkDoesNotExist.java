package myException;

public class MarkDoesNotExist extends Exception{
    public MarkDoesNotExist(String message) {
        super(message);
    }
}

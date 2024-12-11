public class NameNotValidException extends Exception {
    String error;
    NameNotValidException(String error)
    {
        super(error);
    }
}

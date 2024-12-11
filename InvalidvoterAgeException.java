public class InvalidvoterAgeException
    extends Exception {

    String message;
    InvalidvoterAgeException(String message) {
            super(message);
        }
}

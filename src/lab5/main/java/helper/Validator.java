package lab5.main.java.helper;

public class Validator {
    public int validateIntegerBySign(int oldInteger, int newInteger) {
        if (newInteger <= 0) {
            return oldInteger;
        }
        return newInteger;
    }
}

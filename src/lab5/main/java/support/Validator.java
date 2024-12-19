package lab5.main.java.support;

public class Validator {
    public int validateIntegerBySign(int oldInteger, int newInteger) {
        if (newInteger <= 0) {
            return oldInteger;
        }
        return newInteger;
    }
}

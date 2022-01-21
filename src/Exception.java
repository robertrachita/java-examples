/**
 * This program is used to create custom exception.
 * @author w3spoint
 */
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Test{
    public void display() throws MyException {
        throw new MyException("This is a custom exception.");
    }
}


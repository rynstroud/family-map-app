package dao;

public class DataAccessException extends Exception {
    DataAccessException(String message)
    {
        super(message);
    }

    public DataAccessException()
    {
        super();
    }
}

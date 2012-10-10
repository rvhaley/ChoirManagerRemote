package dk.cphbusiness.choir.contract.eto;

public class NoSuchMemberException extends Exception
{

    private long id;

    public NoSuchMemberException(long id, String message)
    {
        super(message);
        this.id = id;
    }

    public long getId()
    {
        return id;
    }
}

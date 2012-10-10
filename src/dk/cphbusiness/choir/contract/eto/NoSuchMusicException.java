package dk.cphbusiness.choir.contract.eto;

public class NoSuchMusicException extends Exception
{

    private long id;

    public NoSuchMusicException(long id, String message)
    {
        super(message);
        this.id = id;
    }

    public long getId()
    {
        return id;
    }
}

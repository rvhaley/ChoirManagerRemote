package dk.cphbusiness.choir.contract.eto;

public class NoSuchArtistException extends Exception
{

    private long id;

    public NoSuchArtistException(long id, String string)
    {
        super(string);
        this.id = id;
    }

    public long getId()
    {
        return id;
    }
}

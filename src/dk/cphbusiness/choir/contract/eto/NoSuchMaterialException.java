package dk.cphbusiness.choir.contract.eto;

public class NoSuchMaterialException extends Exception
{

    private long id;

    public NoSuchMaterialException(long id, String message)
    {
        super(message);
        this.id = id;
    }

    public long getId()
    {
        return id;
    }
}

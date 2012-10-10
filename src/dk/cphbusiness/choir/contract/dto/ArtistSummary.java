package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;

public class ArtistSummary implements Serializable
{

    private long id;
    private String name;
    private String wikiUrl;

    public ArtistSummary(long id, String name, String wikiUrl)
    {
        this.id = id;
        this.name = name;
        this.wikiUrl = wikiUrl;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getWikiUrl()
    {
        return wikiUrl;
    }
}

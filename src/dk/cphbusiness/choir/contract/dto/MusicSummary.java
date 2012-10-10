package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;

public class MusicSummary implements Serializable
{

    private long id;
    private String title;
    private String composerName;
    private String opus;
    private String description;

    public MusicSummary()
    {
    }

    public MusicSummary(
            long id,
            String title,
            String composerName,
            String opus,
            String description)
    {
        this.id = id;
        this.title = title;
        this.composerName = composerName;
        this.opus = opus;
        this.description = description;
    }

    public long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getComposerName()
    {
        return composerName;
    }

    public String getOpus()
    {
        return opus;
    }

    public String getDescription()
    {
        return description;
    }
}

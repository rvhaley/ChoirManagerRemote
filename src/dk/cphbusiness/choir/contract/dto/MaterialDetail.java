package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;
import java.util.Collection;

public class MaterialDetail implements Serializable
{

    public static final String AUDIO = "audio";
    public static final String SHEET = "sheet";
    private long id;
    private String title;
    private Collection<VoiceSummary> voices;
    private int[] voiceCodes;
    private MusicSummary music;
    private long musicId;
    private String fileName;
    private int fileSize;
    private String type;
    private int playingTime;
    private int pageCount;

    public MaterialDetail()
    {
    }

    public MaterialDetail(
            long id,
            String title,
            Collection<VoiceSummary> voices,
            MusicSummary music,
            String fileName,
            int fileSize,
            int playingTime,
            int pageCount)
    {
        this.id = id;
        this.title = title;
        this.voices = voices;
        voiceCodes = null;
        this.music = music;
        musicId = music.getId();
        this.fileName = fileName;
        this.fileSize = fileSize;
        if (playingTime > 0)
        {
            type = AUDIO;
        } else if (pageCount > 0)
        {
            type = SHEET;
        } else
        {
            type = null;
        }
        this.playingTime = playingTime;
        this.pageCount = pageCount;
    }

    public long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Collection<VoiceSummary> getVoices()
    {
        return voices;
    }

    public void setVoiceCodes(int[] values)
    {
        voiceCodes = values;
    }

    /**
     * Get the voice codes if they where changed.
     *
     * @return null if not changed, otherwise the codes.
     */
    public int[] getVoiceCodes()
    {
        return voiceCodes;
    }

    public MusicSummary getMusic()
    {
        return music;
    }

    public void setMusicId(long value)
    {
        musicId = value;
    }

    public long getMusicId()
    {
        return musicId;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public int getFileSize()
    {
        return fileSize;
    }

    public void setFileSize(int fileSize)
    {
        this.fileSize = fileSize;
    }

    public String getType()
    {
        return type;
    }

    public int getPlayingTime()
    {
        return playingTime;
    }

    public void setPlayingTime(int playingTime)
    {
        if (playingTime > 0)
        {
            type = AUDIO;
        }
        this.playingTime = playingTime;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(int pageCount)
    {
        if (pageCount > 0)
        {
            type = SHEET;
        }
        this.pageCount = pageCount;
    }
}

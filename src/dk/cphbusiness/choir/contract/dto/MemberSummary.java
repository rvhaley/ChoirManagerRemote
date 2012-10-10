package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;

public class MemberSummary implements Serializable
{

    private long id;
    private String voiceName;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String birthDay;

    // public MemberSummary() { }
    public MemberSummary(
            long id,
            String voiceName,
            String name,
            String address,
            String email,
            String phone,
            String birthDay)
    {
        this.id = id;
        this.voiceName = voiceName;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthDay = birthDay;
    }

    public long getId()
    {
        return id;
    }

    public String getVoiceName()
    {
        return voiceName;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getBirthDay()
    {
        return birthDay;
    }
}

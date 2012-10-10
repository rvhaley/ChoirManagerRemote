package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class MemberDetail implements Serializable
{

    private long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private VoiceSummary voice;
    private int voiceCode;
    private Collection<RoleSummary> roles;
    private String[] roleCodes;
    private String street;
    private String zipCode;
    private String city;
    private String email;
    private String phone;

    public MemberDetail()
    {
    }

    public MemberDetail(
            long id,
            String firstName,
            String lastName,
            Date dateOfBirth,
            VoiceSummary voice,
            Collection<RoleSummary> roles,
            String street,
            String zipCode,
            String city,
            String email,
            String phone)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.voice = voice;
        this.voiceCode = voice.getCode();
        this.roles = roles;
        roleCodes = new String[roles.size()];
        int i = 0;
        for (RoleSummary role : roles)
        {
            roleCodes[i++] = role.getCode();
        }
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.phone = phone;
    }

    public long getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public VoiceSummary getVoice()
    {
        return voice;
    }

    public int getVoiceCode()
    {
        return voiceCode;
    }

    public Collection<RoleSummary> getRoles()
    {
        return roles;
    }

    public String[] getRoleCodes()
    {
        return roleCodes;
    }

    public String getStreet()
    {
        return street;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public String getCity()
    {
        return city;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setVoiceCode(int voiceCode)
    {
        this.voiceCode = voiceCode;
    }

    public void setRoleCodes(String[] roleCodes)
    {
        this.roleCodes = roleCodes;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}

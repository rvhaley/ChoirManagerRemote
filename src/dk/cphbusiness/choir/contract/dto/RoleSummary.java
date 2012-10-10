package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;

public class RoleSummary implements Serializable
{

    private String code;
    private String name;

    public RoleSummary(String code, String name)
    {
        this.code = code;
        this.name = name;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }
}

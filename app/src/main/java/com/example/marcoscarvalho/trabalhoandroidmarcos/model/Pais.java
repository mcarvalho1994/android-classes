package com.example.marcoscarvalho.trabalhoandroidmarcos.model;

import com.google.gson.annotations.SerializedName;

public class Pais
{
    /*Declaração de variaveis*/
    @SerializedName("numPostalCodes")
    private Integer numPostalCodes;

    @SerializedName("maxPostalCode")
    private String maxPostalCode;

    @SerializedName("countryCode")
    private String countryCode;

    @SerializedName("minPostalCode")
    private String minPostalCode;

    @SerializedName("countryName")
    private String countryName;

    /*Getters and Setters*/
    public Integer getNumPostalCodes()
    {
        return numPostalCodes;
    }

    public void setNumPostalCodes(Integer numPostalCodes)
    {
        this.numPostalCodes = numPostalCodes;
    }

    public String getMaxPostalCode()
    {
        return maxPostalCode;
    }

    public void setMaxPostalCode(String maxPostalCode)
    {
        this.maxPostalCode = maxPostalCode;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getMinPostalCode()
    {
        return minPostalCode;
    }

    public void setMinPostalCode(String minPostalCode)
    {
        this.minPostalCode = minPostalCode;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    /*Construtor*/
    public Pais (Integer numPostalCodes, String maxPostalCode, String countryCode, String minPostalCode, String countryName)
    {
        this.numPostalCodes = numPostalCodes;
        this.maxPostalCode = maxPostalCode;
        this.countryCode = countryCode;
        this.minPostalCode = minPostalCode;
        this.countryName = countryName;
    }
}

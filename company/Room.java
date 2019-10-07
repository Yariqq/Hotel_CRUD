package com.company;

import java.util.ArrayList;

public class Room {
    private String bedCount;
    private Boolean isBalcony;
    private Boolean isBathTube;
    private ArrayList<String> bedSize;

    public String getBedCount()
    {
        return bedCount;
    }

    public void setBedCount(String bedCount)
    {
        this.bedCount = bedCount;
    }

    public Boolean getBalcony()
    {
        return isBalcony;
    }

    public void setBalcony(Boolean balcony)
    {
        isBalcony = balcony;
    }

    public Boolean getBathTube()
    {
        return isBathTube;
    }

    public void setBathTube(Boolean bathTube)
    {
        isBathTube = bathTube;
    }

    public ArrayList<String> getBedSize()
    {
        return bedSize;
    }

    public void setBedSize(ArrayList<String> bedSizeList)
    {
        bedSize = bedSizeList;
    }

    Room() {}
}

package com.company;

public class Parking {
    private String placeCount;
    private String parkingHeight;
    private Boolean cardPayment;

    public String getPlaceCount()
    {
        return placeCount;
    }

    public void setPlaceCount(String placeCount)
    {
        this.placeCount = placeCount;
    }

    public String getParkingHeight()
    {
        return parkingHeight;
    }

    public void setParkingHeight(String parkingHeight)
    {
        this.parkingHeight = parkingHeight;
    }

    public Boolean getCardPayment()
    {
        return cardPayment;
    }

    public void setCardPayment(Boolean cardPayment)
    {
        this.cardPayment = cardPayment;
    }

    Parking() {}
}

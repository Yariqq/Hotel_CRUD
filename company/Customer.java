package com.company;

public class Customer {
    private String name;
    private String surname;
    private String personCount;
    private String cardNumber;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
       return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPersonCount()
    {
        return personCount;
    }

    public void setPersonCount(String personCount)
    {
        this.personCount = personCount;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    Customer() {}
}

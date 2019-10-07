package com.company;

import java.util.ArrayList;

public class Breakfast {
    private ArrayList<String> food;
    private ArrayList<String> drinks;

    public ArrayList<String> getFood()
    {
        return food;
    }

    public void setFood(ArrayList<String> foodList)
    {
        food = foodList;
    }

    public ArrayList<String> getDrinks()
    {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinksList)
    {
        drinks = drinksList;
    }

    Breakfast() {}
}

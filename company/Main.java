package com.company;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Parking> parkings = new ArrayList<>();
        ArrayList<Breakfast> breakfasts = new ArrayList<>();
        int customersListIndex = 0;
        int roomsListIndex = 0;
        int parkingListIndex = 0;
        int breakfastListIndex = 0;
        int exitVar;
        do {
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. End the program");
            exitVar = in.nextInt();
            switch (exitVar) {
                case 1:
                    in.nextLine();
                    System.out.println("1. Customer");
                    System.out.println("2. Room");
                    System.out.println("3. Parking");
                    System.out.println("4. Breakfast");
                    switch (in.nextInt()) {
                        case 1:
                            in.nextLine();
                            Customer customer = new Customer();
                            System.out.println("Enter customer's name: ");
                            customer.setName(in.nextLine());
                            System.out.println("Enter customer's surname: ");
                            customer.setSurname(in.nextLine());
                            System.out.println("Enter person number: ");
                            customer.setPersonCount(in.nextLine());
                            System.out.println("Enter customer's card number: ");
                            customer.setCardNumber(in.nextLine());
                            customers.add(customersListIndex, customer);
                            customersListIndex++;
                            break;

                        case 2:
                            in.nextLine();
                            ArrayList<String> bedList = new ArrayList<>();
                            Room room = new Room();
                            System.out.println("Enter number of beds in the room: ");
                            room.setBedCount(in.nextLine());
                            System.out.println("Is there a balcony in the room?");
                            System.out.println("    1.Yes");
                            System.out.println("    2.No");
                            Integer input1 = in.nextInt();
                            in.nextLine();
                            if (input1 == 1)
                                room.setBalcony(true);
                            else if (input1 == 2)
                                room.setBalcony(false);

                            System.out.println("Is there a bath tube in the room?");
                            System.out.println("    1.Yes");
                            System.out.println("    2.No");
                            Integer input2 = in.nextInt();
                            in.nextLine();
                            if (input2 == 1)
                                room.setBathTube(true);
                            else if (input2 == 2)
                                room.setBathTube(false);

                            for (int i = 1; i <= Integer.parseInt(room.getBedCount()); i++) {
                                System.out.println("Choose the size of the " + i + " bed: ");
                                System.out.println("    1.Small");
                                System.out.println("    2.Medium");
                                System.out.println("    3.Big");
                                System.out.println("    4.King-size");
                                switch (in.nextInt()) {
                                    case 1:
                                        bedList.add("Small");
                                        break;
                                    case 2:
                                        bedList.add("Medium");
                                        break;
                                    case 3:
                                        bedList.add("Big");
                                        break;
                                    case 4:
                                        bedList.add("King-size");
                                        break;
                                }
                            }
                            room.setBedSize(bedList);
                            rooms.add(roomsListIndex, room);
                            roomsListIndex++;
                            in.nextLine();
                            break;

                        case 3:
                            in.nextLine();
                            Parking parking = new Parking();
                            System.out.println("Enter place number in the parking: ");
                            parking.setPlaceCount(in.nextLine());
                            System.out.println("Enter height of parking: ");
                            parking.setParkingHeight(in.nextLine());
                            System.out.println("Is card payment available?");
                            System.out.println("    1.Yes");
                            System.out.println("    2.No");
                            Integer input3 = in.nextInt();
                            in.nextLine();
                            if (input3 == 1)
                                parking.setCardPayment(true);
                            else if (input3 == 2)
                                parking.setCardPayment(false);
                            parkings.add(parkingListIndex, parking);
                            parkingListIndex++;
                            break;

                        case 4:
                            in.nextLine();
                            ArrayList<String> list1 = new ArrayList<>();
                            ArrayList<String> list2 = new ArrayList<>();
                            Breakfast breakfast = new Breakfast();
                            String breakfastFoodElement, breakfastDrinkElement;
                            do {
                                System.out.println("Enter the name of dish (enter 0, if that's it): ");
                                breakfastFoodElement = in.nextLine();
                                list1.add(breakfastFoodElement);
                            } while (!breakfastFoodElement.equals("0"));
                            list1.remove(list1.size() - 1);
                            breakfast.setFood(list1);

                            do {
                                System.out.println("Enter the name of drink (enter 0, if that's it): ");
                                breakfastDrinkElement = in.nextLine();
                                list2.add(breakfastDrinkElement);
                            } while (!breakfastDrinkElement.equals("0"));
                            list2.remove(list2.size() - 1);
                            breakfast.setDrinks(list2);

                            breakfasts.add(breakfastListIndex, breakfast);
                            breakfastListIndex++;
                            break;

                    }
                    break;
                case 2:
                    in.nextLine();
                    System.out.println("1. Customers");
                    System.out.println("2. Rooms");
                    System.out.println("3. Parkings");
                    System.out.println("4. Breakfasts");
                    switch (in.nextInt()) {
                        case 1:
                            in.nextLine();
                            for (int i = 0; i < customers.size(); i++)
                            {
                                System.out.println("Customer " + (i+1) + ": ");
                                System.out.println("    Customer's name: " + customers.get(i).getName());
                                System.out.println("    Customer's surname: " + customers.get(i).getSurname());
                                System.out.println("    Person count: " + customers.get(i).getPersonCount());
                                System.out.println("    Customer's card number: " + customers.get(i).getCardNumber());
                            }
                            break;
                        case 2:
                            in.nextLine();
                            for (int i = 0; i < rooms.size(); i++)
                            {
                                System.out.println("Room " + (i+1) + ": ");
                                System.out.println("    Number of beds: " + rooms.get(i).getBedCount());
                                System.out.println("    Balcony: " + rooms.get(i).getBalcony());
                                System.out.println("    Bath tube: " + rooms.get(i).getBathTube());
                                System.out.println("    Size of bed(s): " + rooms.get(i).getBedSize());
                            }
                            break;
                        case 3:
                            in.nextLine();
                            for (int i = 0; i < parkings.size(); i++)
                            {
                                System.out.println("Parking " + (i+1) + ": ");
                                System.out.println("    Number of places: " + parkings.get(i).getPlaceCount());
                                System.out.println("    Parking height: " + parkings.get(i).getParkingHeight());
                                System.out.println("    Card payment: " + parkings.get(i).getCardPayment());
                            }
                            break;
                        case 4:
                            in.nextLine();
                            for (int i = 0; i < breakfasts.size(); i++)
                            {
                                System.out.println("Breakfast " + (i+1) + ": ");
                                System.out.println("    Food: " + breakfasts.get(i).getFood());
                                System.out.println("    Drinks: " + breakfasts.get(i).getDrinks());
                            }
                            break;
                    }
                    break;
                case 3:
                    in.nextLine();
                    System.out.println("1. Customers");
                    System.out.println("2. Rooms");
                    System.out.println("3. Parkings");
                    System.out.println("4. Breakfasts");
                    switch (in.nextInt()) {
                        case 1:
                            in.nextLine();
                            System.out.println("What customer you want to update?");
                            int tempIndex1 = in.nextInt();
                            in.nextLine();
                            System.out.println("What do you want to update?");
                            System.out.println("    1. Name");
                            System.out.println("    2. Surname");
                            System.out.println("    3. Person number");
                            System.out.println("    4. Customer's card number");
                            switch (in.nextInt()) {
                                case 1:
                                    in.nextLine();
                                    System.out.println("Enter new name: ");
                                    customers.get(tempIndex1 - 1).setName(in.nextLine());
                                    System.out.println("Name successfully changed!");
                                    break;
                                case 2:
                                    in.nextLine();
                                    System.out.println("Enter new surname: ");
                                    customers.get(tempIndex1 - 1).setSurname(in.nextLine());
                                    System.out.println("Surname successfully changed!");
                                    break;
                                case 3:
                                    in.nextLine();
                                    System.out.println("Enter new person number: ");
                                    customers.get(tempIndex1 - 1).setPersonCount(in.nextLine());
                                    System.out.println("Person number successfully changed!");
                                    break;
                                case 4:
                                    in.nextLine();
                                    System.out.println("Enter new customer's card number: ");
                                    customers.get(tempIndex1 - 1).setCardNumber(in.nextLine());
                                    System.out.println("Customer's card number successfully changed!");
                                    break;
                            }
                            break;
                        case 2:
                            in.nextLine();
                            System.out.println("What room you want to update?");
                            int tempIndex2 = in.nextInt();
                            in.nextLine();
                            System.out.println("What do you want to update?");
                            System.out.println("    1. Number of beds");
                            System.out.println("    2. Existence of balcony");
                            System.out.println("    3. Existence of bath tube");
                            System.out.println("    4. Bed(s) size");
                            switch (in.nextInt()) {
                                case 1:
                                    in.nextLine();
                                    System.out.println("Enter new number of beds: ");
                                    rooms.get(tempIndex2 - 1).setBedCount(in.nextLine());
                                    System.out.println("Number of beds successfully changed!");
                                    break;
                                case 2:
                                    in.nextLine();
                                    if (rooms.get(tempIndex2 - 1).getBalcony())
                                        rooms.get(tempIndex2 - 1).setBalcony(false);
                                    else
                                        rooms.get(tempIndex2 - 1).setBalcony(true);
                                    System.out.println("Existence of balcony successfully changed!");
                                    break;
                                case 3:
                                    in.nextLine();
                                    if (rooms.get(tempIndex2 - 1).getBathTube())
                                        rooms.get(tempIndex2 - 1).setBathTube(false);
                                    else
                                        rooms.get(tempIndex2 - 1).setBathTube(true);
                                    System.out.println("Existence of bath tube successfully changed!");
                                    break;
                                case 4:
                                    in.nextLine();
                                    ArrayList<String> tempList = new ArrayList<>();
                                    System.out.println("Enter the number of bed you want to change: ");
                                    int tempIndex = in.nextInt();
                                    in.nextLine();
                                    System.out.println("Choose new size: ");
                                    System.out.println("    1. Small");
                                    System.out.println("    2. Medium");
                                    System.out.println("    3. Big");
                                    System.out.println("    4. King-size");
                                    switch (in.nextInt()) {
                                        case 1:
                                            in.nextLine();
                                            tempList = rooms.get(tempIndex2 - 1).getBedSize();
                                            tempList.set(tempIndex - 1, "Small");
                                            rooms.get(tempIndex2 - 1).setBedSize(tempList);
                                            System.out.println("Bed size successfully changed!");
                                            break;
                                        case 2:
                                            in.nextLine();
                                            tempList = rooms.get(tempIndex2 - 1).getBedSize();
                                            tempList.set(tempIndex - 1, "Medium");
                                            rooms.get(tempIndex2 - 1).setBedSize(tempList);
                                            System.out.println("Bed size successfully changed!");
                                            break;
                                        case 3:
                                            in.nextLine();
                                            tempList = rooms.get(tempIndex2 - 1).getBedSize();
                                            tempList.set(tempIndex - 1, "Big");
                                            rooms.get(tempIndex2 - 1).setBedSize(tempList);
                                            System.out.println("Bed size successfully changed!");
                                            break;
                                        case 4:
                                            in.nextLine();
                                            tempList = rooms.get(tempIndex2 - 1).getBedSize();
                                            tempList.set(tempIndex - 1, "King-size");
                                            rooms.get(tempIndex2 - 1).setBedSize(tempList);
                                            System.out.println("Bed size successfully changed!");
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            in.nextLine();
                            System.out.println("What parking you want to update?");
                            int tempIndex3 = in.nextInt();
                            in.nextLine();
                            System.out.println("What do you want to update?");
                            System.out.println("    1. Number of places");
                            System.out.println("    2. Parking height");
                            System.out.println("    3. Card payment");
                            switch (in.nextInt()) {
                                case 1:
                                    in.nextLine();
                                    System.out.println("Enter new number of places: ");
                                    parkings.get(tempIndex3 - 1).setPlaceCount(in.nextLine());
                                    System.out.println("Number of places successfully changed!");
                                    break;
                                case 2:
                                    in.nextLine();
                                    System.out.println("Enter new parking height: ");
                                    parkings.get(tempIndex3 - 1).setParkingHeight(in.nextLine());
                                    System.out.println("Parking height successfully changed!");
                                    break;
                                case 3:
                                    in.nextLine();
                                    if (parkings.get(tempIndex3 - 1).getCardPayment())
                                        parkings.get(tempIndex3 - 1).setCardPayment(false);
                                    else
                                        parkings.get(tempIndex3 - 1).setCardPayment(true);
                                    System.out.println("Card payment option successfully changed!");
                                    break;
                            }
                            break;
                        case 4:
                            in.nextLine();
                            System.out.println("What breakfast you want to update?");
                            int tempIndex4 = in.nextInt();
                            in.nextLine();
                            System.out.println("Do you want to update food or drinks?");
                            System.out.println("    1. Food");
                            System.out.println("    2. Drinks");
                            int choose = in.nextInt();
                            in.nextLine();
                            if (choose == 1)
                            {
                                System.out.print("What dish you want to update: ");
                                System.out.println(breakfasts.get(tempIndex4 - 1).getFood());
                                String dishToUpdate = in.nextLine();
                                for (int i = 0; i < breakfasts.get(tempIndex4 - 1).getFood().size(); i++)
                                    if (dishToUpdate.equals(breakfasts.get(tempIndex4 - 1).getFood().get(i)))
                                    {
                                        System.out.println("Enter new name of dish: ");
                                        breakfasts.get(tempIndex4 - 1).getFood().set(i, in.nextLine());
                                        System.out.println("The name of dish successfully changed!");
                                    }
                            }
                            else
                            {
                                System.out.print("What drink you want to update: ");
                                System.out.println(breakfasts.get(tempIndex4 - 1).getDrinks());
                                String drinkToUpdate = in.nextLine();
                                for (int i = 0; i < breakfasts.get(tempIndex4 - 1).getDrinks().size(); i++)
                                    if (drinkToUpdate.equals(breakfasts.get(tempIndex4 - 1).getDrinks().get(i)))
                                    {
                                        System.out.println("Enter new name of drink: ");
                                        breakfasts.get(tempIndex4 - 1).getDrinks().set(i, in.nextLine());
                                        System.out.println("The name of drink successfully changed!");
                                    }
                            }
                            break;
                    }
                    break;
                case 4:
                    in.nextLine();
                    System.out.println("What do you want to delete?");
                    System.out.println("1. Customer");
                    System.out.println("2. Room");
                    System.out.println("3. Parking");
                    System.out.println("4. Breakfast");
                    switch (in.nextInt()) {
                        case 1:
                            in.nextLine();
                            System.out.println("What customer you want to delete?");
                            customers.remove(in.nextInt() - 1);
                            in.nextLine();
                            System.out.println("Customer deleted successfully");
                            break;
                        case 2:
                            in.nextLine();
                            System.out.println("What room you want to delete?");
                            rooms.remove(in.nextInt() - 1);
                            in.nextLine();
                            System.out.println("Room deleted successfully");
                            break;
                        case 3:
                            in.nextLine();
                            System.out.println("What parking you want to delete?");
                            parkings.remove(in.nextInt() - 1);
                            in.nextLine();
                            System.out.println("Parking deleted successfully");
                            break;
                        case 4:
                            in.nextLine();
                            System.out.println("What breakfast you want to delete?");
                            breakfasts.remove(in.nextInt() - 1);
                            in.nextLine();
                            System.out.println("Breakfast deleted successfully");
                            break;
                    }
                    break;
                case 5:
                    in.nextLine();
                    System.out.println("1. Search customer");
                    System.out.println("2. Search room");
                    System.out.println("3. Search parking");
                    System.out.println("4. Search breakfast");
                    switch (in.nextInt()) {
                        case 1:
                            in.nextLine();
                            System.out.println("    1. Search by name");
                            System.out.println("    2. Search by surname");
                            System.out.println("    3. Search by number of people");
                            System.out.println("    4. Search by card number");
                            switch (in.nextInt()) {
                                case 1:
                                    in.nextLine();
                                    System.out.println("Enter the name of the customer you want to find: ");
                                    String nameToFind = in.nextLine();
                                    for (int i = 0; i < customers.size(); i++)
                                    {
                                        if (customers.get(i).getName().equals(nameToFind))
                                        {
                                            System.out.println("    Customer's name: " + customers.get(i).getName());
                                            System.out.println("    Customer's surname: " + customers.get(i).getSurname());
                                            System.out.println("    Person count: " + customers.get(i).getPersonCount());
                                            System.out.println("    Customer's card number: " + customers.get(i).getCardNumber());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                case 2:
                                    in.nextLine();
                                    System.out.println("Enter the surname of the customer you want to find: ");
                                    String surnameToFind = in.nextLine();
                                    for (int i = 0; i < customers.size(); i++)
                                    {
                                        if (customers.get(i).getSurname().equals(surnameToFind))
                                        {
                                            System.out.println("    Customer's name: " + customers.get(i).getName());
                                            System.out.println("    Customer's surname: " + customers.get(i).getSurname());
                                            System.out.println("    Person count: " + customers.get(i).getPersonCount());
                                            System.out.println("    Customer's card number: " + customers.get(i).getCardNumber());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                case 3:
                                    in.nextLine();
                                    System.out.println("Enter the number of people with customer: ");
                                    String peopleCountToFind = in.nextLine();
                                    for (int i = 0; i < customers.size(); i++)
                                    {
                                        if (customers.get(i).getPersonCount().equals(peopleCountToFind))
                                        {
                                            System.out.println("    Customer's name: " + customers.get(i).getName());
                                            System.out.println("    Customer's surname: " + customers.get(i).getSurname());
                                            System.out.println("    Person count: " + customers.get(i).getPersonCount());
                                            System.out.println("    Customer's card number: " + customers.get(i).getCardNumber());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                case 4:
                                    in.nextLine();
                                    System.out.println("Enter the number of card: ");
                                    String cardToFind = in.nextLine();
                                    for (int i = 0; i < customers.size(); i++)
                                    {
                                        if (customers.get(i).getCardNumber().equals(cardToFind))
                                        {
                                            System.out.println("    Customer's name: " + customers.get(i).getName());
                                            System.out.println("    Customer's surname: " + customers.get(i).getSurname());
                                            System.out.println("    Person count: " + customers.get(i).getPersonCount());
                                            System.out.println("    Customer's card number: " + customers.get(i).getCardNumber());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            in.nextLine();
                            System.out.println("Function is not available");
                            break;
                        case 3:
                            in.nextLine();
                            System.out.println("Function is not available");
                            break;
                        case 4:
                            in.nextLine();
                            System.out.println("Function is not available");
                            break;
                    }
                    break;
            }
        }
        while (exitVar != 6);
    }
}

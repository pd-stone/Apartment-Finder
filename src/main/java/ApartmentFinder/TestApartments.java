package ApartmentFinder;
import java.util.*;

/**
 * CS 232 Programming Project 4
 * This program utilizes constructors, methods and functions to create an Apartment
 * finder that the user can utilize to find an apartment that suits their needs
 * @author pauld
 */

public class TestApartments 
{
    public static void main(String args[]) 
    {
        Apartment apt1 = new Apartment(101, 2, 1, 725);
        Apartment apt2 = new Apartment(102, 2, 1.5, 775);
        Apartment apt3 = new Apartment(103, 3, 2, 870);
        Apartment apt4 = new Apartment(104, 3, 2.5, 960);
        Apartment apt5 = new Apartment(105, 3, 3, 1100);
        
        Scanner input = new Scanner(System.in);
        
        int minBedrooms;
        double minBathrooms;
        double maxRent;
        
        System.out.print("Enter minimum number of bedrooms needed >> ");
        minBedrooms = input.nextInt();
        System.out.print("Enter minimum number of bathrooms needed >> ");
        minBathrooms = input.nextDouble();
        System.out.print("Enter maximum rent willing to pay >> ");
        maxRent = input.nextDouble();
        
        int count = 0;
        
        if (checkApt(apt1,minBedrooms,minBathrooms,maxRent) == true) 
        {
            displayApt(apt1);
            count++;
        }
        if (checkApt(apt2,minBedrooms,minBathrooms,maxRent) == true) 
        {
            displayApt(apt2);
            count++;
        }
        if (checkApt(apt3,minBedrooms,minBathrooms,maxRent) == true) 
        {
            displayApt(apt3);
            count++;
        }
        if (checkApt(apt4,minBedrooms,minBathrooms,maxRent) == true) 
        {
            displayApt(apt4);
            count++;
        }
        if (checkApt(apt5,minBedrooms,minBathrooms,maxRent) == true) 
        {
            displayApt(apt5);
            count++;
        }
        if (count == 0) 
        {
            System.out.println("Sorry! There are no Available apartments that "
                    + "match your needs!");
        }
    }
    
    public static boolean checkApt(Apartment apt, int bdrm, double bthrm, double rnt) 
    {
        boolean result = false;
        
        if ((apt.getBedroom() >= bdrm) && (apt.getBathroom() >= bthrm) && 
                (apt.getRent() <= rnt)) {
            result = true;
        }
        return result;
    }
    
    public static void displayApt(Apartment a)
    {
        System.out.println("This Apartment matches your needs! \n\n" + 
                    "Apartment " + a.getNumber() + "\n" +
                    a.getBedroom() + " bedrooms \n" +
                    a.getBathroom() + " bathrooms \n" +
                    "$" + a.getRent() + " per month in rent \n");
    }
}

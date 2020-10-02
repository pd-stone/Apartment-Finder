package ApartmentFinder;

/**
 * CS 232 Programming Project 4
 * This program utilizes constructors, methods and functions to create an Apartment
 * finder that the user can utilize to find an apartment that suits their needs
 * @author pauld
 */

public class Apartment 
{
    int aptNumber;
    int numBedroom;
    double numBath;
    double rent;
    
    public Apartment(int aN, int nBe, double nBa, double r) 
    {
        aptNumber = aN;
        numBedroom = nBe;
        numBath = nBa;
        rent = r;
    }
    
    public int getNumber() 
    {
        return aptNumber;
    }
    public int getBedroom() 
    {
        return numBedroom;
    }
    public double getBathroom() 
    {
        return numBath;
    }
    public double getRent() 
    {
        return rent;
    }
}

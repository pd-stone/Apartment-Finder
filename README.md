# Apartment-Finder
Apartment Finder Java application from Spring 2020 CS 232 Intro To Programming II class with Professor Ghosh

This applications purpose was a basic frame of an apartment finder that would collect information from the user and compare that to a set list of apartments and then display the applicable apartments to the user based on their criteria.
This project is split between two files, Apartment.java and TestApartments.java . 
The Apartment file sets up some key fucntions, variables, and a constructor for the Test apartments file.
Apartment.java starts off by determining that it is in the ApartmentFinder package. Then a public class is created called Apartment.
Four variables are initialized. These are in the form of two integers and two doubles. The integers are aptNumber and numBedroom respectively.
the doubles are numBath and rent respectively as well.
Then a constructor is setup titled Apartment. The parameters for this constructor are two integers and two doubles. Within the constructor these are applied to the variables we have just created.
Next a few functions are created. These functions are setup to get the aptNumber, numBedroom, numBath, and rent variables respectively and return them. These are intended to be used at the end of the TestApartments file.
The TestApartments file is the file that holds the main function. This is where the application is mainly executed. 
To start the file out, it is placed in the ApartmentFinder package just like the Apartment.java file.
Then we import the entire Java.util library as we will use a few of the packages through the file.
Next a pubic class titles TestApartments is setup with a main public function setup within that class as well. This function is what executes the output
The function begins with the initilization of 5 apartment objects. They use the Apartment constructor that was created in Apartment.Java the Apartments all have different apt numbers, bathrooms, bedrooms and rents respective to those other details.
Then a scanner is setup to allow for user input. 
3 variables are created titles minBedrooms, minBathrooms, and maxRent. Being an integer and two doubles respectively.
The application then prints out a question asking the user the minimum number of bedrooms required and allows them to input that as an integer. 
That proess is then repeated for the minimum number of bathrooms and the maximum rent they are willing to pay. Both are accepted as doubles incase they require a half bath or have a non integer number for their maximum rent.
All of the information that the user inputs is set to the corresponding variable initialized earlier within the file
and integer, count, is initialized to zero.
A series of if statements are created to check whether the users requirements match the initialized apartments. If they match using the checkApt function (created later in the file) then the application will display the apartment's information as well as add one to the count integer and the program will terminate after the user continues.
If the users information does not match ANY of the pre initialized apartments then a message saying so will be printed for the user and the program will terminate after the user continues.
This is executed by recognizing that the count variable is 0 as the checkApt function found no matching apartments.
The checkApt function is also created within this file. It accepts the apartment name, bedrooms, bathrooms, and rent information. If the bedrooms and bathrooms are greater than the number they are checked against AND the rent is lower than the number it is checked against, the boolean result is set to true. Otherwise the boolean is initialized as false and because so, the false boolean is returned.
The other function within the file is the displayApt function. This only needs the apt name to execute.
It utilizes the get(x) functions created in the apartment.java file to construct a display of information for the user to view about the apartments that match their needs. It does this by combining predetermined strings with the initialized apartment information to display the number, bedrooms, bathrooms, and rent.

package Main;
import javax.swing.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setPersonId(101);
        person1.setFirstName("Mark");
        person1.setLastName("Swanson");
        person1.setUserName("mark.swanson");
        person1.setUpdated();

        Person person2 = new Person(102, "Angela", "Barbariol", "angela.barbariol");


        System.out.println("PersonId:\t\t" + person1.getPersonId());
        System.out.println("First name:\t\t" + person1.getFirstName());
        System.out.println("Last name:\t\t" + person1.getLastName());
        System.out.println("User name:\t\t" + person1.getUserName());
        System.out.println("Date updated:\t\t" + person1.getUpdated());
        System.out.println();

        System.out.println("PersonId:\t\t" + person2.getPersonId());
        System.out.println("First name:\t\t" + person2.getFirstName());
        System.out.println("Last name:\t\t" + person2.getLastName());
        System.out.println("User name:\t\t" + person2.getUserName());
        System.out.println("Date updated:\t\t" + person2.getUpdated());
        System.out.println();

        Apartment apartment1 = new Apartment();
        apartment1.setApartmentId(101);
        apartment1.setLocation("Red Wing");
        apartment1.setApartmentNum("101");
        apartment1.setSquareFeet(1000);
        apartment1.setPrice(1200);
        apartment1.setUpdated();

        Apartment apartment2 = new Apartment(102, "Hager City", "102", 1200, 1400);

        System.out.println(apartment1.toString());
//        System.out.println("Location:\t\t" + apartment1.getLocation());
//        System.out.println("Apartment #:\t\t" + apartment1.getApartmentNum());
//        System.out.println("Square Feet:\t\t" + apartment1.getSquareFeet());
//        System.out.println("Price:\t\t" + apartment1.getPrice());
//        System.out.println("Date updated:\t\t" + apartment1.getUpdated());
//        System.out.println();

        System.out.println(apartment2.toString());
//        System.out.println("Location:\t\t" + apartment2.getLocation());
//        System.out.println("Apartment #:\t\t" + apartment2.getApartmentNum());
//        System.out.println("Square Feet:\t\t" + apartment2.getSquareFeet());
//        System.out.println("Price:\t\t" + apartment2.getPrice());
//        System.out.println("Date updated:\t\t" + apartment2.getUpdated());
//        System.out.println();

        displayTotals(apartment1, apartment2);

    }
    public static void displayTotals(Apartment apartment1, Apartment apartment2) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        int totalSqrFeet = apartment1.getSquareFeet() + apartment2.getSquareFeet();
        double totalRevenue = apartment1.getPrice() + apartment2.getPrice();

       // JOptionPane.showMessageDialog(null, "Total square feet: " + (totalSqrFeet) + "\n Total monthly revenue: " + (totalRevenue));
        System.out.println("\n Total square feet: " + (totalSqrFeet) + "\n Total monthly revenue: " + (totalRevenue));
    }
}

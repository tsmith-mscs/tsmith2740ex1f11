import javax.swing.JOptionPane;
import java.text.NumberFormat;


public class Main {
    public static void main(String[] args) {
        displayWelcome();
        String location = getLocation();
        String aptNum1 = getApartmentNum();
        int sqrFeet1 = getSquareFeet(aptNum1);
        double price1 = getPrice(aptNum1);

        String aptNum2 = getApartmentNum();
        int sqrFeet2 = getSquareFeet(aptNum2);
        double price2 = getPrice(aptNum2);

        displayApartment(location, aptNum1, sqrFeet1, price1);
        displayApartment(location, aptNum2, sqrFeet2, price2);
        displayTotals(sqrFeet1, sqrFeet2, price1, price2);
    }

    public static void displayWelcome(){
        JOptionPane.showMessageDialog(null, "Tim Smith COMC2740 Ex1f1\n Property Management");

    }

    public static String getLocation(){
        String loc = JOptionPane.showInputDialog("Building Location");
        return loc;
    }

    public static String getApartmentNum(){
        String aptNum = JOptionPane.showInputDialog("Apartment # ");
        return aptNum;
    }

    public static int getSquareFeet(String aptNum){
        int sqrFeet = Integer.parseInt(JOptionPane.showInputDialog("Square Feet for Apt# " + aptNum));
        return sqrFeet;
    }

    public static double getPrice(String aptNum){
        double price = Double.parseDouble(JOptionPane.showInputDialog("Price for Apt# " + aptNum));
        return price;
    }


    public static void displayApartment(String location, String aptNum, int sqrFeet, double price){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "Location: " + location
        + "\nApartment#: " + aptNum
        + "\nSquare Feet: " + sqrFeet
        + "\nPrice: " + currency.format(price));


    }

    public static void displayTotals(int sqrFeet1, int sqrFeet2, double price1, double price2){
        JOptionPane.showMessageDialog(null, "Total square feet: " + (sqrFeet1 + sqrFeet2) + "\n Total monthly revenue: " + (price1 + price2));

    }
}
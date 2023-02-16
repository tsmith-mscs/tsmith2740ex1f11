import javax.swing.JOptionPane;

// For the first part of this exercise, explain the outputs for each of the 16 statements in the sampleOperators method.
// Then complete the program for the outlined methods.
public class Main {
    public static void main(String[] args) {

        String city = JOptionPane.showInputDialog("Enter your city:");
        String strPopulation = JOptionPane.showInputDialog("Enter your city population:");
        int population = Integer.parseInt(strPopulation);

        String strSalesTaxRate = JOptionPane.showInputDialog("Enter your city sales tax rate:");
        double salesTaxRate = Double.parseDouble(strSalesTaxRate);
        showLength(city);
        showUpperCase(city);
        showLower(city);
        showFirstChar(city);
        showPopulation(population);
        showSalesTaxRate(salesTaxRate);

        sampleOperators();
    }
    public static void showLength(String s)     {
        JOptionPane.showMessageDialog(null, "Count of characters in " + s + "': " + s.length() );
    }

    public static void showUpperCase(String s)     {
        JOptionPane.showMessageDialog(null, "Show Uppercase letter " + s + "': " + s.toUpperCase() );
    }

    public static void showLower(String s)     {
        JOptionPane.showMessageDialog(null, "Show Lowercase letter " + s + "': " + s.toLowerCase() );
    }

    public static void showFirstChar(String s)     {
        JOptionPane.showMessageDialog(null, "Show First letter " + s + "': " + s.charAt(0) );
    }

    public static void showPopulation(int population)     {
        JOptionPane.showMessageDialog(null, "Show Population " +  ": " + population);
    }

    public static void showSalesTaxRate(double salestax)     {
        JOptionPane.showMessageDialog(null, "Show Population " +  ": " + salestax);
    }


    public static void sampleOperators()
    {
        int i = 5, j = 4, k = 2;
        double d = 2.0;
        boolean t = true, f = false;
        char c = 'A', sp = 32;
        JOptionPane.showMessageDialog(null,
                "1) i / k = " + i / k + '\n' +		//converted to 2 due to being an int can not show decimal thats why its not 2.5
                        "2) i / d = " + i / d + '\n' +		// used a double labeled as 2.0 hence allowing the decimal and decimal point to be shown
                        "3) c++ = " + c++ + '\n' +		// You are using an increment to increase c by 1 there but A is the final output but B is stored
                        "4) ++c = " + ++c + '\n' +		//You are adding to B by 1 which gets  C
                        "5) c + sp = '" + c + sp + "'\n" +	// you are adding a space with + sp so you get 'C '
                        "6) (c + sp) = " + (c + sp) + '\n' +	// this changes it to a numerical representation in from ASCII so you get 99
                        "7) (c += sp) = " + (c += sp) + '\n' +	// converts 99 back to a c which = 99
                        "8) (i > j) && (j > k) = " + (((i > j) && (j > k)) ? "true" : "false") + '\n' +
                        // i is more than j 5>4, and j is more than k 4>2 so it's true
                        "9) (i < j) && (j > k) = " + (((i < j) && (j > k)) ? "true" : "false") + '\n' +
                        // i  is not less than j making the and statement immediately false
                        "10) (i < j) || (j > k) = " + (((i < j) || (j > k)) ? "true" : "false") + '\n' +
                        //statement needs either true and since j > k 4>2 therefore its true
                        "11) i + j / k = " + (i + j / k) + '\n' +	// 4/2 is 2 and then 5 + 2 is 7
                        "12) j / k + i = " + (j / k + i) + '\n' +	// same Java following PEMDAS therefore its 7
                        "13) j / (k + i) = " + (j / (k + i)) + '\n' +	// due to ints your getting 0 and not any decmial places
                        "14) f && t || t = " + ((f && t || t) ? "true" : "false") + '\n' +
                        // true due to the || t making it true
                        "15) 100001000 - 100000900 = " + (100001000 - 100000900) + '\n' +
                        // shows 100 due to subtraction no decimals however due to syntax
                        "16) 100001000f - 100000900f = " + (100001000f - 100000900f) + '\n' +
                        // syntax adds in a .0 due to f
                        "17) 1.000001f - 1.0000009f = " + (1.000001f - 1.0000009f) );
        // is 0.0 due to 1-1 and not even space to carry the decimals over so last part is .0
        //
    }

    // public static void showLength(String s) {
    //TODO
}
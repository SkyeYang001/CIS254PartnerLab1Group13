import java.util.Scanner;
/**
 * Lab 1: This is a simple program that converts USD to Euros and Chinese Yuan
 * @author Jonah Martin
 * @author Skye Yang
 */
public class Conversion {
/**
* Prints a welcome message to the user and explains what the program does
*/
public static void welcome() {    
    Scanner in = new Scanner(System.in);
    System.out.println("Choose one of the following options: ");
    System.out.println("(1) Convert from USD to Euro");
    System.out.println("(2) Convert from Euro to USD");
    System.out.println("Option: ");
   
    
    int option = in.nextInt();

    switch(option) {
        case 1:
            System.out.println("Enter amount of USD to convert: ");
            double USD = in.nextDouble();
            double Euros = convertUSDtoEuro(USD);
            System.out.println("Amount of Euros is: " + Euros);
            break;
       
        case 2:
          System.out.println("Enter amount of Euro to convert: ");
            double Euro = in.nextDouble();
            double usd = convertEurotoUSD(Euro);
            System.out.println("Amount of USD is: " + usd);
            break;
        default:
            System.out.println("invalid Option");
            break;
    }
    }

/**
 * Convers USD to Euros
 * @param amount of USD
 * @return amount of Euros
 */
public static double convertUSDtoEuro(double value){
    return (value * 17/20);
    }
public static void main(String [] args) {
    welcome(); // method call
    System.out.println("Enter the amount of USD to convert: "); 
    Scanner in = new Scanner(System.in); // instantiating a scanner object
    double USD = in.nextDouble();
    double newUSD = convertUSDtoEuro(USD);
    System.out.println("Amount of Euros is " + newUSD);

}
public static double convertEurotoUSD(double value){
    return (value / 17/20);
}
public static void method(String [] args) {
welcome(); // method call
    System.out.println("Enter the amount of Euro to convert: "); 
    Scanner in = new Scanner(System.in); // instantiating a scanner object
    double Euro = in.nextDouble();
    double newEuro = convertEurotoUSD (Euro);
    System.out.println("Amount of USD is " + newEuro);
}
}
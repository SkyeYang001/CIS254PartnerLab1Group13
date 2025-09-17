import java.util.Scanner;

/**
* Lab 1: write a brief description here
* @author Skye Yang
* @author Jonah Martin
*/
public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ChineseYuan = 7.12117;
        double BLANK = 0 ;
        int option = menu(input);
        double money = 0;
        // System.out.println(option);
        switch(option) {
            case 1:
                money = ConvertUStoCN(input, ChineseYuan);
                System.out.printf("CN ¥%.2f\n", money);
                break;
            case 2:
                money = ConvertUSto(input);
                System.out.printf("%.2f\n", money);
                break;
            case 3:
                money = ConvertCNtoUS(input, ChineseYuan);
                System.out.printf("US $%.2f\n", money);
                break;
            case 4:
                money = ConverttoUS(input);
                System.out.printf("US $%.2f\n", money);
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    /**
    * This method opens the menu for the user to choose an option
    * @param scanner input
    * @return User's inputted option
    */
    public static int menu(Scanner input) {
        // Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");    
        System.out.println("This program lets you choice which currency to convert.");
        System.out.println("Enter a value relating to the option you want to choose.");
        System.out.println("1. US Dollar -> Chinese Yuan");
        System.out.println("2. US Dollar -> ");
        System.out.println("3. Chinese Yuan -> US Dollar");
        System.out.println("4. -> US Dollar");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 1 || value > 4) {
            System.out.println("Please enter a value."); 
            value = input.nextInt();
        }
        // input.close();
        return value;
    }
    
    /**
    * This method converts US Dollars to Chinese Yuan
    * @param scanner input
    * @return Converted Chinese Yuan
    */
    public static double ConvertUStoCN(Scanner input, double ChineseYuan) {
        double value = -1;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. US Dollar -> Chinese Yuan");
        System.out.println("US Dollars:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 0) {
            System.out.println("Please enter a value."); 
            value = input.nextDouble();
        }
        input.close();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return value * ChineseYuan;
    }

    /**
    * This method converts US Dollars to 
    * @param scanner input
    * @return Converted
    */
    public static double ConvertUSto(Scanner input) {
        return 0;
    }

    /**
    * This method converts to Chinese Yuan
    * @param scanner input
    * @return Converted US Dollars
    */
    public static double ConvertCNtoUS(Scanner input, double ChineseYuan) {
        double value = -1;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("3. Chinese Yuan -> US Dollar");
        System.out.println("Chinese Yuan:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 0) {
            System.out.println("Please enter a value."); 
            value = input.nextDouble();
        }
        input.close();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return value / ChineseYuan;
    }
    
    /**
    * This method converts to
    * @param scanner input
    * @return Converted US Dollars
    */
    public static double ConverttoUS(Scanner input) {
        return 0;
    }
}


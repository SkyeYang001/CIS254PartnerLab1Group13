import java.util.Scanner;

/**
 * Lab 1: Converts Currency
 * 
 * @author Skye Yang and Jonah Martin
 * Partner Jonah Martin has finished coding yet...
 * Github Repository Here:
 * https://github.com/SkyeYang001/CIS254PartnerLab1Group13
 */
public class Conversion {

    /**
     * This is the main method (Skye Yang)
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This program lets you choice which currency to convert.");
        Scanner input = new Scanner(System.in);
        double ChineseYuan = 7.12117;
        // Other currency
        double BLANK = 0;
        int option = 0;
        while (option < 1) {
            option = menu(input);
            double money = 0;
            // System.out.println(option);
            switch (option) {
                // case 0:
                // option = menu(input);
                // break;
                case 1:
                    money = convertUStoCN(input, ChineseYuan);
                    System.out.printf("You got CN ¥%.2f\n", money);
                    System.out.println("Enter 0 to continue the program. Any other value quits the program.");
                    if ((!input.hasNextInt()) && (option != 0)) {
                        // System.out.println("Quitting program...");
                        option = 5;
                    } else {
                        option = input.nextInt();
                    }
                    break;
                case 2:
                    money = convertUSto(input, BLANK);
                    System.out.printf("You got %.2f\n", money);
                    System.out.println("Enter 0 to continue the program. Any other value quits the program.");
                    if ((!input.hasNextInt()) && (option != 0)) {
                        // System.out.println("Quitting program...");
                        option = 5;
                    } else {
                        option = input.nextInt();
                    }
                    break;
                case 3:
                    money = convertCNtoUS(input, ChineseYuan);
                    System.out.printf("You got US $%.2f\n", money);
                    System.out.println("Enter 0 to continue the program. Any other value quits the program.");
                    if ((!input.hasNextInt()) && (option != 0)) {
                        // System.out.println("Quitting program...");
                        option = 5;
                    } else {
                        option = input.nextInt();
                    }
                    break;
                case 4:
                    money = converttoUS(input, BLANK);
                    System.out.printf("You got US $%.2f\n", money);
                    System.out.println("Enter 0 to continue the program. Any other value quits the program.");
                    if ((!input.hasNextInt()) && (option != 0)) {
                        // System.out.println("Quitting program...");
                        option = 5;
                    } else {
                        option = input.nextInt();
                    }
                    break;
                case 5:
                default:
                    System.out.println("Quitting program...");
            }
        }
        input.close();
    }

    /**
     * This method opens the menu for the user to choose an option
     * 
     * @param scanner
     * @return User's inputted option
     */
    public static int menu(Scanner input) {
        int value = 0;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Enter a value relating to the option you want to choose.");
        System.out.println("1. US Dollar -> Chinese Yuan");
        System.out.println("2. US Dollar -> ");
        System.out.println("3. Chinese Yuan -> US Dollar");
        System.out.println("4. -> US Dollar");
        System.out.println("Any number quits the program.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 1) {
            System.out.println("Please enter a value.");
            if (!input.hasNextInt()) {
                String word = input.next();
                System.err.println(word + " is not a number");
                value = 0;
            } else {
                value = input.nextInt();
            }

        }
        return value;
    }

    /**
     * This method converts US Dollars to Chinese Yuan (Skye Yang)
     * 
     * @param input
     * @param ChineseYuan
     * @return Converted Chinese Yuan
     */
    public static double convertUStoCN(Scanner input, double ChineseYuan) {
        double value = -1;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. US Dollar -> Chinese Yuan");
        System.out.println("US Dollars:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 0) {
            System.out.println("Please enter a value.");
            if (!input.hasNextDouble()) {
                String word = input.next();
                System.err.println(word + " is not a number");
                value = -1;
            } else {
                value = input.nextDouble();
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return value * ChineseYuan;
    }

    /**
     * This method converts US Dollars to (Jonah Martin)
     * 
     * @param input
     * @return Converted
     */
    public static double convertUSto(Scanner input, double BLANK) {
        return 0;
    }

    /**
     * This method converts to Chinese Yuan (Skye Yang)
     * 
     * @param input
     * @param ChineseYuan
     * @return Converted US Dollars
     */
    public static double convertCNtoUS(Scanner input, double ChineseYuan) {
        double value = -1;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("3. Chinese Yuan -> US Dollar");
        System.out.println("Chinese Yuan:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (value < 0) {
            System.out.println("Please enter a value.");
            if (!input.hasNextDouble()) {
                String word = input.next();
                System.err.println(word + " is not a number");
                value = -1;
            } else {
                value = input.nextDouble();
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return value / ChineseYuan;
    }

    /**
     * This method converts to (Jonah Martin)
     * 
     * @param scanner 
     * @return Converted US Dollars
     */    public static double converttoUS(Scanner input, Double BLANK) {
        return 0;
    }
}

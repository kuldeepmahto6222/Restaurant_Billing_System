import java.util.Scanner;

public class Restaurant_Billing
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        double totalBill = 0;

        do {
            System.out.println("Welcome to the Restaurant!");
            System.out.println("Please select a category:");
            System.out.println("1. Veg");
            System.out.println("2. Non-Veg");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    totalBill += vegMenu(sc);
                    break;
                case 2:
                    totalBill += nonVegMenu(sc);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        System.out.println("Total Bill: Rs." + totalBill);
        sc.close();
    }

    public static double vegMenu(Scanner scanner) {
        System.out.println("Veg Menu:");
        System.out.println("1. Veg Burger    -  Rs. 40.00");
        System.out.println("2. Veg Pizza     -  Rs. 80.00");
        System.out.println("3. Veg Sandwich  -  Rs. 30.00");
        System.out.println("4. Back to Main Menu");
        int choice = scanner.nextInt();
        double price = 0;

        switch (choice) {
            case 1:
                price = 40;
                break;
            case 2:
                price = 80;
                break;
            case 3:
                price = 30;
                break;
            case 4:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        return price;
    }

    public static double nonVegMenu(Scanner scanner) {
        System.out.println("Non-Veg Menu:");
        System.out.println("1. Chicken Burger   - Rs. 100.00");
        System.out.println("2. Chicken Pizza    - Rs. 150.00");
        System.out.println("3. Chicken Sandwich - Rs. 80.00");
        System.out.println("4. Back to Main Menu");
        int choice = scanner.nextInt();
        double price = 0;

        switch (choice) {
            case 1:
                price = 100;
                break;
            case 2:
                price = 150;
                break;
            case 3:
                price = 80;
                break;
            case 4:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        return price;
    }
}

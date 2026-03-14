import java.util.Scanner;

public class FoodOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int itemChoice;
        int quantity;
        double price = 0;
        double total;
        String itemName = "";
        String sizeInput;
        String sizeName = "";
        char currency = '$';

        double smallPrice = 0;
        double mediumPrice = 0;
        double largePrice = 0;

        System.out.println("===== MENU =====");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. French Fries");
        System.out.println("4. Sandwich");

        System.out.print("Select item number: ");
        itemChoice = scanner.nextInt();
        scanner.nextLine();

        switch (itemChoice) {

            case 1:
                itemName = "Pizza";
                smallPrice = 5;
                mediumPrice = 8;
                largePrice = 12;
                break;

            case 2:
                itemName = "Burger";
                smallPrice = 4;
                mediumPrice = 6;
                largePrice = 9;
                break;

            case 3:
                itemName = "French Fries";
                smallPrice = 3;
                mediumPrice = 5;
                largePrice = 7;
                break;

            case 4:
                itemName = "Sandwich";
                smallPrice = 4;
                mediumPrice = 6;
                largePrice = 8;
                break;

            default:
                System.out.println("Invalid item.");
                scanner.close();
                return;
        }

        System.out.println("\nSizes Available:");
        System.out.println("1. Small  - $" + smallPrice);
        System.out.println("2. Medium - $" + mediumPrice);
        System.out.println("3. Large  - $" + largePrice);

        System.out.print("\nSelect size (1 / small / price etc): ");
        sizeInput = scanner.nextLine().toLowerCase();

        if (sizeInput.equals("1") || sizeInput.equals("small") || sizeInput.equals(String.valueOf((int) smallPrice))
                || sizeInput.equals(smallPrice + "$")) {
            sizeName = "Small";
            price = smallPrice;
        } else if (sizeInput.equals("2") || sizeInput.equals("medium")
                || sizeInput.equals(String.valueOf((int) mediumPrice)) || sizeInput.equals(mediumPrice + "$")) {
            sizeName = "Medium";
            price = mediumPrice;
        } else if (sizeInput.equals("3") || sizeInput.equals("large")
                || sizeInput.equals(String.valueOf((int) largePrice)) || sizeInput.equals(largePrice + "$")) {
            sizeName = "Large";
            price = largePrice;
        } else {
            System.out.println("Invalid size.");
            scanner.close();
            return;
        }

        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou ordered " + quantity + " " + sizeName + " " + itemName);
        System.out.println("Total Bill: " + currency + total);
        System.out.println("Thank you!");

        scanner.close();
    }
}
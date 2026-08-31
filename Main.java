// Name: Musa Rivisi
// Student Number: 26054227
// COM1321 Assignment 1


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("****************************************");
        System.out.print("Enter (1) to launch menu or any other key to exit ");
        String startChoice = scanner.nextLine();

        if (startChoice.equals("1")) {
            boolean running = true;

            while (running) {
                products.DisplayMenu();
                System.out.print("Please select an option >> ");
                String menuChoice = scanner.nextLine();

                if (menuChoice.equals("1")) {
                    products.CaptureProduct();
                } else if (menuChoice.equals("2")) {
                    products.SearchProduct();
                } else if (menuChoice.equals("3")) {
                    products.UpdateProduct();
                } else if (menuChoice.equals("4")) {
                    products.DeleteProduct();
                } else if (menuChoice.equals("5")) {
                    products.PrintReport();
                } else if (menuChoice.equals("6")) {
                    products.ExitApplication();
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Goodbye!");
        }
    }
}
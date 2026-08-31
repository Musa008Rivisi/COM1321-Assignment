import java.util.Scanner;

import java.util.ArrayList;


public class Products {
    private ArrayList<Product> productList;

    public Products() {
        productList = new ArrayList<Product>();
    }
    
    public void DisplayMenu() {
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new product.");
        System.out.println("(2) Search for a product.");
        System.out.println("(3) Update a product.");
        System.out.println("(4) Delete a product.");
        System.out.println("(5) Print report.");
        System.out.println("(6) Exit Application.");
    }
        public void CaptureProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CAPTURE A NEW PRODUCT");
        System.out.println("***************************");

        System.out.print("Enter the product code: ");
        String productCode = scanner.nextLine();

        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();
    }
}

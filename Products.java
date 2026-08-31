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
    }    public void CaptureProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CAPTURE A NEW PRODUCT");
        System.out.println("***************************");

        System.out.print("Enter the product code: ");
        String productCode = scanner.nextLine();

        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.println("Select the product category:");
        System.out.println("Desktop Computer - 1");
        System.out.println("Laptop - 2");
        System.out.println("Tablet - 3");
        System.out.println("Printer - 4");
        System.out.println("Gaming Console - 5");

        String category = "";
        boolean validCategory = false;

        while (!validCategory) {
            System.out.print("Product Category >> ");
            String categoryChoice = scanner.nextLine();

            if (categoryChoice.equals("1")) {
                category = "Desktop Computer";
                validCategory = true;
            } else if (categoryChoice.equals("2")) {
                category = "Laptop";
                validCategory = true;
            } else if (categoryChoice.equals("3")) {
                category = "Tablet";
                validCategory = true;
            } else if (categoryChoice.equals("4")) {
                category = "Printer";
                validCategory = true;
            } else if (categoryChoice.equals("5")) {
                category = "Gaming Console";
                validCategory = true;
            } else {
                System.out.println("Invalid category. Please enter a valid product category.");
            }
        }

        System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years. ");
        String warrantyChoice = scanner.nextLine();
        String warranty;

                if (warrantyChoice.equals("1")) {
            warranty = "6 months";
        } else {
            warranty = "2 years";
        }

        System.out.print("Enter the price for " + productName + " >> ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the stock level for " + productName + " >> ");
        int stockLevel = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the supplier for " + productName + " >> ");
        String supplier = scanner.nextLine();

        Product newProduct = new Product(productCode, productName, category, warranty, price, stockLevel, supplier);
        SaveProduct(newProduct);
    }
    
    public void SaveProduct(Product newProduct) {
        productList.add(newProduct);
        System.out.println("Product details has been saved successfully");
    }
    
    public void SearchProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the product code to search: ");
        String searchCode = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);

            if (currentProduct.getProductCode().equals(searchCode)) {
                found = true;
                System.out.println("*********************************************************************");
                System.out.println("PRODUCT SEARCH RESULTS");
                System.out.println("*********************************************************************");
                System.out.println("PRODUCT CODE:          " + currentProduct.getProductCode());
                System.out.println("PRODUCT NAME:          " + currentProduct.getProductName());
                System.out.println("PRODUCT WARRANTY:      " + currentProduct.getWarranty());
                System.out.println("PRODUCT CATEGORY:      " + currentProduct.getCategory());
                System.out.println("PRODUCT PRICE:         R " + currentProduct.getPrice());
                System.out.println("PRODUCT STOCK LEVELS:  " + currentProduct.getStockLevel());
                System.out.println("PRODUCT SUPPLIER:      " + currentProduct.getSupplier());
                System.out.println("*********************************************************************");
            }
        }

        if (!found) {
            System.out.println("The product cannot be located. Invalid Product");
        }
    }
    
    public void DeleteProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the product code to delete: ");
        String deleteCode = scanner.nextLine();

        Product foundProduct = null;

        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);

            if (currentProduct.getProductCode().equals(deleteCode)) {
                foundProduct = currentProduct;
            }
        }

        if (foundProduct == null) {
            System.out.println("The product cannot be located. Invalid Product");
        } else {
            System.out.print("Are you sure you want to delete this product? (y) Yes, (n) No ");
            String confirm = scanner.nextLine();

            if (confirm.equals("y")) {
                productList.remove(foundProduct);
                System.out.println("Product has been deleted successfully!!!");
            } else {
                System.out.println("Delete cancelled.");
            }
        }
        
   
    }
    
    public void UpdateProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the product code to update: ");
        String updateCode = scanner.nextLine();

        Product foundProduct = null;

        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);

            if (currentProduct.getProductCode().equals(updateCode)) {
                foundProduct = currentProduct;
            }
        }

        if (foundProduct == null) {
            System.out.println("The product cannot be located. Invalid Product");
        } else {
            System.out.print("Update the warranty? (y) Yes, (n) No ");
            String updateWarranty = scanner.nextLine();

            if (updateWarranty.equals("y")) {
                System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years. ");
                String warrantyChoice = scanner.nextLine();

                if (warrantyChoice.equals("1")) {
                    foundProduct.setWarranty("6 months");
                } else {
                    foundProduct.setWarranty("2 years");
                }
            }

            System.out.print("Update the product price? (y) Yes, (n) No ");
            String updatePrice = scanner.nextLine();

            if (updatePrice.equals("y")) {
                System.out.print("Enter the new price for " + foundProduct.getProductName() + " >> ");
                double newPrice = Double.parseDouble(scanner.nextLine());
                foundProduct.setPrice(newPrice);
            }

            System.out.print("Update the stock level? (y) Yes, (n) No ");
            String updateStock = scanner.nextLine();

            if (updateStock.equals("y")) {
                System.out.print("Enter the new stock level for " + foundProduct.getProductName() + " >> ");
                int newStock = Integer.parseInt(scanner.nextLine());
                foundProduct.setStockLevel(newStock);
            }

            System.out.println("Product details has been updated successfully!!!");
        }
    }
    
    public void ExitApplication() {
        System.out.println("Thank you for using the Bright Future Technologies Application. Goodbye!");
        System.exit(0);
    }
      public void PrintReport() {
        System.out.println("PRODUCT REPORT");
        System.out.println("========================================================================");

        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);

            ReportData report = new ReportData(
                currentProduct.getProductCode(),
                currentProduct.getProductName(),
                currentProduct.getCategory(),
                currentProduct.getWarranty(),
                currentProduct.getPrice(),
                currentProduct.getStockLevel(),
                currentProduct.getSupplier()
            );

            System.out.println("PRODUCT " + (i + 1));
            System.out.println("------------------------------------------------------------------------");
            System.out.println("PRODUCT CODE >>        " + report.getProductCode());
            System.out.println("PRODUCT NAME >>        " + report.getProductName());
            System.out.println("PRODUCT CATEGORY >>    " + report.getCategory());
            System.out.println("PRODUCT WARRANTY >>    " + report.getWarranty());
            System.out.println("PRODUCT PRICE >>       " + report.getPrice());
            System.out.println("PRODUCT LEVEL >>       " + report.getStockLevel());
            System.out.println("PRODUCT SUPPLIER >>    " + report.getSupplier());
            System.out.println("------------------------------------------------------------------------");
        }

        double totalValue = 0;

        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);
            totalValue = totalValue + currentProduct.getPrice();
        }

        double averageValue = totalValue / productList.size();

        System.out.println("========================================================================");
        System.out.println("TOTAL PRODUCT COUNT: " + productList.size());
        System.out.println("TOTAL PRODUCT VALUE: R " + totalValue);
        System.out.println("AVERAGE PRODUCT VALUE: R " + averageValue);
        System.out.println("========================================================================");
    }
}

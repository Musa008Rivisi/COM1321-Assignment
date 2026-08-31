// Name: Musa Rivisi
// Student Number: 26054227
// COM1321 Assignment 1



public class Product {
       private String productCode;
    private String productName;
    private String category;
    private String warranty;
    private double price;
    private int stockLevel;
    private String supplier; 
    
    public Product(String productCode, String productName, String category, String warranty, double price, int stockLevel, String supplier) {
        this.productCode = productCode;
        this.productName = productName;
        this.category = category;
        this.warranty = warranty;
        this.price = price;
        this.stockLevel = stockLevel;
        this.supplier = supplier;
    }
    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getWarranty() {
        return warranty;
    }

    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public String getSupplier() {
        return supplier;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}


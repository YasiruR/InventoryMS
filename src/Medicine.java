public class Medicine {
    
    private int productID;
    private String name;
    private double unitPrice;
    private int amount;
    private String expDate;

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    
}

public class Invoice implements ItemPayable {
    String itemNumber;
    String itemDescription;
    double pricePerItem;
    int quantity;
    double paymentdue;
    Invoice(String itemNumber,String itemDescription,int quantity,double pricePerItem){
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.paymentdue = getItemPaymentAmount(pricePerItem, quantity);
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public String getItemNumber() {
        return itemNumber;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    @Override
    public String toString() {
        return String.format("invoice: \nprice per item: $%.2f\nItem number: %s(%s)\nquantity: %s\npayment due: $%.2f", pricePerItem,itemNumber,itemDescription,quantity,paymentdue);
    }
    @Override
    public double getItemPaymentAmount(double x,int y) {
        return x*y;
    }
}

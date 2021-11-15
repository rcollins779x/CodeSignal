package _1322.Labs.Lab2;

class StockItem {
    private String name;
    private String description;
    private int variableQuantity;
    private int variableID;
    private double variablePrice;

    StockItem()
    {   //Default Constructor
        name = null;
        description = null;
        variableQuantity = 0;
        variableID = -1;
        variablePrice = 0.0;
    }

    StockItem(String description, double variablePrice, int variableQuantity)
    {   //Overloaded Constructor (description, price, quantity)
        this.description = description;
        this.variablePrice = variablePrice < 0 ? 0 : variablePrice;
        this.variableQuantity = variableQuantity < 0 ? 0 : variableQuantity;
    }

    //Getters
    int getID() {
        return variableID;
    }
    String getName() {
        return name;
    }
    int getQuantity() {
        return variableQuantity;
    }
    double getPrice() {
        return variablePrice;
    }
    String getDescription() {
        return description;
    }

    //Setters
    void setID(int variableID) {
        this.variableID = variableID;
    }
    void setName(String name) {
        this.name = name;
    }
    void setQuantity(int variableQuantity) {
        this.variableQuantity = variableQuantity < 0 ? 0 : variableQuantity;
    }
    void setPrice(double variablePrice) {
        this.variablePrice = variablePrice;
    }
    void setDescription(String description) {
        this.description = description;
    }

    //Change Quantity
    void addQuantity(int change) {
        setQuantity(getQuantity() + change);
    }
    void removeQuantity(int change) {
        setQuantity(Math.max(getQuantity() - change, 0));
    }

    @Override
    public String toString()
    {   //toString override
        return  "Item ID :\t\t" + variableID + "\n" +
                "Item Name :\t\t" + name + "\n" +
                "Available Qty :\t" + variableQuantity + "\n" +
                "Item Price :\t$" + String.format("%.2f",variablePrice) + "\n" +
                "Description :\t" + description + "\n";
    }
}

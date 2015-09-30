
//Creates individual nodes to populate linked lists
//Nothing but constructors with getters+Setters
public class FoodItemNode{
    private String Name, Price, Description, Size, specialOrder;
    private int Quantity;
    private FoodItemNode nextNode = null;
    private FoodItemNode prevNode = null;
    FoodItemNode(){
        Name = null;
        Price = "N\\A";
        Size = "N\\A";
        specialOrder = "No";
        Quantity = 0;
    }

    public FoodItemNode(String name, String price, String description, String size, String specialOrder, int quantity, FoodItemNode nextNode, FoodItemNode prevNode) {
        Name = name;
        Price = price;
        Description = description;
        Size = size;
        this.specialOrder = specialOrder;
        Quantity = quantity;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getSpecialOrder() {
        return specialOrder;
    }

    public void setSpecialOrder(String specialOrder) {
        this.specialOrder = specialOrder;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public FoodItemNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(FoodItemNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(FoodItemNode nextNode) {
        this.prevNode = prevNode;
    }
}

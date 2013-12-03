package partymanager;

public class Supplies {

    private String item;
    private int amount;
    private String whatsItFor;
    // party favor, food, decorations, cany, etc.
    private String itemType;
    
    //constructor

    /**
     *
     * @param item
     * @param itemType
     * @param amount
     * @param whatsItFor
     */
    public Supplies(String item,String itemType, int amount, String whatsItFor)
    {
        this.item = item;
        this.itemType = itemType;
        this.amount = amount;
        this.whatsItFor = whatsItFor;
    }
    
    public void setItem(String myItem) {
        item = myItem;
    }

    public String getItem() {
        return item;
    }

    public void setAmount(int myAmount) {
        amount = myAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setWhatsItFor(String myPurpose) {
        whatsItFor = myPurpose;
    }

    public String getWhatsItFor() {
        return whatsItFor;
    }

    public void setItemType(String myType) {
        itemType = myType;
    }

    public String getItemType() {
        return itemType;
    }
}

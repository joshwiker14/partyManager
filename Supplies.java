package partymanager;

/**
 *
 * @author josh
 */
public class Supplies {

    private String item;
    private int amount;
    private String whatsItFor;
    // party favor, food, decorations, candy, etc.
    private String itemType;
    
    //constructors
    public Supplies(){}
    
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
    
    /**
     *
     * @param myItem
     */
    public void setItem(String myItem) {
        item = myItem;
    }

    /**
     *
     * @return
     */
    public String getItem() {
        return item;
    }

    /**
     *
     * @param myAmount
     */
    public void setAmount(int myAmount) {
        amount = myAmount;
    }

    /**
     *
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     *
     * @param myPurpose
     */
    public void setWhatsItFor(String myPurpose) {
        whatsItFor = myPurpose;
    }

    /**
     *
     * @return
     */
    public String getWhatsItFor() {
        return whatsItFor;
    }

    /**
     *
     * @param myType
     */
    public void setItemType(String myType) {
        itemType = myType;
    }

    /**
     *
     * @return
     */
    public String getItemType() {
        return itemType;
    }
}

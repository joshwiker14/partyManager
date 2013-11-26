public class Supplies
{
   private String Item;
   private int Amount;
   private String whatsItFor;
   // party favor, food, decorations, cany, etc.
   private String ItemType;
   //constructor
   
   public void setItem(String myItem)
   {
      Item = myItem;
   }
   
   public String getItem()
   {
      return Item;
   }
   
   public void setAmount(int myAmount)
   {
      Amount = myAmount;
   }
   
   public int getAmount()
   {
      return Amount;
   }
   
   public void setWhatsItFor(String myPurpose)
   {
      whatsItFor = myPurpose;
   }
   
   public String getWhatsItFor()
   {
      return whatsItFor;
   }
   
   public void setItemType(String myType)
   {
      ItemType = myType;
   }
   
   public String getItemType()
   {
      return ItemType;
   }
}

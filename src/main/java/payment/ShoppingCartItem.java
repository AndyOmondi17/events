package payment;

import java.net.URL;

public class ShoppingCartItem implements Cloneable
{
    public String itemName;
    public int itemCost;
    public int quantity;
    public URL descriptionURL;

    public ShoppingCartItem()
    {
    }

    public ShoppingCartItem(
                            int quantity, URL descriptionURL)
    {
        this.quantity = quantity;
        this.descriptionURL = descriptionURL;
    }

// The add method is a quick method for combining two similar
// items. It doesn't perform any checks to insure that they are
// similar, however. You use this method when adding items to a
// cart, rather than storing two instances of the same item, you
// add the quantities together.

    public void add(ShoppingCartItem otherItem)
    {
        this.quantity = this.quantity + otherItem.quantity;
    }

// The subtract method is similar to the add method, but it
// removes a certain quantity of items.

    public void subtract(ShoppingCartItem otherItem)
    {
        this.quantity = this.quantity - otherItem.quantity;
    }

// Create a copy of this object

    public ShoppingCartItem copy()
    {
        return new ShoppingCartItem(
                quantity, descriptionURL);
    }

// Create a printable version of this object

    public String toString()
    {
        return " cost: "+itemCost+" qty: "+quantity+" desc: "+
                descriptionURL;
    }
}

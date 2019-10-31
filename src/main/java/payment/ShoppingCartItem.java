package payment;

import java.net.URL;

public class ShoppingCartItem implements Cloneable
{

    public int quantity;
    public URL descriptionURL;
    public int total;

    public ShoppingCartItem(int quantity, URL descriptionURL)
    {
        this.quantity = quantity;
        this.descriptionURL = descriptionURL;
    }

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

// The equals method does something a little dirty here, it only
// compares the item names and item costs. Technically, this is
// not the way that equals was intended to work.

    public boolean equals(Object other)
    {
        if (this == other) return true;

        if (!(other instanceof ShoppingCartItem))
            return false;

        ShoppingCartItem otherItem =
                (ShoppingCartItem) other;
    }

// Create a copy of this object

    public ShoppingCartItem copy()
    {
        return new ShoppingCartItem(quantity, descriptionURL);
    }

// Create a printable version of this object

    public String toString()
    {
        return " qty: "+quantity+" total: "+ total;
    }
}

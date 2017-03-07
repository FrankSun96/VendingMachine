/**
   A product in a vending machine.
*/
public class Product
{  
   private String description;
   private double price;

   /**
      Constructs a Product object
      @param aDescription the description of the product
      @param aPrice the price of the product
   */
   public Product(String aDescription, double aPrice)
   {  
      description = aDescription;
      price = aPrice;
   }
   
   /**
      Gets the description.
      @return the description
   */
   public String getDescription()
   { 
      return description;
   }
   
   /**
      Gets the price.
      @return the price
   */
   public double getPrice()
   {  
      return price;
   }

   /**
      Determines of this product is the same as the other product.
      @param other the other product
      @return true if the products are equal, false otherwise
   */
   public boolean equals(Object other)
   { 
      if(other instanceof Product){
    	  if((((Product) other).getDescription() ==  this.description) && (((Product) other).getPrice() ==  this.price)){
    		  return true;
    	  }else{
    		  return false;
    	  }
      }else{
    	  return false;
      }
   }
   
   /**
      Formats the product's description and price.
   */
   public String toString()
   { 
      return description + " @ $" + price;
   }
}

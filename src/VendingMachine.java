import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }
   
   /**
      Gets the type of products in the vending machine.
      @return an array of products sold in this machine.
   */
   public Product[] getProductTypes()
   { 
	   Set<Product> set = new HashSet();
	   for(Product item : products){
		   set.add(item);
	   }
	   Product[] shows = new Product[set.size()];
	   Iterator iter = set.iterator();
	   for(int i = 0; i < set.size(); i++){
		   shows[i] = (Product) iter.next();
	   }
	   return shows;
   }

   /**
      Adds the coin to the vending machine.
      @param c the coin to add
   */
   public void addCoin(Coin c)
   { 
      currentCoins.addCoin(c);
   }

   /**
      Buys a product from the vending machine.
      @param p the product to buy
   */
   public void buyProduct(Product p)
   { 
	   if(currentCoins.getValue() == p.getPrice()){
		   coins.addCoins(currentCoins);
		   currentCoins.removeAllCoins();
		   products.remove(p);
	   }else{
		   double more = 0;
		   more = p.getPrice() - currentCoins.getValue();
		   throw new VendingException("Please input another $" + more);
	   }
   }

   /**
      Adds a product to the vending machine.
      @param p the product to add
      @param quantity the quantity
   */
   public void addProduct(Product p, int quantity)
   {
      for(int i = 0; i < quantity; i++){
    	  products.add(p);
      }
      
   }
   
   /**
      Removes the money from the vending machine.
      @return the amount of money removed
   */
   public double removeMoney()
   {  
      double money = coins.getValue();
      coins.removeAllCoins();
      return money;
   }
}

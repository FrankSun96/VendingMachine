import java.util.ArrayList;

/**
   A set of coins.
*/
public class CoinSet
{  
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet()
   {  
      set = new ArrayList<Coin>();
   }

   /**
      Adds a coin.
      @param c the coin to add
   */
   public void addCoin(Coin c)
   {  
      set.add(c);
   }

   /**
      Adds a set of coins.
      @param other the set of coins
   */
   public void addCoins(CoinSet other)
   {  
      set.addAll(other.set);
   }

   /**
      Gets the value of all the coins.
      @return total the total value of all the coins
   */
   public double getValue()
   {  
      double total = 0;
      for(int i = 0; i < set.size(); i++){
    	  total += set.get(i).getValue();
      }
      return total;
   }
   
   /**
      Removes all the coins.
   */
   public void removeAllCoins()
   { 
      set.clear();
   }
}
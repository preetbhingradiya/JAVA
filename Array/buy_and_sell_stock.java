
public class buy_and_sell_stock {

    public static int buyAndSellStock(int[] price){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<price.length;i++){
            // sellprice=price[i]
            if(buyPrice<price[i]){  //profite
                int profite = price[i]-buyPrice;  //Today's profite
                maxProfit=Math.max(maxProfit, profite);  //All over max profite
            }else{
                buyPrice=price[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args){
        int[] price={7,1,5,3,6,4};

        System.out.print("Maximum Profite is :- " + buyAndSellStock(price));
    }    
}



/*profite = sellPrice-Buyprice
for(){
    if(buyprice<sellprice){

    }
    else{
        not profite it can losee to buy the stock is bset option
        buyprice=sellprice
    }
} 
//minimum buyPrice is 1
day 1          day 2                  day 3
buy = 7        buy = 1                 buy = 1
               sel = 7                 sel = 5             
               profite = -6 (lose)     profite = 5-1 = 4
*/
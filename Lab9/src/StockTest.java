/*
 * Update your documentation here
 */
import java.util.Scanner;
 

public class StockTest{
    public static void main(String[] args){
        /*         
        Make sureto complete the Stock class before you do the following items.
        */
        
        /* Step 1:
         * Instantiate two Stock objects with arguments of your choice(stock symbol and name).
         * Using two set methods set the previousClosingPrice and curentPrice of two Stocks.
         * Display the percentage changed from previousClosingPrice to curentPrice of both stocks.
         */
		
		//* Instantiate two Stock objects with arguments of your choice(stock symbol and name).
		Stock o1;
		o1 = new Stock("TCN","TylerCameronNelson");
		
		// * Using two set methods set the previousClosingPrice and curentPrice of two Stocks.
		o1.setPreviousClosingPrice(10000.00);
        o1.setCurrentPrice(1.00);
		
		//* Display the percentage changed from previousClosingPrice to curentPrice of both stocks.
		System.out.println(o1.getSymbol() + ": " + o1.getChangePercent());
		
		
		//* Instantiate two Stock objects with arguments of your choice(stock symbol and name).
		Stock o2;
		o2 = new Stock("AAPL","Apple");
		
		// * Using two set methods set the previousClosingPrice and curentPrice of two Stocks.
		o2.setPreviousClosingPrice(207.48);
        o2.setCurrentPrice(201.59);
		
		//* Display the percentage changed from previousClosingPrice to curentPrice of both stocks.
		System.out.println(o2.getSymbol() + ": " + o2.getChangePercent());
		
        /*
         * Step 2: Declare an array of 5 Stock objects. (Next three steps should be done in a loop)
         * Ask the user to input stock symbol, name, previousClosingPrice and curentPrice.
         * Initialize an array element with new Stock object using symbol and name that user input.
         * Using two set methods set the previousClosingPrice and curentPrice of each Stock element
         */
		
		//* Step 2: Declare an array of 5 Stock objects. (Next three steps should be done in a loop)
		Stock[] stocks;
		stocks = new Stock[5];
		
		for(int i = 0; i < stocks.length; i++)
		{
			Scanner in;
			in = new Scanner(System.in);
			String s;
			String n;
			double p;
			double c;
			//* Ask the user to input stock symbol, name, previousClosingPrice and curentPrice.
			System.out.println("Enter your stock symbol, name, previousClosingPrice, currentPrice (ex: TCN TylerCameronNelson 100.00 100.01)");
			s = in.next();
			n = in.next();
			p = in.nextDouble();
			c = in.nextDouble();
			
			//* Initialize an array element with new Stock object using symbol and name that user input.
			Stock o;
			o = new Stock(s,n);
			
			//* Using two set methods set the previousClosingPrice and curentPrice of each Stock element
			o.setPreviousClosingPrice(p);
			o.setCurrentPrice(c);
			
			stocks[i] = o;
		}
          
        /*
         * Step 4:  (this step should be done in a loop)
         * Display the percentage changed from previousClosingPrice to curentPrice of all stocks with their symbol.
         */
        
		for(int i = 0; i < stocks.length; i++)
		{
			System.out.println(stocks[i].getSymbol() + ": " + stocks[i].getChangePercent() + "%");
		}
	}
    
}
/*
 * copy and paste your screen outputs here
 */

/*
run:
TCN: -99.99
AAPL: -2.8388278388278327
Enter your stock symbol, name, previousClosingPrice, currentPrice (ex: TCN TylerCameronNelson 100.00 100.01)
APPL Apple 208.49 204.47
Enter your stock symbol, name, previousClosingPrice, currentPrice (ex: TCN TylerCameronNelson 100.00 100.01)
RHT RedHat 173.64 173.75
Enter your stock symbol, name, previousClosingPrice, currentPrice (ex: TCN TylerCameronNelson 100.00 100.01)
YELP Yelp 43.50 31.93
Enter your stock symbol, name, previousClosingPrice, currentPrice (ex: TCN TylerCameronNelson 100.00 100.01)
MSFT Microsoft 111.75 109.57
Enter your stock symbol, name, previousClosingPrice, currentPrice (ex: TCN TylerCameronNelson 100.00 100.01)
ORCL Oracle 50.43 50.61
APPL: -1.92815003117656%
RHT: 0.0633494586500885%
YELP: -26.59770114942529%
MSFT: -1.9507829977628697%
ORCL: 0.3569303985722778%
BUILD SUCCESSFUL (total time: 3 minutes 27 seconds)
*/
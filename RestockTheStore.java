package DeliverableOne;

import java.util.Scanner;

public class RestockTheStore {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the restocking tool.\n");
		
		
		Scanner scnr = new Scanner(System.in);
		
		 int stockSoda = 100;
	 	 int restockSoda = 40;
	 	 
	     int stockChips = 40;
	     int restockChips = 20;
	     
	     int stockCandy = 60;
	     int restockCandy = 40;
		
		//soda
		 System.out.println("How many Sodas have been sold today?" + stockSoda + " are in stock ");
	     int sodaSold = scnr.nextInt();
		
	     int leftQtySoda = stockSoda - sodaSold;
		 
	     if (sodaSold > stockSoda) {
	    	 System.out.println("That value is too high. Stock not adjusted\n" ); 
		 } else {		    	
		    	 System.out.println("There are " + leftQtySoda + " Sodas Left\n");
		 }
	     
	     
		// chips
	     System.out.println("How many Chips have been sold today?" + stockChips + " are in stock ");
	     int chipsSold = scnr.nextInt();
	     
	     int leftQtyChips = stockChips - chipsSold;
	     
	     if (chipsSold > stockChips) {
	    	 System.out.println("That value is too high. Stock not adjusted\n" );
	     } else {
	    	 System.out.println("There are " + leftQtyChips + " Chips Left\n");
	     }
	     
	     
	    // Candy
	     System.out.println("How many Candy have been sold today?" + stockCandy + " are in stock "); 
	     int candySold = scnr.nextInt();
	     
	     int leftQtyCandy = stockCandy - candySold;
	     
	     if (candySold > stockCandy) {
	    	 System.out.println("That value is too high. Stock not adjusted\n\n" );
	     } else {
	    	 System.out.println("There are " + leftQtyCandy + " Candy Left\n\n");  
	     }
	     
	     
	     System.out.println("Thank you for filling out the values." ); 
	     
	     
	     if ((leftQtySoda < restockSoda && leftQtySoda > 0) || 
	    		 (leftQtyChips < restockChips && leftQtyChips > 0) ||
	    		 (leftQtyCandy < restockCandy && leftQtyCandy > 0)) {
	    	 
	    	 System.out.println("Here’s what needs to be restocked.\n" ); 
	     }
	     
	     if ( leftQtySoda < restockSoda && leftQtySoda > 0) {
	    	 System.out.println("Soda needs to be restocked\n");
	     }
		 if (leftQtyChips < restockChips && leftQtyChips > 0) {
			 System.out.println("Chips needs to be restocked\n");
		 }
		 if (leftQtyCandy < restockCandy && leftQtyCandy > 0) {
			 System.out.println("Candy needs to be restocked\n");
		 }
	
		 
    	 System.out.println("Goodbye!");
    	 scnr.close();
	}
}




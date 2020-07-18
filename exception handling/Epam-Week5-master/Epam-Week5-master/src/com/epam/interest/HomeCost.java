package com.epam.interest;
import java.util.*;
import java.util.logging.Logger;

public class HomeCost {

	public static void main(String[] args) {
		HomeCost h=new HomeCost();
    }

	HomeCost() {
		Logger l=Logger.getLogger(HomeCost.class.getName());
		l.info("Cost of constructing a building are as follows:");
		l.info("1:1200 rupees using Standard Materials.");
		l.info("2:1500 rupees using above Standard Materials.");
		l.info("3:1800 rupees using high Standard Materials.");
		l.info("4:2500 rupeesusing high Standard Materials with Full Automation");
		l.info("Enter  your choice to get an estimated cost:");	
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		l.info("Enter the area of the house");
		double area=s.nextDouble();
		
		switch(choice) {
		case 1:this.choice1(area);
		break;
		
		case 2:this.choice2(area);
		break;
		
		case 3:this.choice3(area);
		break;
		
		case 4:this.choice4(area);
		break;
		
		default:l.info("Invalid Choice");;
		break;
		
		}
		
	}
	
 private void choice1(double area){
	 Logger l=Logger.getLogger(HomeCost.class.getName());
		double price=1200*area;
		l.info(String.valueOf(price));
	}
private void choice2(double area){
	Logger l=Logger.getLogger(HomeCost.class.getName());
		double price=1500*area;
		l.info(String.valueOf(price));
	}
private void choice3(double area){
	Logger l=Logger.getLogger(HomeCost.class.getName());
		double price=1800*area;
		l.info(String.valueOf(price));
	}
private void choice4(double area){
	Logger l=Logger.getLogger(HomeCost.class.getName());
		double price=2500*area;
		l.info(String.valueOf(price));
	}

}

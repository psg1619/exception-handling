package com.epam.interest;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalculateInterest {
	long principal;
	int time;
	double rate;

	public static void main(String args[]){
		Logger l=Logger.getLogger(CalculateInterest.class.getName());
		l.info("Hello There!");
		Scanner inp=new Scanner(System.in);
		l.info("Enter the Principal Amount Taken");
		long principal=inp.nextLong();
		l.info("Enter the time span for which Money has been borrowed");
		int time=inp.nextInt();
		l.info("Enter the rate of interest");
		double rate=inp.nextDouble();
		l.info("Enter 1 for simple interest and 2 for compound interest!");
		int choice=inp.nextInt();
		CalculateInterest ci=new CalculateInterest();
		ci.principal=principal;
		ci.time=time;
		ci.rate=rate;
		switch(choice) {
		case 1:ci.simpleInterest();
		break;
		case 2:ci.compoundInterest();
		break;
		default:
			l.info("Invalid Choice");
			break;
		}
	}
	
	
	private void simpleInterest() {
		double i=this.principal*this.time*this.rate/100;
		Logger l=Logger.getLogger(CalculateInterest.class.getName());
		l.info("Interest:"+i);
		l.info("Total Amount Payable:"+(i+this.principal));
	}
	
	private void compoundInterest() {
		double amount=this.principal;
		Logger l=Logger.getLogger(CalculateInterest.class.getName());
		double interest;
		for(int i=0;i<this.time;i++) {
			interest=amount*this.rate/100;
			amount=amount+interest;
		}
		l.info(("Interest:"+(amount-this.principal)));
		l.info("Total Amount Payable:"+amount);
		
	}
}

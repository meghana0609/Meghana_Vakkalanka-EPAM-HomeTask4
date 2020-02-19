package Epam.HomeTask4.Hometask4;
import java.util.Scanner;
import java.io.*;
public class BackgroundCode {
	BackgroundCode() {
        Scanner sc = new Scanner(System.in);
        PrintStream PrintObject = new PrintStream(new FileOutputStream(FileDescriptor.out));
        PrintObject.println("Enter the principal amount: ");
        double principal_amount = sc.nextDouble();
        PrintObject.println("Enter the interest rate : ");
        double interest_rate = sc.nextDouble();
        PrintObject.println("Enter the time period(In years): ");
        double years = sc.nextDouble();
        PrintObject.println("The simple interest for the principal amount "+principal_amount+" for interest rate "+interest_rate+" over "+years+" years of time is: "+simpleInterest(principal_amount,interest_rate,years));
        PrintObject.println("The compound interest for the principal amount "+principal_amount+" for interest rate "+interest_rate+" over "+years+" years of time is: "+compoundInterest(principal_amount,interest_rate,years));
    }

    double simpleInterest(double principal_amount, double interest_rate, double years) {
        return (principal_amount*interest_rate*years)/100;
    }
    double compoundInterest(double principal_amount, double interest_rate, double years) {
    	return principal_amount*(Math.pow((1+(interest_rate/100)),(years)))-principal_amount;
    }
}

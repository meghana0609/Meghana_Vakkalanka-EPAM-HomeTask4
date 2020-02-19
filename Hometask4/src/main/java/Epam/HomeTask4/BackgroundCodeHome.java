package Epam.HomeTask4.Hometask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class BackgroundCodeHome {
	BackgroundCodeHome()
	{
		Scanner sc = new Scanner(System.in);
		PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
		out.println("Enter the length & breadth of the home(per square feet) : ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		out.println("1. Rs.1200 INR Standard Materials");
		out.println("2. Rs.1500 INR Above Standard Materials");
		out.println("3. Rs.1800 INR High Standard Material");
		out.println("4. Rs.2500 INR High Standard Material and Fully Automated Home");
		out.println("Enter your choice : ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:out.println("Cost of construction : "+(1200*length*breadth) );
				break;
		case 2:	out.println("Cost of construction : "+(1500*length*breadth) );
				break;
		case 3:out.println("Cost of construction : "+(1800*length*breadth) );
				break;
		case 4:out.println("Cost of construction : "+(2500*length*breadth) );
				break;
		default :out.println("Enter a choice among the above four choices!!");		
		}
	}
}

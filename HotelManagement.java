package projfile;

import java.util.Scanner;

public class HotelManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring the values
		int qnt,amt,bill=0,t;
		
		//Using do while loop to take multiple orders
		do {
		System.out.println("Your Menu List : ");
		System.out.println();
		System.out.println("1. Dhosa");
		System.out.println("2. Idly");
		System.out.println("3. Poori");
		System.out.println("4. Chappati");
		System.out.println("5. Puttu");
		
		//To get input from the User 
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		//To select the order items use switch statements
		switch(a)
		{
		case 1:
		System.out.println("Enter Number of Dhosa :");
		int b=sc.nextInt();
		amt=b*10;
		bill=bill+amt;
		System.out.println("Number of Dhosa Ordered = "+b);
		break;
		
		case 2:
		System.out.println("Enter Number of Idly");
		int c=sc.nextInt();
		amt=c*8;
		bill=bill+amt;
		System.out.println("Number of Idly Ordered = "+c);
		break;
		
		case 3:
		System.out.println("Enter Number of Poori");
		int d=sc.nextInt();
		amt=d*15;
		bill=bill+amt;
		System.out.println("Number of Poori Ordered = "+d);
		break;
		
		case 4:
		System.out.println("Enter Number of Chappati");
		int e=sc.nextInt();
		amt=e*9;
		bill=bill+amt;
		System.out.println("Number of Chappati Ordered = "+e);
		break;
		
		case 5:
		System.out.println("Enter Number of Puttu");
		int f=sc.nextInt();
		amt=f*30;
		bill=bill+amt;
		System.out.println("Number of Puttu Ordered = "+f);
		break;
		
		//When the input from the user is invalid default case will activated
		default:
			System.out.println("Enter valid Item Number to place an Order");
			break;
		}
		
		System.out.println("Would You like to continue your order Press 1 or Press 0 to Exit");
		
		 t=sc.nextInt();
		
		 //Condition to take Further Order
		}while(t==1); 
			System.out.println("Your Total Bill Amount is " + bill);
			System.out.println();
		    System.out.println("************Thanks For Using this Application************");
		}
	}




import java.util.Scanner;
/*this program is based upon file reading and
makes user available to check the stock of a bakery*/
public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String s="||%-100s||%-100s||\n";
int choice;
do {
	System.out.println("|::::::::::::::: Check  Bakery Inventory :::::::::::::::|");
	System.out.println("                                                                           ");
	System.out.println("Press 1 for ALL");
	System.out.println("Press 2 for Bakery Items");
	System.out.println("Press 3 for Drinks ");
	System.out.println("Press 4 for Tuc shop ");
	System.out.println("Press 5 for Others");
	
	System.out.println("Enter Your Choice: ");

	choice=scan.nextInt();
	scan.close();
	
	switch(choice) {
	case 1:System.out.println("===================== Bakery Items  Details ===================");
	             bakery.details(bakery.Readlist());
	       System.out.println("======================== Drinks Details =======================");
		         drinks.details(drinks.Readlist());
		  System.out.println("======================== Tuc Shop Details =====================");
				tucshop.details(tucshop.Readlist());
		  System.out.println("======================== Others Details =======================");
		        others.details(others.Readlist());
	case 2:
		System.out.println("===================== Bakery Items  Details ===================");
		bakery.details(bakery.Readlist());
		break;
	case 3:
		System.out.println("======================== Drinks Details =======================");
		drinks.details(drinks.Readlist());
		break;
	case 4:
		System.out.println("======================== Tuc Shop Details =====================");
		tucshop.details(tucshop.Readlist());
		break;
	case 5:
		System.out.println("======================== Others Details =======================");
		others.details(others.Readlist());
	
	}
	
	
}while(choice<1||choice>6);

	}

}
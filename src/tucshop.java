import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class tucshop extends main  {
	public static final File z=new File("D:\\GDrive Backup\\Workspaces - online\\STS Workspace\\Cafeteria\\src\\bakerylist.txt");
	String biscuits;
	String bubbles;
	String toffees;
	String tea;
	String coffee;
	String chips;
	String quantity;
	String prices;
	String products;
	
	
	public static List<tucshop> Readlist(){
		  List<tucshop> man=new ArrayList<tucshop>();
		  FileReader fr=null;
		  BufferedReader br=null;
		  
		  try {
			  fr=new FileReader(z);
			  br=new BufferedReader(fr);
			  String line=br.readLine();
			  while (line!=null) {
				  tucshop t=new tucshop();
				  String [] l=line.split(",");
				  t.setProducts(l[0]);
				  t.setQuantity(l[1]);
				  t.setPrices(l[2]);
				  man.add(t);
				 line=br.readLine();}
			  }
			  catch(Exception e) {
				  System.out.println("file not found ");
		  }
			return man;
	  }
			public static void details(List<tucshop>man) {
				String right="|%-19s|%-20s|%-20s|%n";
				System.out.println("+-------------------+--------------------+--------------------+");
				System.out.println("|                    Bakery Inventory                         |");
				System.out.println("+-------------------+--------------------+--------------------+");
				System.out.println("|      Products     |    Quantity        |       Price        |");
				System.out.println("+-------------------+--------------------+--------------------+");
				System.out.println("+-------------------+--------------------+--------------------+");
				for (int i=0;i<man.size();i++) {
					System.out.format(right,man.get(i).getProducts(),man.get(i).getQuantity(),man.get(i).getPrices());
					System.out.println("+-------------------+--------------------+--------------------+");
					System.out.println("+-------------------+--------------------+--------------------+");
	  }
			} 
	
	
		  
	
	
	public String getBiscuits() {
		return biscuits;
	}
	public void setBiscuits(String biscuits) {
		this.biscuits = biscuits;
	}
	public String getBubbles() {
		return bubbles;
	}
	public void setBubbles(String bubbles) {
		this.bubbles = bubbles;
	}
	public String getToffees() {
		return toffees;
	}
	public void setToffees(String toffees) {
		this.toffees = toffees;
	}
	public String getTea() {
		return tea;
	}
	public void setTea(String tea) {
		this.tea = tea;
	}
	public String getCoffee() {
		return coffee;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public String getChips() {
		return chips;
	}
	public void setChips(String chips) {
		this.chips = chips;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrices() {
		return prices;
	}
	public void setPrices(String prices) {
		this.prices = prices;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	
	
	
	

}

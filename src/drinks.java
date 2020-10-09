import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class drinks extends main {
public static final File a=new File("D:\\GDrive Backup\\Workspaces - online\\STS Workspace\\Cafeteria\\src\\bakerylist.txt");
  String brewarages;
  String colddrinks;
  String shakes;
  String slushes;
  String water;
  String Products;
  String quantity;
  String prices;
    
  public static List<drinks> Readlist(){
	  List<drinks> man=new ArrayList<drinks>();
	  FileReader fr=null;
	  BufferedReader br=null;
	  
	  try {
		  fr=new FileReader(a);
		  br=new BufferedReader(fr);
		  String line=br.readLine();
		  while (line!=null) {
			  drinks d=new drinks();
			  String [] l=line.split(",");
			  d.setProducts(l[0]);
			  d.setQuantity(l[1]);
			  d.setPrices(l[2]);
			   man.add(d);
			 line=br.readLine();}
		  }
		  catch(Exception e) {
			  System.out.println("file not found ");
	  }
		return man;
  }
		public static void details(List<drinks>man) {
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
  
  
  
  
  
public String getBrewarages() {
	return brewarages;
}
public void setBrewarages(String brewarages) {
	this.brewarages = brewarages;
}
public String getColddrinks() {
	return colddrinks;
}
public void setColddrinks(String colddrinks) {
	this.colddrinks = colddrinks;
}
public String getShakes() {
	return shakes;
}
public void setShakes(String shakes) {
	this.shakes = shakes;
}
public String getSlushes() {
	return slushes;
}
public void setSlushes(String slushes) {
	this.slushes = slushes;
}
public String getWater() {
	return water;
}
public void setWater(String water) {
	this.water = water;
}
public String getProducts() {
	return Products;
}
public void setProducts(String products) {
	Products = products;
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
  
  
  
  
 
	
	
}

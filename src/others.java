import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class others {
	public static final File y=new File("D:\\GDrive Backup\\Workspaces - online\\STS Workspace\\Cafeteria\\src\\bakerylist.txt");
	String Fruitchat;
	String samosachat;
	String dhaibhallay;
	String burger;
	String shawarma;
	String icecream;
	String quantity;
	String prices;
	String products;
	
	
	 public static List<others> Readlist(){
		  List<others> man=new ArrayList<others>();
		  FileReader fr=null;
		  BufferedReader br=null;
		  
		  try {
			  fr=new FileReader(y);
			  br=new BufferedReader(fr);
			  String line=br.readLine();
			  while (line!=null) {
				  others o=new others();
				  String [] l=line.split(",");
				  o.setProducts(l[0]);
				  o.setQuantity(l[1]);
				  o.setPrice(l[2]);
				  man.add(o);
				 line=br.readLine();}
			  }
			  catch(Exception e) {
				  System.out.println("file not found ");
		  }
			return man;
	  }
			public static void details(List<others>man) {
				String right="|%-19s|%-20s|%-20s|%n";
				System.out.println("+-------------------+--------------------+--------------------+");
				System.out.println("|                    Bakery Inventory                         |");
				System.out.println("+-------------------+--------------------+--------------------+");
				System.out.println("|      Products     |    Quantity        |       Price        |");
				System.out.println("+-------------------+--------------------+--------------------+");
				System.out.println("+-------------------+--------------------+--------------------+");
				for (int i=0;i<man.size();i++) {
					System.out.format(right,man.get(i).getProducts(),man.get(i).getQuantity(),man.get(i).getPrice());
					System.out.println("+-------------------+--------------------+--------------------+");
					System.out.println("+-------------------+--------------------+--------------------+");
	  }
			} 
	
	
	
	
	public String getFruitchat() {
		return Fruitchat;
	}
	public void setFruitchat(String fruitchat) {
		Fruitchat = fruitchat;
	}
	public String getSamosachat() {
		return samosachat;
	}
	public void setSamosachat(String samosachat) {
		this.samosachat = samosachat;
	}
	public String getDhaibhallay() {
		return dhaibhallay;
	}
	public void setDhaibhallay(String dhaibhallay) {
		this.dhaibhallay = dhaibhallay;
	}
	public String getBurger() {
		return burger;
	}
	public void setBurger(String burger) {
		this.burger = burger;
	}
	public String getShawarma() {
		return shawarma;
	}
	public void setShawarma(String shawarma) {
		this.shawarma = shawarma;
	}
	public String getIcecream() {
		return icecream;
	}
	public void setIcecream(String icecream) {
		this.icecream = icecream;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return prices;
	}
	public void setPrice(String price) {
		this.prices = price;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	
	
	
	

}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class bakery extends main {
	public static final File f=new File ("D:\\GDrive Backup\\Workspaces - online\\STS Workspace\\Cafeteria\\src\\bakerylist.txt");
	String Bread;
	String cupcake;
	String jam;
	String cake;
	String biscuits;
	String pizza;
	String quantity;
	String price;
	String products;
	
	
	public static List<bakery> Readlist(){
		List<bakery> hero=new ArrayList<bakery>();
	FileReader fr =null;
	BufferedReader br=null;
	try {
		fr=new FileReader(f);
		br=new BufferedReader(fr);
		String line=br.readLine();
		while (line !=null) {
			bakery bake=new bakery();
			String[] l=line.split(",");
		bake.setProducts(l[0]);
		bake.setQuantity(l[1]);
		bake.setPrice(l[2]);
		hero.add(bake);
		line=br.readLine();
		
		}
	}catch(Exception e) {
		System.out.println("file not found ");
	}
	return hero;
	}
	public static void details(List<bakery>hero) {
	String right="|%-19s|%-20s|%-20s|%n";
		System.out.println("+-------------------+--------------------+--------------------+");
		System.out.println("|                    Bakery Inventory                         |");
		System.out.println("+-------------------+--------------------+--------------------+");
		System.out.println("|      Products     |    Quantity        |       Price        |");
		System.out.println("+-------------------+--------------------+--------------------+");
		System.out.println("+-------------------+--------------------+--------------------+");
		for (int i=0;i<hero.size();i++) {
			System.out.format(right,hero.get(i).getProducts(),hero.get(i).getQuantity(),hero.get(i).getPrice());
			System.out.println("+-------------------+--------------------+--------------------+");
			System.out.println("+-------------------+--------------------+--------------------+");
			}
		
	}
	
	public String getBread() {
		return Bread;
	}
	public void setBread(String bread) {
		Bread = bread;
	}
	public String getCupcake() {
		return cupcake;
	}
	public void setCupcake(String cupcake) {
		this.cupcake = cupcake;
	}
	public String getJam() {
		return jam;
	}
	public void setJam(String jam) {
		this.jam = jam;
	}
	public String getCake() {
		return cake;
	}
	public void setCake(String cake) {
		this.cake = cake;
	}
	public String getBiscuits() {
		return biscuits;
	}
	public void setBiscuits(String biscuits) {
		this.biscuits = biscuits;
	}
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}


	public String getProducts() {
		return products;
	}


	public void setProducts(String products) {
		this.products = products;
	}
	


	

}

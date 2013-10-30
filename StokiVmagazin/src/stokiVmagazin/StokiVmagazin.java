package stokiVmagazin;

public class StokiVmagazin {

	private String name;
	private double price;
	
	public StokiVmagazin(){
		name = null;
		price = 0.0;
	}
	
	public StokiVmagazin (String a, double b){
		this.name = a;
		this.price = b;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String someName){
		this.name = someName;
	}
	
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double somePrice){
		this.price = somePrice;
	}
	
}

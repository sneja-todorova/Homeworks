package stokiVmagazin;

import java.util.Scanner;

public class Elektrouredi extends StokiVmagazin {

	private double tension;
	private double maxPower;
	
	
	public Elektrouredi(String name, double price, double tension, double maxPower){
		super(name, price);
		this.tension = tension;
		this.maxPower = maxPower;
	}
	
	public double getTension(){
		return this.tension;
	}
	
	public void setTension(double someTension){
		this.tension = someTension;
	}
	
	public double getMaxPower(){
		return this.maxPower;
	}
	
	public void setMaxPower(double someMaxPower){
		this.maxPower = someMaxPower;
	}
	
}

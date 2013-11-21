package figure;

public abstract class PlainFigure implements Figure{
	
	public double d1;
	public double d2;
	public double d3;
	
	public PlainFigure (final double a, final double b, final double c){
		
		if(a>b && b>c){
			this.d1 = c;
			this.d2 = b;
			this.d3 = a;
		}
		else if(a>c && c>b){
			this.d1=b;
			this.d2=c;
			this.d3=a;
		}
		else if(b>a && a>c){
			this.d1 = c;
			this.d2 = a;
			this.d3 = b;
		}
		else if(b>c && c>a){
			this.d1 = a;
			this.d2 = c;
			this.d3 = b;
		}
		else if(c>a && a>b){
			this.d1 = b;
			this.d2 = a;
			this.d3 = c;
		}
		else if( c>b && b>a){
			this.d1 = a;
			this.d2 = b;
			this.d3 = c;
		}
	}
	
	@Override
	public void print(){
		System.out.printf("Razmernostite sa: d1 = %.2f \td2 = %.2f \td3 = %.2f", d1, d2, d3);
	}
	
	public boolean equals(PlainFigure y){
		if (y.d1 == this.d1  &&  y.d2 == this.d2  &&  y.d3 == this.d3){
			return true;
		}
		return false;	
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}

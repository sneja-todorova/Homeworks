package figure;

public class Triangle extends PlainFigure{
	public Triangle(double a1, double a2, double a3) throws TriangleException{
		super(a1, a2, a3);
		if ( a1+a2<a3 || a2+a3<a1 || a1+a3<a2 || a1<0 || a2<0 || a3<0){
			throw new TriangleException();
		}
	}


	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		double s = Math.sqrt(p*(p-this.d1)*(p-this.d2)*(p-this.d3));
		return s;
	}

	@Override
	public double getPerimeter() {
		return (this.d1 + this.d2 + this.d3);
	}
	
	public static void similarity(Triangle a, Triangle b){
		if(a.d1/b.d1 == a.d2/b.d2 && a.d2/b.d2 == a.d3/b.d3){
			System.out.println("Triygylnicite, koito vyvede, sa podobni.");
			return;
		}
		else{
			System.out.println("Triygylnicite, koito vyvede, ne sa podobni.");
			return;
		}
	}
}

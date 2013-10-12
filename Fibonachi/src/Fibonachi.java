import java.util.Scanner;


public class Fibonachi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Broi chlenove na redicata na Fibonachi = ");
		int n = input.nextInt();
		int j=0;
		int x=0;
		int p=1;
					
		System.out.println("Redicata na Fibonchi e : ");
		System.out.printf("%d\t%d\t", j,p);
		for (int i=0; i<n; i++){
			x=j+p;
			j=p;
			p=x;
			System.out.printf("%d\t", x);
		}		
	}
}

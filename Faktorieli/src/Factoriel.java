import java.util.Scanner;


public class Factoriel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("N = ");
		int N = input.nextInt();
		System.out.println("M = ");
		int M = input.nextInt();
		int Mfact=M;
		int Nfact = N;
		int x = N-M;
		
		for (int i=N-1; i>0; i--){
			Nfact*=i;			
		}
		System.out.println("N!= " + Nfact);
		for (int i=M-1; i>0; i--){
			Mfact*=i;			
		}
		System.out.println("M!= " + Mfact);
		System.out.printf("N!*M! = %d\n", Nfact*Mfact);
		
		for (int i=N-M; i>0; i--){
			x*=i;			
		}
		System.out.println ("(N=M)!= " + x);
		System.out.printf("N!*M!/(N-M)! = %d\n", Nfact*Mfact/x);
		
	}

}

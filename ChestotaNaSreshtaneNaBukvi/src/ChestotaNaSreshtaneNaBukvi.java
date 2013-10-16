import java.util.Scanner;


public class ChestotaNaSreshtaneNaBukvi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String text, text2;		
		int[] array = new int[26];
		
		System.out.print("Vyvedi text: ");
		text = input.nextLine();
		
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		text2 = text.toLowerCase(); 
		
		for (int i=0, j=0, k=0; i<26; i++){ 
			while(k<text2.length()){ 
				if(letters[i]==text2.charAt(k)){
					j++; 
				}
				k++; 
			}
			array[i]=j; 
			k=j=0; 
		}
		
		for(int i=0; i<26; i++){
			int index=i; 
			int max = array[i]; 
			for(int j = 0; (j+1 < 26); j++) {
				if((array[j+1]>max)){ 
					max=array[j+1]; 
					index=j+1; 
				}
			}
			if(max!=0){
				System.out.printf("%s - %d\n", letters[index], max);
			}	
			
			array[index] = 0; 
		}	
		
	}
}
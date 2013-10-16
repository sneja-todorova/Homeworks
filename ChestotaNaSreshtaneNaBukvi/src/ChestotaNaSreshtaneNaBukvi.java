import java.util.Scanner;


public class ChestotaNaSreshtaneNaBukvi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String text, text2;
		/* 
		 * String-a text shte syhranqva vhodniq potok ot simvoli, vyveden ot standartniq vhod.
		 * Tyi kato ne trqbva da se pravi razlika mejdu malki i golemi bukvi, syzdavam nova promenliva ot tip String (text2)
		 * koqto e gornata promenliva text, no s maki bukvi.
		 */
		int[] array = new int[26]; // pomoshten masiv v koito shte se zapametqvat sreshtaniqta na bukvite
		System.out.print("Vyvedi text: ");
		text = input.nextLine();
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		text2 = text.toLowerCase(); 
		for (int i=0, j=0, k=0; i<26; i++){ // cikyl s koito se obhojdat vsichki elementi ot letters
			while(k<text2.length()){ // cikyl s koito se obhojdat vsichki bukvi ot niza (v koito vs bukvi sa malki)
				if(letters[i]==text2.charAt(k)){ // pri namerena bukva ot letters syvpadashta s takava ot text2
					j++; // broqch za sreshtaniq na dadena bukva ot azbukata
				}
				k++; // broqch za bukvite ot niza text2
			}
			array[i]=j; // na vseki poreden element ot masiva syotvetstva chestotata na sreshtaniqta na syotvetnata bukva ot azbukata
			k=j=0; // za da zapochne otnachalo sys sledvashtata bukva ot azbukata
		}
		for(int i=0; i<26; i++){
			int index=i; // index e poziciqta ot letters na koqto shte syotvetstva nai-chesto sreshtanata bukva
			// zapochvame ot 1-vata bukva v azbukata (na 0-leva poziciq)
			int max = array[i]; // max e nai-golqmata (teushta) chestota na sreshtane na bukva(koq da e)
			for(int j = 0; (j+1 < 26); j++) {
				if((array[j+1]>max)){ // ako nqkoq bukva e po-chesto sreshtana ot dosegashnata nai-chesto sreshtana
					max=array[j+1]; // max priema nova (po-golqma) stoinost
					index=j+1; // poneje ima po-chesto sreshtana bukva => mestim index-a
				}
			}
			if(max!=0){
				/* Vseki pyt zapochvame otnachalo obhojdaneto na niza letters
				 * i ednovremenno s tova obhojdame i masiva array i tyrsim indeksa na nai-golqmoto chislo
				 * na koeto syotvetstva nomera ot bukvata ot azbukata, koqto se sreshta nai-mnogo.
				 * Moje da se sluchi taka, che nqkoq bukva da q nqma v niza, zatova shte otpechatvame samo tezi, 
				 * koito izobshto se sreshtat
				 */
				System.out.printf("%s - %d\n", letters[index], max);
			}
			
			array[index] = 0; 
			/* zanulqvame nai-golqmata tekushta chestota na sreshtane na bukva,
			 * za da moje sled tova, kato se pochne otnovo (ot 1vata poziciq) pretyrsvaneto na 2ta masiva
			 * da se izkliuchi veche izkaranata na standartniq izhod stoinost na sreshtane na syotvetnata bukva
			 */
		}		
	}
}
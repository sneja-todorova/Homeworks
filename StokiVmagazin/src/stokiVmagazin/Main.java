package stokiVmagazin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
		StokiVmagazin chanta = new StokiVmagazin("HP", 20.99);
		StokiVmagazin pechka = new StokiVmagazin("Beko", 69.50);
		StokiVmagazin hladilnik = new StokiVmagazin("Siemens", 156.80);
		
		
		System.out.printf("Chantata ima harakteristiki:\nIme %s\nCena: %.2f\n\n", chanta.getName(), chanta.getPrice());
		chanta.setPrice(35.60);
		chanta.setName("Targus");
		System.out.printf("Chantata ima harakteristiki:\nIme %s\nCena: %.2f\n\n", chanta.getName(), chanta.getPrice());
		
		
		System.out.printf("Pechkata ima harakteristiki:\nIme %s\nCena: %.2f\n\n", pechka.getName(), pechka.getPrice());
		pechka.setPrice(150.49);
		pechka.setName("Diplomat");
		System.out.printf("Pechkata ima harakteristiki:\nIme %s\nCena: %.2f\n\n", pechka.getName(), pechka.getPrice());
		
		
		System.out.printf("Hladilnika ima harakteristiki:\nIme %s\nCena: %.2f\n\n", hladilnik.getName(), hladilnik.getPrice());
		hladilnik.setPrice(309.99);
		hladilnik.setName("Siemens");
		System.out.printf("Hladilnika ima harakteristiki:\nIme %s\nCena: %.2f\n\n", hladilnik.getName(), hladilnik.getPrice());
		
		Elektrouredi toster = new Elektrouredi("Braun", 40.4, 950, 1000);
		Elektrouredi miqlnaMashina = new Elektrouredi("Philips", 346.98, 1200, 1500);
		Elektrouredi peralnq = new Elektrouredi("BEKO", 350.60, 2000, 2100);
		Elektrouredi masha = new Elektrouredi("Philips", 70.90, 360, 400);
		
		
		System.out.printf("Tostera ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				toster.getName(), toster.getPrice(), toster.getTension(), toster.getMaxPower() );
		toster.setName("Philips");
		toster.setPrice(39.00);
		toster.setTension(980);
		System.out.printf("Tostera ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
										toster.getName(), toster.getPrice(), toster.getTension(), toster.getMaxPower() );
		
		
		System.out.printf("Miqlnata mashina ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				miqlnaMashina.getName(), miqlnaMashina.getPrice(), miqlnaMashina.getTension(), miqlnaMashina.getMaxPower() );
		miqlnaMashina.setName("Neo");
		miqlnaMashina.setPrice(69.99);
		System.out.printf("Miqlnata mashina ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				miqlnaMashina.getName(), miqlnaMashina.getPrice(), miqlnaMashina.getTension(), miqlnaMashina.getMaxPower() );
		
		
		
		System.out.printf("Perlanqta ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				peralnq.getName(), peralnq.getPrice(), peralnq.getTension(), peralnq.getMaxPower() );
		peralnq.setName("Neo");
		peralnq.setPrice(110.10);
		peralnq.setTension(3000);
		peralnq.setMaxPower(3500);
		System.out.printf("Perlanqta ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				peralnq.getName(), peralnq.getPrice(), peralnq.getTension(), peralnq.getMaxPower() );
		
		
		
		System.out.printf("Mashata ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				masha.getName(), masha.getPrice(), masha.getTension(), masha.getMaxPower() );
		masha.setName("Philips");
		masha.setMaxPower(660);		
		System.out.printf("Mashata ima harakteristiki:\nIme %s\nCena: %.2f\nNaprejenie: %.2f/nMaksimalna moshtnost: %.2f\n\n", 
				masha.getName(), masha.getPrice(), masha.getTension(), masha.getMaxPower() );
		
		System.out.print("Vyvedi cena za 1kWh: ");
		double price = input.nextDouble();
		
		System.out.printf("Ureda toster harchi za edno denonoshtie %.2f lv.\n\n\n", 
									costOfElectricityPerDay(toster.getTension(), price));
		
		System.out.printf("Ureda miqlna mashina harchi za edno denonoshtie %.2f lv.\n\n\n", 
				costOfElectricityPerDay(miqlnaMashina.getTension(), price));
		
		System.out.printf("Ureda peralnq harchi za edno denonoshtie %.2f lv.\n\n\n", 
				costOfElectricityPerDay(peralnq.getTension(), price));
		
		System.out.printf("Ureda masha harchi za edno denonoshtie %.2f lv.\n\n\n", 
				costOfElectricityPerDay(masha.getTension(), price));
		
	}

	
	public static double costOfElectricityPerDay(double tension, double priceForElectricity){			
			return  (tension/1000)*priceForElectricity*24*0.4;
		}

}

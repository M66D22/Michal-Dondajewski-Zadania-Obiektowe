import java.util.Scanner;

public class Main{
	
	public static void Kwadrat(){
		int bokKwadratu, wynikPola, wynikObwodu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybrales kwadrat!");
		System.out.println("Podaj bok kwadratu: ");
		bokKwadratu = sc.nextInt();
		wynikPola = bokKwadratu * bokKwadratu;
		wynikObwodu = bokKwadratu * 4;
		
		System.out.println("Pole kwadratu: "+wynikPola+", Obwod Kwadratu: "+wynikObwodu);
		
		//Rysowanie kwadratu: 
	}
	public static void Prostokat(){
		int szerokosc, wysokosc, poleProstokota, obwodProstokota;
		Scanner sc = new Scanner(System.in);
		System.out.println("Wybrales prostokat!");
		System.out.println("Podaj szerokosc: ");
		szerokosc = sc.nextInt();
		System.out.println("Podaj wysokosc: ");
		wysokosc = sc.nextInt();
		poleProstokota = szerokosc * wysokosc;
		obwodProstokota = szerokosc + szerokosc + wysokosc + wysokosc;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int jakaFigura;
		
		System.out.println("Wybierz co chccesz narysowac i obliczyc 1)kwadrat, 2)prostokat: ");
		jakaFigura = sc.nextInt();
		
		switch (jakaFigura){
			case 1:
				Kwadrat();
				break;
			
			case 2:
				Prostokat();
				break;
				
			default:
				System.out.println("Nie ma takiej figury do wyboru!");
		}
	}
}
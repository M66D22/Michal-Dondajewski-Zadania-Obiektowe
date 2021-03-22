class Main{
	static Samochody samochody, samochody1, samochody2;
	static Klient klient;
	
	public static void main(String[] args){
		init();
		System.out.println(samochody.toString());
		System.out.println(samochody1.toString());
		System.out.println(samochody2.toString());
	}
	
	//Metoda tworząca obietky
	private static void init(){
		samochody = new Samochody();
		samochody.marka = "Ford";
		samochody.model = "S-Max";
		samochody.rodzaj_silnika = "Diesel";
		samochody.moc = 150;
		samochody.mo_obrotowy = 246;
		samochody.pojemnosc = 1980;
		
		samochody1 = new Samochody();
		samochody1.marka = "Audi";
		samochody1.model = "Q5";
		samochody1.rodzaj_silnika = "Diesel";
		samochody1.moc = 190;
		samochody1.mo_obrotowy = 246;
		samochody1.pojemnosc = 1980;		
	
		samochody2 = new Samochody();
		samochody2.marka = "Audi";
		samochody2.model = "Q5";
		samochody2.rodzaj_silnika = "Diesel";
		samochody2.moc = 190;
		samochody2.mo_obrotowy = 246;
		samochody2.pojemnosc = 1980;
	
		klient = new Klient();
		klient.nr = 10;
	}
}
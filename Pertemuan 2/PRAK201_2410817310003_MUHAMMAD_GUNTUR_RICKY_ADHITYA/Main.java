package PRAK201_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA;

public class Main {

	public static void main(String[] args) {
		Buah apel = new Buah("Apel", 0.4, 7000, 40);
		Buah mangga = new Buah("mangga", 0.2, 3500, 15);
		Buah alpukat = new Buah("alpukat", 0.25, 10000, 12);

		apel.info();
		mangga.info();
		alpukat.info();
	}	
}
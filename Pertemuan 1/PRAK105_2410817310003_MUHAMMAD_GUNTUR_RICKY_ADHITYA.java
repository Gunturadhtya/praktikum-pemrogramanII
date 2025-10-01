package praktikum1;
import java.util.Scanner;

public class PRAK105_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA {
	static final double pi = 3.14;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari: ");
		double jari_jari = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputScanner(0.0, scanner);
		
		System.out.print("Masukkan tinggi: ");
		double tinggi = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputScanner(0.0, scanner);
		
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jari_jari, tinggi, pi * jari_jari * jari_jari * tinggi);
		
		scanner.close();
	}
}

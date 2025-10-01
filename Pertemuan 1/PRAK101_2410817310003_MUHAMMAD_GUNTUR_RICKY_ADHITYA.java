package praktikum1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Nama Lengkap: ");
		String nama_lengkap = inputScanner(" ", scanner);
		
		System.out.print("Masukkan Tempat Lahir: ");
		String tempat_lahir = inputScanner(" ", scanner);
		
		System.out.print("Masukkan Tanggal Lahir: ");
		int tanggal_lahir = inputScanner(0, scanner);
		if (tanggal_lahir < 1 || tanggal_lahir > 31) inputErrorExitProgram();
		
		
		System.out.print("Masukkan Bulan Lahir: ");
		int bulan_lahir = inputScanner(0, scanner);
		if (bulan_lahir < 1 || bulan_lahir > 12) inputErrorExitProgram();
		
		System.out.print("Masukkan Tahun Lahir: ");
		int tahun_lahir = inputScanner(0, scanner);
		
		System.out.print("Masukkan Tinggi Badan: ");
		int tinggi_badan = inputScanner(0, scanner);
		
		System.out.print("Masukkan Berat Badan: 	");
		double berat_badan = inputScanner(0.0, scanner);
		
		String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
		
		System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d\nTinggi Badan %d cm dan Berat Badan %.2f kilogram\n"
				, nama_lengkap, tempat_lahir, tanggal_lahir, bulan[bulan_lahir-1], tahun_lahir, tinggi_badan, berat_badan);
		
		scanner.close();
	}
	
	public static void inputErrorExitProgram() {
		System.out.println("Input Error, Menghentikan Program .. ");
		System.out.println("Program telah berhenti");
		System.exit(0);
	}
	
	public static int inputScanner(int var, Scanner scanner) {
		try {
			var = scanner.nextInt();
		}catch(InputMismatchException e) {
			inputErrorExitProgram();
		}
		return var;
	}
	
	public static double inputScanner(double var, Scanner scanner) {
		try {
			var = scanner.nextDouble();
		}catch(InputMismatchException e) {
			inputErrorExitProgram();
		}
		return var;
	}
	
	public static String inputScanner(String var, Scanner scanner) {
		try {
			var = scanner.nextLine();
		}catch(InputMismatchException e) {
			inputErrorExitProgram();
		}
		return var;
	}
	
	public static char inputScanner(char var, Scanner scanner) {
		try {
			var = scanner.next().charAt(0);
		}catch(InputMismatchException e) {
			inputErrorExitProgram();
		}
		return var;
	}
}

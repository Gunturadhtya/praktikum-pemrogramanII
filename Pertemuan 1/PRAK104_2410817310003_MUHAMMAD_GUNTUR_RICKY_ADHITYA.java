package praktikum1;
import java.util.Scanner;

public class PRAK104_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tangan Abu: ");
		char tangan_abu[] = new char[3];
		for(int i = 0; i < 3; i++) {
			tangan_abu[i] = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputScanner('a', scanner);				
			tangan_abu[i] = Character.toLowerCase(tangan_abu[i]);
			if (tangan_abu[i] != 'g' && tangan_abu[i] != 'b' && tangan_abu[i] != 'k') {
				PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputErrorExitProgram();
			}
		}
		
		System.out.print("Tangan Bagas: ");
		char tangan_bagas[] = new char[3];
		for(int i = 0; i < 3; i++) {
			tangan_bagas[i] = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputScanner('a', scanner);
			tangan_bagas[i] = Character.toLowerCase(tangan_bagas[i]);
			if (tangan_bagas[i] != 'g' && tangan_bagas[i] != 'b' && tangan_bagas[i] != 'k') {
				PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputErrorExitProgram();
			}
		}
		
		int score = 0;
		for(int i = 0; i < 3; i++) {
			score += batuGuntingKertas(tangan_abu[i], tangan_bagas[i]);
		}
		
		
		if(score < 0) {
			System.out.println("Bagas");
		}
		else if(score > 0) {
			System.out.println("Abu");
		}else {
			System.out.println("Seri");
		}
		
		scanner.close();
	}
	
	static int batuGuntingKertas(char A, char B) {
		if (A == B) {
			return 0;
		}else if ((A == 'k' && B == 'b') || (A == 'b' && B == 'g') || (A == 'g' && B == 'k')) {
			return 1;
		}else {
			return -1;
		}
	}
}

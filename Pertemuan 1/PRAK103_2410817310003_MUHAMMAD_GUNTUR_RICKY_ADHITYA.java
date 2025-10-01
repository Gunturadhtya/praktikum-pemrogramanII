package praktikum1;
import java.util.Scanner;

public class PRAK103_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int banyak_deret = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputScanner(0, scanner);
		int bilangan_pertama = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA .inputScanner(0, scanner);
		
		
		int i = 0;
		do {
			
			if(bilangan_pertama % 2 != 0) {
				if(i < banyak_deret -1) {
					System.out.printf("%d, ", bilangan_pertama);
				}else {
					System.out.printf("%d", bilangan_pertama);
				}
				
				i++;
			}else {
				System.out.printf("%d, ", ++bilangan_pertama);
				i++;
			}
			
			bilangan_pertama += 2;
		}while(i < banyak_deret);
		
		scanner.close();
	}
}

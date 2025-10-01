package praktikum1;
import java.util.Scanner;

public class PRAK102_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bilangan_pertama = PRAK101_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA.inputScanner(0, scanner);
		
		int i = 0;
		while(i <= 10) {
			
			int bilangan_i = bilangan_pertama;
			if(bilangan_pertama % 5 == 0) {
				bilangan_i = (bilangan_pertama/5) - 1;
			}
			
			if(i < 10) {
				System.out.printf("%d, ", bilangan_i);
			}else {
				System.out.printf("%d ", bilangan_i);
			}
			
			
			bilangan_pertama++;
			i++;
		}
		
		scanner.close();
	}
}

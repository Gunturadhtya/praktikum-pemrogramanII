package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		if(n < 1) {
			System.out.println("Input salah, nilai tidak boleh kurang dari 1");
			System.exit(0);
		}
		
		
		LinkedList<Dadu> list_dadu = new LinkedList<>(); 
		for(int i = 0; i < n; i++) {
			Dadu dadu_i = new Dadu();
			list_dadu.add(dadu_i);
		}
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += list_dadu.get(i).getSisiDadu();
			System.out.printf("Dadu ke-%d bernilai %d\n", i+1, list_dadu.get(i).getSisiDadu());
		}
		
		System.out.printf("Total nilai dadu keseluruhan %d\n", sum);
		
		scanner.close();
	}

}

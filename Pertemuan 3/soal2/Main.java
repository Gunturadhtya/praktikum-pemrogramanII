package praktikum3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Negara> list_negara = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
        Map<Integer, String> bulan = new HashMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
		
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String nama_negara = scanner.nextLine();
			String jenis_kepemimpinan = scanner.nextLine();
			String nama_pemimpin = scanner.nextLine();
			
			Negara this_negara; 
			if(!jenis_kepemimpinan.toLowerCase().equals("monarki")) {
				int tanggal_kemerdekaan = scanner.nextInt();
				int bulan_kemerdekaan = scanner.nextInt();
				int tahun_kemerdekaan = scanner.nextInt();
				if(!cekTanggal(tahun_kemerdekaan, bulan_kemerdekaan, tanggal_kemerdekaan)) {
					System.out.println("Input Tanggal Keliru");
					System.exit(0);
				}
				
				this_negara = new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan.get(bulan_kemerdekaan), tahun_kemerdekaan);
				scanner.nextLine();
			}else {
				this_negara = new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin);	
			}
			list_negara.add(this_negara);
		}
		
		for(int i = 0; i < n; i++) {
			list_negara.get(i).detail();
		}
		
		scanner.close();
	}
	
	public static boolean cekTanggal(int tahun, int bulan, int tanggal){
		if(tahun < 1|| bulan >= 2025) 
		return false;
		
		if(bulan < 1 || bulan > 12) 
		return false;
		
		if(bulan == 1 || bulan ==  3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) 
		return (tanggal < 1 || tanggal > 31) ? false : true;
		
		if(bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) 
		return (tanggal < 1 || tanggal > 30) ? false : true;
		
		if(bulan == 2 && tahun % 4 == 0) {
			return (tanggal < 1 || tanggal > 29) ? false : true;
		}else {
			return (tanggal < 1 || tanggal > 28) ? false : true;
		}	
	}
	

}

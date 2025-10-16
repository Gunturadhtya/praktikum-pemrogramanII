package praktikum3.soal3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> daftar_nim = new HashSet<String>();
		ArrayList<Mahasiswa> daftar_mahasiswa = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean keluar = false; 
		while(!keluar) {
			System.out.print("Menu:\r\n"
					+ "1. Tambah Mahasiswa\r\n"
					+ "2. Hapus Mahasiswa berdasarkan NIM\r\n"
					+ "3. Cari Mahasiswa berdasarkan NIM\r\n"
					+ "4. Tampilkan Daftar Mahasiswa\r\n"
					+ "0. Keluar\r\n"
					+ "Pilihan: ");
			int pilihan = scanner.nextInt();
			scanner.nextLine();
			
			switch(pilihan) {
				case 1:
					System.out.print("Masukkan Nama Mahasiswa: ");
					String nama = scanner.nextLine();
					System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
					String nim = scanner.next();	
					
					if(daftar_nim.contains(nim)) {
						System.out.println("NIM tidak unik\n\n");
						break;
					}
					daftar_nim.add(nim);
					Mahasiswa new_mahasiswa = new Mahasiswa(nama, nim);
					daftar_mahasiswa.add(new_mahasiswa);
					
					System.out.printf("Mahasiswa %s ditambahkan\n", new_mahasiswa.getNama());
					break;
				case 2:
					System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
					String hapus_nim = scanner.next();
					
					if(!daftar_nim.contains(hapus_nim)) {
						System.out.printf("Mahasiswa dengan NIM %s tidak ada", hapus_nim);
						break;
					}
					
					for(Mahasiswa m: daftar_mahasiswa) {
						if(m.getNim().equals(hapus_nim)) {
							daftar_mahasiswa.remove(m);
							daftar_nim.remove(hapus_nim);
							System.out.printf("Mahasiswa dengan NIM %s dihapus.\n", hapus_nim);
						}
					}
					break;
				case 3:
					System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
					String cari_nim = scanner.next();
					
					if(!daftar_nim.contains(cari_nim)) {
						System.out.printf("Mahasiswa dengan NIM %s tidak ada", cari_nim);
						break;
					}
					
					for(Mahasiswa m: daftar_mahasiswa) {
						if(m.getNim().equals(cari_nim)) {
							System.out.printf("NIM: %s, Nama: %s\n", m.getNim(), m.getNama());
						}
					}
					
					break;
				case 4:
					System.out.println("Daftar Mahasiswa: ");
					if(daftar_nim.isEmpty()) {
						System.out.println("Daftar Mahasiswa Kosong\n");
					}
					
					for(Mahasiswa m: daftar_mahasiswa) {
						System.out.printf("NIM: %s, Nama: %s\n", m.getNim(), m.getNama());
					}
					break;
				case 0:
					System.out.println("Terima kasih!");
					keluar = true;
					break;
				default:
					System.out.println("Input Salah\n\n");
					break;
			}
		}
		
		scanner.close();
	}
	
	

}

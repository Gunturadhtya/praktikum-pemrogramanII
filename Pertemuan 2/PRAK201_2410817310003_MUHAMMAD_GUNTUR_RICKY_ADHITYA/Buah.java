package PRAK201_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA;

public class Buah {
	private String nama;
	private double berat;
	private double harga_berat;
	private double jumlah_beli;
	private double harga;
	private double harga_diskon;
	
	Buah(String nama, double berat, double harga_berat, double jumlah_beli){
		this.nama = nama;
		this.berat = berat;
		this.harga_berat = harga_berat;
		this.jumlah_beli = jumlah_beli;
	}
	
	public void info() {
		harga = (jumlah_beli/berat) * harga_berat;
		harga_diskon = harga_berat < 5000 ? harga_berat * jumlah_beli * 0.016 : harga_berat * jumlah_beli * 0.02;
		System.out.printf("Nama Buah: %s\r\n"
				+ "Berat: %.1f\r\n"
				+ "Harga: %.1f\r\n"
				+ "Jumlah Beli: %.1fkg\r\n"
				+ "Harga Sebelum Diskon: Rp%.2f\r\n"
				+ "Total Diskon: Rp%.2f\r\n"
				+ "Harga Setelah Diskon: Rp%.2f\n\n"
				, nama, berat, harga_berat, jumlah_beli, harga, harga_diskon, harga - harga_diskon);
	}	
}

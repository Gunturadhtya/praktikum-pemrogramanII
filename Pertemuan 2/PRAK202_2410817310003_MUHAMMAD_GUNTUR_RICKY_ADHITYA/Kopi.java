package PRAK202_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA;

public class Kopi {
	public String namaKopi;
	public String ukuran;
	public double harga;
	
	private String pembeli;  
	
	public void info() {
		System.out.printf("Nama Kopi: %s\r\n"
				+ "Ukuran: %s\r\n"
				+ "Harga: Rp. %.1f\n"
				, namaKopi, ukuran, harga);
	}
	
	public void setPembeli(String pembeli) {
		this.pembeli = pembeli;
	}
	
	public String getPembeli() {
		return this.pembeli;
	}
	
	public double getPajak() {
		return this.harga * 11/100;
	}
}

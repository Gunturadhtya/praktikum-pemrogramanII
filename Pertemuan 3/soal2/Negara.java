package praktikum3.soal2;

public class Negara {
	private String nama;
	private String jenis_kepemimpinan;
	private String nama_pemimpin;
	private int tanggal_kemerdekaan;
	private String bulan_kemerdekaan;
	private int tahun_kemerdekaan;
	
	Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin,
			int tanggal_kemerdekaan, String bulan_kemerdekaan, int tahun_kemerdekaan){
		this.nama = nama;
		this.jenis_kepemimpinan = jenis_kepemimpinan;
		this.nama_pemimpin = nama_pemimpin;
		this.tanggal_kemerdekaan = tanggal_kemerdekaan;
		this.bulan_kemerdekaan = bulan_kemerdekaan;
		this.tahun_kemerdekaan = tahun_kemerdekaan;
	}
	
	Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin){
		this.nama = nama;
		this.jenis_kepemimpinan = jenis_kepemimpinan;
		this.nama_pemimpin = nama_pemimpin;
	}
	
	public void detail() {
		if(jenis_kepemimpinan.toLowerCase().equals("monarki")) {
			System.out.printf("Negara %s "
					+ "mempunyai Raja "
					+ "bernama %s\n\n", nama, nama_pemimpin);
		}else {
			System.out.printf("Negara %s mempunyai %s "
					+ "bernama %s\r\n"
					+ "Deklarasi Kemerdekaan pada Tanggal %d %s %d\n\n", 
					nama, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan);
		}
	}
	
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kepemimpinan() {
        return jenis_kepemimpinan;
    }

    public void setJenis_kepemimpinan(String jenis_kepemimpinan) {
        this.jenis_kepemimpinan = jenis_kepemimpinan;
    }

    public String getNama_pemimpin() {
        return nama_pemimpin;
    }

    public void setNama_pemimpin(String nama_pemimpin) {
        this.nama_pemimpin = nama_pemimpin;
    }

    public int getTanggal_kemerdekaan() {
        return tanggal_kemerdekaan;
    }

    public void setTanggal_kemerdekaan(int tanggal_kemerdekaan) {
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
    }

    public String getBulan_kemerdekaan() {
        return bulan_kemerdekaan;
    }

    public void setBulan_kemerdekaan(String bulan_kemerdekaan) {
        this.bulan_kemerdekaan = bulan_kemerdekaan;
    }

    public int getTahun_kemerdekaan() {
        return tahun_kemerdekaan;
    }
    
    public void setTahun_kemerdekaan(int tahun_kemerdekaan) {
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }
}


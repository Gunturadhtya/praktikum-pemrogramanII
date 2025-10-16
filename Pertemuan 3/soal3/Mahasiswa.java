package praktikum3.soal3;

public class Mahasiswa {
	private String nama;
	private String nim;
	
	Mahasiswa(String nama, String nim){
		this.setNama(nama);
		this.setNim(nim);
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}	
}

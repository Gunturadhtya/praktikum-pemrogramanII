package PRAK203_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA;

// nama class keliru seharusnya Pegawai sesuai nama file 
//public class Employee {
public class Pegawai {
	public String nama;

//	tipe data keliru tipe data asal seharusnya String untuk menyimpan teks
//	public char asal;
	public String asal;
	public String jabatan;
	public int umur;
	
	public String getNama() {
		return nama;
	}
	
	public String getAsal() {
		return asal;
	}

//  method setter tidak memiliki parameter untuk mengubah data jabatan 
//	public void setJabatan() {
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
}

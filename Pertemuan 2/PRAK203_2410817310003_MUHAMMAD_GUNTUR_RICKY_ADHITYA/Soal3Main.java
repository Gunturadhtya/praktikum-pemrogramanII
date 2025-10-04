package PRAK203_2410817310003_MUHAMMAD_GUNTUR_RICKY_ADHITYA;

public class Soal3Main {
	public static void main(String[] args) {
			Pegawai p1 = new Pegawai();

//			baris ini error karena tidak memiliki tanda koma di akhir baris
//			p1.nama = "Roi"
			p1.nama = "Roi";
			p1.asal = "Kingdom of Orvel";
			
//			program tidak memberikan nilai umur pada objek p1 tetapi mengambil nilainya
//
			p1.umur = 17;
			
			p1.setJabatan("Assasin");
			System.out.println("Nama Pegawai: " + p1.getNama());	
			System.out.println("Asal: " + p1.getAsal());
			System.out.println("Jabatan: " + p1.jabatan);

//			menambahkan String Tahun untuk menyesuaikan dengan output soal
//			System.out.println("Umur: " + p1.umur);
			System.out.println("Umur: " + p1.umur + " Tahun");
	}
}


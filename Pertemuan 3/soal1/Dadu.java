package praktikum3.soal1;

import java.util.Random;

public class Dadu {
	private int sisi_dadu;
	private Random random;
	Dadu(){
		this.random = new Random();
		acakNilai();
	}
	
	public void acakNilai() {	
		setSisiDadu(this.random.nextInt(6) + 1);
	}
	
	public void setSisiDadu(int sisi_dadu){
		if(!(sisi_dadu < 0 || sisi_dadu > 6)) {
			this.sisi_dadu = sisi_dadu;
		}
	}
	
	public int getSisiDadu() {
		return this.sisi_dadu;
	}
}

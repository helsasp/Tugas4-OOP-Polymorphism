package id.its.pbo.zoo;

public abstract class Hewan {
	
	private String nama;
	
	public Hewan (String nama) {
		this.nama = nama;
	}

	public String getNama () {
		return nama;
	}
	
	public void setNama(String nama) {
        this.nama = nama;
    }
	
	public abstract String buatSuara();
}

package id.its.pbo.art;

public class StudioSeniProgram {
	
	public static void main (String[]args) {
		
		StudioSeni studioseni1 = new StudioSeni();
		
		Lukisan lukisan1 = new Lukisan ("Starry Night");
		Patung patung1 = new Patung ("Gajah");
		
		
		studioseni1.tambahKaryaSeni(lukisan1);
		studioseni1.tambahKaryaSeni(patung1);
		
		System.out.println(studioseni1.tampilkanSemuaKarya());
	}

}

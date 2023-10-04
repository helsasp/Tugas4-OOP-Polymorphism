package id.its.pbo.music;

public class StudioMusikProgram {
	
	public static void main (String[]args) {
		
		StudioMusik studio1 = new StudioMusik();
		
		Gitar gitar1 = new Gitar("Yamaha");
		Piano piano1 = new Piano("Casio");
		
		studio1.tambahInstrumen(gitar1);
		studio1.tambahInstrumen(piano1);
		
		System.out.println(studio1.mainkanInstrumen());
	}

}

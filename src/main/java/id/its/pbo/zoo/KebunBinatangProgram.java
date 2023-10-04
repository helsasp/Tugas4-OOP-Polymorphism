package id.its.pbo.zoo;

public class KebunBinatangProgram {
	
	public static void main (String[]args) {
		
		Kucing kucing1 = new Kucing ("Milo");
		Anjing anjing1 =new Anjing ("Bubble");
		
		System.out.println("Kucing1 berbunyi: " + kucing1.buatSuara());
        System.out.println("Anjing1 berbunyi: " + anjing1.buatSuara());
    }

}

package id.its.pbo.art;

import java.util.List;
import java.util.ArrayList;

public class StudioSeni {
	
	private List <KaryaSeni> listKarya;
	
	public StudioSeni () {
		listKarya = new ArrayList<>();
	}
	
	public void tambahKaryaSeni (KaryaSeni karya) {
		listKarya.add(karya);
	}
	
	public List <String> tampilkanSemuaKarya(){
		List <String> MenampilkanSemuaKarya = new ArrayList<>();
		for(KaryaSeni karya : listKarya) {
			MenampilkanSemuaKarya.add(karya.tampilkan());
		}
		
		return MenampilkanSemuaKarya;
	}

}

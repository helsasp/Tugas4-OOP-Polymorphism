package id.its.pbo.music;

import java.util.ArrayList;
import java.util.List;

public class StudioMusik {
    private List<Instrumen> listInstrumen;

    public StudioMusik() {
        listInstrumen = new ArrayList<>();
    }

    public void tambahInstrumen(Instrumen instrumen) {
        listInstrumen.add(instrumen);
    }

    public String mainkanInstrumen() {
        StringBuilder suaraGabung = new StringBuilder();
        for (Instrumen instrumen : listInstrumen) {
            suaraGabung.append(instrumen.suara()).append(" ");
        }

        return suaraGabung.toString().trim(); 
    }
}

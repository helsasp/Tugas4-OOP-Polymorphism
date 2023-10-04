package id.its.pbo.music;

public abstract class Instrumen {
    protected String nama;

    public Instrumen(String nama) {
        this.nama = nama;
    }

    public abstract String suara();
}

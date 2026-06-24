public abstract class MataKuliah {

    protected String nama;
    protected int sks;

    public MataKuliah(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public abstract void tampilkanInfo();
}
public class MataKuliahKKN extends MataKuliah {

    public MataKuliahKKN(String nama, int sks) {
        super(nama, sks);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mata Kuliah KKN : " + nama);
    }
}
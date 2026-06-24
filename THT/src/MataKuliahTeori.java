public class MataKuliahTeori extends MataKuliah {

    public MataKuliahTeori(String nama, int sks) {
        super(nama, sks);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mata Kuliah Teori : " + nama);
    }
}
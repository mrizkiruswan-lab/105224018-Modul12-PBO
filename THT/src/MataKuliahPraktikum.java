public class MataKuliahPraktikum extends MataKuliah
        implements OperasiPraktikum {

    public MataKuliahPraktikum(String nama, int sks) {
        super(nama, sks);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mata Kuliah Praktikum : " + nama);
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Asisten Lab Dialokasikan");
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Peralatan Praktikum Dicek");
    }
}
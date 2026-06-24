public class Main {

    public static void main(String[] args) {
        DatabaseConnection db =
                new CloudNoSQLConnection();
        krsValidator validator =
                new krsValidator();
        krsRepository repository =
                new krsRepository(db);
        krsPdfPrinter printer =
                new krsPdfPrinter();
        StrategiKalkulasiUKT strategi =
                new uktMbkm();
        krsService service =
                new krsService(
                        validator,
                        repository,
                        printer,
                        strategi
                );
        MataKuliah mk1 =
                new MataKuliahTeori(
                        "Pemrograman Berorientasi Objek",
                        3);

        MataKuliah mk2 =
                new MataKuliahPraktikum(
                        "Praktikum PBO",
                        1);

        MataKuliah mk3 =
                new MataKuliahKKN(
                        "Kuliah Kerja Nyata",
                        4);

        mk1.tampilkanInfo();
        mk2.tampilkanInfo();
        mk3.tampilkanInfo();

        service.prosesKRS(20);
    }
}
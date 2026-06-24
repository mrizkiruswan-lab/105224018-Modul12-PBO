public class krsService {

    private krsValidator validator;
    private krsRepository repository;
    private krsPdfPrinter printer;
    private StrategiKalkulasiUKT strategi;

    public krsService(
            krsValidator validator,
            krsRepository repository,
            krsPdfPrinter printer,
            StrategiKalkulasiUKT strategi) {

        this.validator = validator;
        this.repository = repository;
        this.printer = printer;
        this.strategi = strategi;
    }

    public void prosesKRS(int totalSKS) {

        if(validator.validasiSKS(totalSKS)) {

            double ukt = strategi.hitungUKT();

            System.out.println("UKT : Rp " + ukt);

            repository.simpan("Data KRS");

            printer.cetakPDF();
        }
    }
}
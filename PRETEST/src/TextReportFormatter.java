public class TextReportFormatter implements FineReportFormatter {

    @Override
    public void printReport(double fine) {
        System.out.println("=== LAPORAN DENDA ===");
        System.out.println("Total Denda : Rp" + fine);
    }
}
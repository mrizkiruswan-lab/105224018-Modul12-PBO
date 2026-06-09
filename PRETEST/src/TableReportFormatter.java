public class TableReportFormatter implements FineReportFormatter {

    @Override
    public void printReport(double fine) {
        System.out.println("+----------------------+");
        System.out.println("| Total Denda | Rp" + fine + " |");
        System.out.println("+----------------------+");
    }
}
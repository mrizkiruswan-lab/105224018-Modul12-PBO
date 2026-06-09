public class LibraryManager {
    private FineCalculator fineCalculator;
    private FineReportFormatter reportFormatter;

    public LibraryManager(FineCalculator fineCalculator, FineReportFormatter reportFormatter) {
        this.fineCalculator = fineCalculator;
        this.reportFormatter = reportFormatter;
    }
    public void processFine(int lateDays) {
        double fine = fineCalculator.calculateFine(lateDays);
        reportFormatter.printReport(fine);
    }
}
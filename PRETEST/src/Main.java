public class Main {

    public static void main(String[] args) {

        BookSearchService searchService = new BookSearchService();

        LoanService loanService = new LoanService();

        FineCalculator calculator = new StandardFineCalculator();

        FineReportFormatter formatter = new TextReportFormatter();

        LibraryManager libraryManager = new LibraryManager(calculator, formatter);

        searchService.searchBook("Pemrograman Java");

        loanService.borrowBook( "M Rizki Ruswan", "Pemrograman Java");

        libraryManager.processFine(3);
    }
}
public class MySQLDatabaseConnection implements DatabaseConnection {

    @Override
    public void saveKRS(String data) {
        System.out.println("Menyimpan KRS ke MySQL...");
        System.out.println(data);
    }
}
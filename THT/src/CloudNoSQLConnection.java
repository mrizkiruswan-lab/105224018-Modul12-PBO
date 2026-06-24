public class CloudNoSQLConnection implements DatabaseConnection {

    @Override
    public void saveKRS(String data) {
        System.out.println("Menyimpan KRS ke Cloud NoSQL...");
        System.out.println(data);
    }
}
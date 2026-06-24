public class krsRepository {

    private DatabaseConnection database;

    public krsRepository(DatabaseConnection database) {
        this.database = database;
    }

    public void simpan(String data) {
        database.saveKRS(data);
    }
}
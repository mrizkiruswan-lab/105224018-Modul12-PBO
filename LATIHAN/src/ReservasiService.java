public interface ReservasiService {
    void pesanTiket(String kodeKereta, String nik, String nama, int jumlahTiket)
     throws RuteTidakDitemukanException,
     TiketHabisException;
}
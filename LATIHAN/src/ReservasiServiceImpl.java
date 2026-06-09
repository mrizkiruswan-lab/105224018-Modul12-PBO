import java.util.ArrayList;
import java.util.List;

public class ReservasiServiceImpl
        implements ReservasiService {

    private List<Kereta> daftarKereta;

    public ReservasiServiceImpl() {

        daftarKereta = new ArrayList<>();

        daftarKereta.add(
                new Kereta(
                        "K01",
                        "Argo Bromo",
                        "JKT - SBY",
                        50));

        daftarKereta.add(
                new Kereta(
                        "K02",
                        "Parahyangan",
                        "JKT - BDG",
                        15));
    }

    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }

    @Override
    public void pesanTiket(
            String kodeKereta,
            String nik,
            String nama,
            int jumlahTiket)

            throws RuteTidakDitemukanException,
                   TiketHabisException {

        if (nik.length() != 16 ||
                !nik.matches("\\d+")) {

            throw new DataPenumpangTidakValidException(
                    "NIK harus 16 digit angka");
        }

        Kereta keretaDitemukan = null;

        for (Kereta k : daftarKereta) {

            if (k.getKode()
                    .equalsIgnoreCase(kodeKereta)) {

                keretaDitemukan = k;
                break;
            }
        }

        if (keretaDitemukan == null) {

            throw new RuteTidakDitemukanException(
                    "Kode kereta tidak ditemukan");
        }

        if (jumlahTiket >
                keretaDitemukan.getSisaKursi()) {

            throw new TiketHabisException(
                    keretaDitemukan.getNama(),
                    keretaDitemukan.getSisaKursi());
        }

        keretaDitemukan.kurangiKursi(jumlahTiket);

        System.out.println(
                "Pemesanan berhasil untuk "
                        + nama);
    }
}
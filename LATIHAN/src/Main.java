import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ReservasiServiceImpl reservasi =
                new ReservasiServiceImpl();

        int pilihan = 0;

        do {

            try {

                System.out.println("\n===== JAVA EXPRESS =====");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih : ");

                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    case 1:

                        for (Kereta k :
                                reservasi.getDaftarKereta()) {

                            System.out.println(
                                    k.getKode()
                                            + " | "
                                            + k.getNama()
                                            + " | "
                                            + k.getRute()
                                            + " | Kursi : "
                                            + k.getSisaKursi());
                        }

                        break;

                    case 2:

                        System.out.print(
                                "Kode Kereta : ");
                        String kode =
                                input.nextLine();

                        System.out.print(
                                "NIK : ");
                        String nik =
                                input.nextLine();

                        System.out.print(
                                "Nama : ");
                        String nama =
                                input.nextLine();

                        System.out.print(
                                "Jumlah Tiket : ");
                        int jumlah =
                                input.nextInt();
                        input.nextLine();

                        reservasi.pesanTiket(
                                kode,
                                nik,
                                nama,
                                jumlah);

                        break;

                    case 3:
                        System.out.println(
                                "Terima kasih.");
                        break;

                    default:
                        System.out.println(
                                "Menu tidak tersedia.");
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Input harus berupa angka!");

                input.nextLine();

            } catch (
                    DataPenumpangTidakValidException e) {

                System.out.println(
                        "Error : "
                                + e.getMessage());

            } catch (
                    RuteTidakDitemukanException e) {

                System.out.println(
                        "Error : "
                                + e.getMessage());

            } catch (
                    TiketHabisException e) {

                System.out.println(
                        "Error : "
                                + e.getMessage());

            } finally {

                System.out.println(
                        "=== Sistem Tetap Berjalan ===");
            }

        } while (pilihan != 3);

        input.close();
    }
}
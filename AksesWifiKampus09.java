import java.util.Scanner;
public class AksesWifiKampus09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisPenggunaWifi;
        int jumlahNilaiMahasiswa;

        System.out.println("====================================================");
        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        jenisPenggunaWifi = sc.next();

        if (jenisPenggunaWifi.equals("Dosen")) {
            System.out.print("Akses Wifi Diberikan (Dosen)");
            } 
            else if (jenisPenggunaWifi.equals("Mahasiswa")) {
                System.out.print("Masukkan jumlah SKS Anda: ");
                jumlahNilaiMahasiswa = sc.nextInt();

                if (jumlahNilaiMahasiswa >= 12) {
                    System.out.print("Akses Wifi Diberikan (Mahasiswa Aktif)");
                } 
                else {
                    System.out.print("Akses Ditolak, SKS Kurang Dari 12");
            }
        }
        else {
            System.out.print("Akses Ditolak");
        }
        sc.close();
        System.out.println("\n====================================================");
    }
}

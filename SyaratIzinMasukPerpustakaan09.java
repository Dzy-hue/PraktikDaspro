import java.util.Scanner;
public class SyaratIzinMasukPerpustakaan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================================================");
        System.out.print("Apakah membawa Kartu Registrasi? (true/false): ");
        boolean bawaKartuRegistrasi = sc.nextBoolean();
        System.out.print("Apakah Sudah Registrasi Online? (true/false): ");
        boolean sudahRegistrasiOnline = sc.nextBoolean();

        if (bawaKartuRegistrasi == true || sudahRegistrasiOnline == true ) {
            System.out.print("Mahasiswa Boleh Masuk Perpustakaan");
        } else {
            System.out.print("Mahasiswa Tidak Boleh Masuk Perpustakaan");
        }
        sc.close();
        System.out.println("\n====================================================");
    }
}
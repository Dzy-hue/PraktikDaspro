import java.util.Scanner;
public class ProgramCekBilanganGanjilGenap09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("--- Program Cek Bilangan Ganjil atau Genap ---");
        System.out.print("Masukkan sebuah bilangan: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        System.out.println("==============================================");
        sc.close();
    }
}
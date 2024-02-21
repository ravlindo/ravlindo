import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class rav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Disini menginput data diri
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'L') ? "Laki-laki" : "Perempuan";

        System.out.print("Tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirString = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Terus cara menghitung umur
        LocalDate hariIni = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, hariIni);
        int umurTahun = selisih.getYears();
        int umurBulan = selisih.getMonths();

        // Output data diri dan umur
        System.out.println("\nNama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umurTahun + " tahun " + umurBulan + " bulan ");

        scanner.close();
    }
}
import java.util.Scanner;

public class tugas1 {

    private static final String[] daftarSiswa = { "111", "222","333","444","555","666", };
    private static final String usernameAdmin = "admin";
    private static final String passwordAdmin = "adm1n";
    public static int Siswa = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            tampilkanMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    loginSiswa(sc);
                    break;
                case 2:
                    loginAdmin(sc);
                    break;
                case 3:
                    System.out.println("BYE BYE DADA");
                    loop = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada di menu !!!");
            }
        }
    }

    private static void tampilkanMenu() {
        System.out.println("===Sistem Perpustakaan===");
        System.out.println("1. Login Siswa");
        System.out.println("2. Login Admin");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    private static void loginSiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Anda: ");
        String nim = scanner.next();

        boolean ditemukan = false;
        for (int i = 0; i < daftarSiswa.length; i++) {
            if (daftarSiswa[i].equals(nim)) {
                Siswa = i;
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("NIM tidak ditemukan!");
        }
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
            System.out.println("Login berhasil");
            // Tampilkan menu untuk admin
        } else {
            System.out.println("Username atau password salah!!!!!");
        }
    }
}

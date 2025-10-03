import java.util.Scanner;

public class AkunBankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: ");
        int saldoAwal = scanner.nextInt();

        AkunBank akun = new AkunBank(saldoAwal);
        System.out.println("Saldo awal: " + akun.getSaldo());

        System.out.print("Masukkan jumlah yang ingin ditabung: ");
        int jumlahTabung = scanner.nextInt();
        akun.menabung(jumlahTabung);
        System.out.println("Saldo setelah menabung: " + akun.getSaldo());

        System.out.print("Masukkan jumlah yang ingin ditarik: ");
        int jumlahTarik = scanner.nextInt();
        akun.tarikTunai(jumlahTarik);
        System.out.println("Saldo setelah tarik tunai: " + akun.getSaldo());

        scanner.close();
    }
}
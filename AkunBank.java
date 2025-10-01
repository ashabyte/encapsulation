public class AkunBank {
    private int saldo;

    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void menabung(int jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("Berhasil menabung: " + jumlah);
        } else {
            System.out.println("Jumlah menabung harus lebih dari 0");
        }
    }

    public void tarikTunai(int jumlah) {
        if (jumlah > 0 && (this.saldo - jumlah) >= 10) {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik tunai: " + jumlah);
        } else {
            System.out.println("Gagal tarik tunai: saldo tidak mencukupi atau jumlah tidak valid");
        }
    }
}
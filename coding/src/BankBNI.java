public class BankBNI extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku bunga saat ini: 4%");
    }
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "Bank BNI";


        System.out.println("======== Transfer uang ke bank BNI ========");
        System.out.println("jumlah transfer: Rp" + jumlah);
        System.out.println("rekening tujuan: " + rekeningTujuan);
        System.out.println("Bank tujuan: " + bankTujuan);
        int biayaAdmin = 2500;
        System.out.println("Biaya admin: Rp" + biayaAdmin);
    }
}

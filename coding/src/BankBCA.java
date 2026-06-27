public class BankBCA extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku bunga saat ini: 4.5%");
    }
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "Bank BCA";


        System.out.println("======== Transfer uang ke bank BCA ========");
        System.out.println("jumlah transfer: Rp" + jumlah);
        System.out.println("rekening tujuan: " + rekeningTujuan);
        System.out.println("Bank tujuan: " + bankTujuan);
        int biayaAdmin = 6500;
        System.out.println("Biaya admin: Rp" + biayaAdmin);
    } 
}

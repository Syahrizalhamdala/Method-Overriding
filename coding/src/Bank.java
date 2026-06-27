public class Bank {
    public void transferUang(int jumlah, String rekeningTujuan) {
       System.out.println("Transfer Rp" + jumlah);
       System.out.println("Ke rekening: " + rekeningTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
       System.out.println("Transfer Rp" + jumlah);
       System.out.println("Ke rekening: " + rekeningTujuan);
       System.out.println("Di bank: " + bankTujuan);
    }
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
       System.out.println("Transfer Rp" + jumlah);
       System.out.println("Ke rekening: " + rekeningTujuan);
       System.out.println("Di bank: " + bankTujuan);
       System.out.println("Berita: " + berita);
    }
    public void sukuBunga(){
        System.out.println("Suku bunga saat ini: 3%");
    }

}
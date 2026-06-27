public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("======== Method override ========");
        bank.transferUang(10000,"1234567890");
        System.out.println();
        bank.transferUang(10000,"1234567890","Bank BCA");
        System.out.println();
        bank.transferUang(10000,"1234567890","Bank BCA","Pembayaran tagihan listrik");
        System.out.println();
        System.out.println("======== Method overloading ========");
        BankBNI bankBNI = new BankBNI();
        bankBNI.sukuBunga();
        bankBNI.transferUang(10000,"1234567890","Bank BNI");
        System.out.println();
        BankBCA bankBCA = new BankBCA();
        bankBCA.sukuBunga();
        bankBCA.transferUang(10000,"1234567890","Bank BCA");
        System.out.println();
    }
}

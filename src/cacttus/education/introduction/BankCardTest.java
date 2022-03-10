package cacttus.education.introduction;

public class BankCardTest {
    public static void main(String[] args) {
        BankCard elemedinBankCard = new BankCard();
        BankCard aliBankCard = new BankCard(1111222233334444l,
                1234l, "Ali Zekaj", (byte) 12,
                (short) 2027, (short) 123, "Visa", "TEB Bank"
        );

        elemedinBankCard.setAccountNumber(123123123123l);
        elemedinBankCard.setHolderName("Elmedin Fejzullahu");
        elemedinBankCard.deposit(-50);//nuk aplikohet
        elemedinBankCard.deposit(100); // a[;olpjhet
        elemedinBankCard.withdraw(200); //nuk keni llog
        elemedinBankCard.withdraw(20);// terhjke
        elemedinBankCard.print(); //

        System.out.printf("%s -> %d %n",elemedinBankCard.getHolderName(),
                elemedinBankCard.getAccountNumber());

        System.out.printf("%s -> %d %n",aliBankCard.getHolderName(),
                aliBankCard.getAccountNumber());




    }
}











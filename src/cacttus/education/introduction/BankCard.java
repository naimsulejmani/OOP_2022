package cacttus.education.introduction;

public class BankCard {
    //variablat instanfce, fields, data
    private long accountNumber; // 16 shifror
    private long cardNumber; //16 shifror
    private String holderName; //
    private byte validMonth;
    private short validYear;
    private short pin; //4shifror
    private short securityCode;
    private String cardType;
    private String bankName;
    private boolean isBlocked;
    private double balance;

    //constructoret
    //rregull emrin duhet me pas te njejte sikurse klasa
    public BankCard() {
        //default konstruktori
    }

    public BankCard(long accountNumber, long cardNumber, String holderName,
                    byte validMonth, short validYear, short securityCode,
                    String cardType, String bankName) {
        this.accountNumber = accountNumber; //this -> eshte instanca
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.validMonth = validMonth;
        this.validYear = validYear;
        this.securityCode = securityCode;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public BankCard(long accountNumber, long cardNumber, String holderName,
                    String bankName) {
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.bankName = bankName;
    }

    //vetit get dhe set - metodat get dhe set


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public byte getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(byte validMonth) {
        this.validMonth = validMonth;
    }

    public short getValidYear() {
        return validYear;
    }

    public void setValidYear(short validYear) {
        this.validYear = validYear;
    }

    public short getPin() {
        return pin;
    }

    public void setPin(short pin) {
        this.pin = pin;
    }

    public short getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(short securityCode) {
        this.securityCode = securityCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount > balance) {
                System.out.println("Nuk keni fonde te mjaftueshme!!!");
            } else {
                balance -= amount;
                System.out.println("Merrni paret!!!");
            }
        }
    }
    public double checkBalance() {
        return balance;
    }
    public void print() {
        System.out.printf("Ne llogarin tuaj %s keni gjithsej %.2f EUR%n",
                holderName, balance);
    }
}














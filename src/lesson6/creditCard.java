package lesson6;

public class creditCard {
    public String cardNumber;
    public double bankAccount;
    public void addMoneyToBankAccount(double money){
        if (money > 0){
            System.out.println("You have added: " + money);
            bankAccount += money;
            System.out.println("Your bank account balance is: " + bankAccount);
        } else {
            System.out.println("You can't add negative number or 0 to your bank account balance!");
            System.out.println("Your bank account balance is: " + bankAccount);
        }
    }

    public void getMoneyFromBankAccount(double money){
        if (bankAccount >= money){
            bankAccount -= money;
            System.out.println("You have withdrawn: " + money);
            System.out.println("Your bank account balance is: " + bankAccount);
        } else {
            System.out.println("You don't have enough money to withdraw: " + money);
            System.out.println("Your bank account balance is: " + bankAccount);
        }
    }
    public void getCardAccaunt(){
        System.out.println("\tBank account: " + cardNumber);
        System.out.println("\tBank account: " + bankAccount);
    }
}

package lesson6;

public class homework6 {
    public static void main(String[] args) {
        bankirs();
    }


        public static void bankirs() {
            creditCard first = new creditCard();


            first.cardNumber = "5631 1233";
            first.bankAccount = 5000;
            System.out.println("-".repeat(50));
            first.getCardAccaunt();
            System.out.println("-".repeat(50));
            first.addMoneyToBankAccount(128);


            creditCard second = new creditCard();



            second.cardNumber = "6887 2213";
            second.bankAccount = 1635;
            System.out.println("-".repeat(50));
            second.getCardAccaunt();
            System.out.println("-".repeat(50));
            second.addMoneyToBankAccount(1288);


            creditCard third = new creditCard();

            third.cardNumber = "7777 3215";
            third.bankAccount = 11_558;
            System.out.println("-".repeat(50));
            third.getCardAccaunt();
            third.getMoneyFromBankAccount(3445);

        }
    }




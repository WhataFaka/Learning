package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
}

class BankAccountTest {

    public static void main(String[] args) {


        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Nikita";
        MyAccount.balance=34342;

        YourAccount.id=2;
        YourAccount.name="Alya";
        YourAccount.balance=342;

        HisAccount.id=3;
        HisAccount.name="Valeriya";
        HisAccount.balance=55.44;

        System.out.println(HisAccount.balance);
    }

}




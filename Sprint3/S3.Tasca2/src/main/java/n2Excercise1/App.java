package n2Excercise1;

public class App {

    public static void main(String[] args) {
        Callback client1 = new Card();
        Callback client2 = new Paypal();
        Callback client3 = new BankAccount();

        Store store = new Store();

        store.charge(client1);
        store.charge(client2);
        store.charge(client3);

    }

}

package n2Excercise1;

public class Paypal implements Callback {

    @Override
    public void pay() {
        System.out.println("Payment made with paypal");
    }
}

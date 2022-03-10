package n2Excercise1;

public class Card implements Callback {

    @Override
    public void pay() {
        System.out.println("Payment made with card");
    }
}

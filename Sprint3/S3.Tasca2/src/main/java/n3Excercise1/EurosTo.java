package n3Excercise1;

public class EurosTo implements Converter{

    private double correctionDollar;
    private double correctionPound;

    public EurosTo() {
        correctionDollar = 1.1;
        correctionPound = 0.84;
    }

    @Override
    public void convert(Product product) {
        System.out.println("The price in dollars is " + Math.round((correctionDollar * product.getPrice())*100.0)/100.0 );
        System.out.println("The price in pounds is " + Math.round((correctionPound * product.getPrice())*100.0)/100.0 );
    }
}

package n3Excercise1;

public class App {

    public static void main(String[] args) {

        Converter converterTo = new EurosTo();
        Product p1 = new Product("Coca Cola", 1.5);
        Product p2 = new Product("Leche Pascual", 1.2);

        Store store = new Store();
        store.setConverter(converterTo);
        store.addProduct(p1);
        store.addProduct(p2);

        store.showProducts();

    }
}

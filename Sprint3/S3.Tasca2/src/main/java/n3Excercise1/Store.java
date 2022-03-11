package n3Excercise1;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList;
    private Converter converter;

    public Store() {
        productList = new ArrayList<>();

    }

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void showProducts(){

        productList.forEach((x) -> {
            System.out.println("Name: " + x.getName());
            System.out.println("Price: " + x.getPrice() + "€");
            converter.convert(x);
            System.out.println("");
        });
    }
}

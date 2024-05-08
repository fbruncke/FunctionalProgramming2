import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",18000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",9000f));

        List<Float> expensiveLaptops = productsList.stream()
                .filter(product->product.price()>20000)
                //.map(Product::price)
                .map(x->x.price())
                .collect(Collectors.toList());
        System.out.println(expensiveLaptops);
    }


}

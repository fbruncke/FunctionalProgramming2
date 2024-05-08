import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream2 {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
//long count =
        List<Product> productsList2 =  productsList.stream()
                .filter(product->product.price()<30000)
                .collect(Collectors.toList());
                //.count();
                        //.forEach(x-> System.out.println(x.name()));
        //System.out.println(count);
        System.out.println(productsList2.toString());
    }

}

/*
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}*/

//dont do this
record Product(int id, String name, float price){}
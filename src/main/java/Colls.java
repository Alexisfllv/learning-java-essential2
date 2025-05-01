import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colls {
    public static void main(String[] args) {


        List<Product> lproductos = new ArrayList<>();
        lproductos.add(new Product(1, "Ap1"));
        lproductos.add(new Product(2, "Ap2"));
        lproductos.add(new Product(3, "Ap3"));

        // Collections.sort(lproductos);
        // Collections.reverse(lproductos);
        // Collections.shuffle(lproductos);

        // System.out.println(lproductos);

        // listado java 6
//        for (int i = 0; i < lproductos.size() ; i++) {
//            System.out.println(lproductos.get(i));
//        }

        // java 7+
//        for (Product p : lproductos) {
//            System.out.println(p);
//        }

        // java 8
        lproductos.forEach(product -> System.out.println(product));


    }
}

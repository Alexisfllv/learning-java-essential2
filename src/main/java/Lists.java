import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // listas iteradas nomales

        List<Product> arrayProducts =  new ArrayList<>();
        Product ap1 = new Product(1, "Ap1");
        Product ap2 = new Product(2, "Ap2");

        arrayProducts.add(ap1);
        arrayProducts.add(ap2);
        System.out.println(arrayProducts);

        // listas iteradas con prioridad de orden
        List<Product> linkedProducts = Arrays.asList(ap1, ap2);

        //System.out.println(linkedProducts);
    }
}

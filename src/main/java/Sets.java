import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Product> setsProducts = new HashSet<>();

        setsProducts.add(new Product(1, "Ap1"));
        setsProducts.add(new Product(2, "Ap2"));
        setsProducts.add(new Product(1, "Ap1"));
        // no permite duplicados

        // System.out.println( setsProducts);


        SortedSet<Product> tree = new TreeSet<>();
        tree.add(new Product(1, "Ap1"));
        tree.add(new Product(2, "Ap2"));
        tree.add(new Product(3, "Ap3"));

        System.out.println(tree);

        // elimina duplicados , ordena segun criterio , no puede tener null


    }
}

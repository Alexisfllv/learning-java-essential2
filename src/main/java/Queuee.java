import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {

        Deque<Product> stack = new ArrayDeque<>();

        Product ap1 = new Product(1, "Ap1");
        Product ap2 = new Product(2, "Ap2");
        Product ap3 = new Product(3, "Ap3");

        stack.push(ap1);
        stack.push(ap2);
        stack.push(ap3);

        System.out.println("Pila actual: " + stack);

        Product top = stack.pop();
        System.out.println("Elemento retirado: " + top);

        System.out.println("Pila final: " + stack);

    }
}

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Comparable<Product>{

    //
    private Integer id;
    private String nombre;

    @Override
    public int compareTo(Product other) {
        // Ordenar por id
        return Integer.compare(this.id, other.id);
    }
}

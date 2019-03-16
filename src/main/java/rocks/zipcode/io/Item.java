package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {

    public static Object getId;
    private String name;
    private Long id;
    private Double price;


    public Item() {
        this.name = "";
        this.id = 0L;
        this.price = 0.01;

    }

    public Item(Long id, String name, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

package Esercizio8;

public class Product {
    private final String name;
    //attributi
    private Long id;
    private String category;
    private Double price;

    //constructor

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }


    // getter and setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

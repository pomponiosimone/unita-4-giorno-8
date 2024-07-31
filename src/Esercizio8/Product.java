package Esercizio8;

public class Product {
    //attributi
    private String name;
    private long id;
    private String category;
    private double price;

    //constructor

    public Product(long id, String name, String category, double price) {
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

    public void setId(long id) {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void Sconto(double percentuale) {
        this.price = this.price * (1 - percentuale / 100);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}


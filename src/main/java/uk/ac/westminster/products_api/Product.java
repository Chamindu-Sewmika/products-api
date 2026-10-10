package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

//    public String getName() {
//        return name;
//    }


//    Because the name field is private, removing getName() left Spring with no way to access the data, causing it to silently omit the property without throwing an error.

    public double getPrice() {
        return price;
    }
}

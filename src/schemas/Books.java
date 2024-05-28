package schemas;

public class Books {
    private Integer id;
    private String name, description, author;
    private Double price;
    public Books(Integer id, String name, String description, String author, Double price) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.price = price;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getAuthor() {
        return author;
    }
    public Double getPrice() {
        return price;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    

    
}

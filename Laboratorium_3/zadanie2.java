class Author{
    private String name,email;
    private char gender;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public char getGender() {return gender;}

    public void setGender(char gender) {this.gender = gender;}

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[" + "name=" + getName() +
                ",email=" + getEmail() +
                ",gender=" + getGender() +
                "]";
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Author getAuthor() {return author;}

    public void setAuthor(Author author) {this.author = author;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public int getQty() {return qty;}

    public void setQty(int qty) {this.qty = qty;}

    public Book(String name, double price, Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, double price, Author author, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" + "name=" + getName() +
                ",author=" + author.toString() +
                ",price=" + getPrice() +
                ",qty=" + getQty() +
                ']';
    }
}

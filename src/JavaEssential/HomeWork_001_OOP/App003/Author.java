package JavaEssential.HomeWork_001_OOP.App003;

public class Author {
    private String author = "Author";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void show(){
        System.out.println(this.author);
    }
}

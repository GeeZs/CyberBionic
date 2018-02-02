package JavaEssential.OOP.App003;

public class Title {
    private String title = "Title";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show(){
        System.out.println(this.title);
    }
}

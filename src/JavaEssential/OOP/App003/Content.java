package JavaEssential.OOP.App003;

public class Content {
    private String content = "Content";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    void show(){
        System.out.println(this.content);
    }
}

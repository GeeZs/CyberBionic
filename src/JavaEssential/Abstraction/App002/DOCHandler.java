package JavaEssential.Abstraction.App002;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC document opened.");
    }

    @Override
    void create() {
        System.out.println("DOC document created.");
    }

    @Override
    void change() {
        System.out.println("DOC document changed.");
    }

    @Override
    void save() {
        System.out.println("DOC document saved.");
    }
}

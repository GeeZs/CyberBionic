package JavaEssential.Abstraction.App002;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT document opened.");
    }

    @Override
    void create() {
        System.out.println("TXT document created.");
    }

    @Override
    void change() {
        System.out.println("TXT document changed.");
    }

    @Override
    void save() {
        System.out.println("TXT document saved.");
    }
}

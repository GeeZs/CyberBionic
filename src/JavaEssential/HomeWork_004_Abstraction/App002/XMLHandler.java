package JavaEssential.HomeWork_004_Abstraction.App002;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("XML document opened.");
    }

    @Override
    void create() {
        System.out.println("XML document created.");
    }

    @Override
    void change() {
        System.out.println("XML document changed.");
    }

    @Override
    void save() {
        System.out.println("XML document saved.");
    }
}

package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.Additional;

public class LaserPrinter extends Printer{
    void print(String value){
        System.out.println(ANSI_YELLOW + value);
    }
    public static void main(String[] args) {
        Printer mainPrinter = new LaserPrinter();
        mainPrinter.print("Yellow String!");
        Printer printer = new Printer();
        printer.print("Purple String!");

    }
}

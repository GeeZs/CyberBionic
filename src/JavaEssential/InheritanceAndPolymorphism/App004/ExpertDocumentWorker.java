package JavaEssential.InheritanceAndPolymorphism.App004;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument() {
        System.out.println("Документ сохранён в новом формате.");
    }
}

package JavaEssential.HomeWork_003_InheritanceAndPolymorphism.App004;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument() {
        System.out.println("Документ сохранён в новом формате.");
    }
}

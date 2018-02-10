package JavaEssential.InheritanceAndPolymorphism.App004;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован.");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохренен в старом формате, сохранение в остальных форматах доступно в версии Эксперт.");
    }
}

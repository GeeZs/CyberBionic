package JavaEssential.InheritanceAndPolymorphism.App004;

import java.util.Scanner;

public class Main {
    static String getKeyNumber(){
        System.out.println("Please, type key number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void main(String[] args) {

        final String KEY_NUMBER = getKeyNumber();
        switch (KEY_NUMBER){
            case "":
                System.out.println("Welcome freeUser!");
                DocumentWorker documentWorker = new DocumentWorker();
                break;
            case "pro" :
                System.out.println("Welcome proUser!");
                DocumentWorker proDocumentWorker = new ProDocumentWorker();
                break;
            case "expert" :
                System.out.println("Welcome expertUser!");
                DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                break;
            default:
                System.out.println("No such KEY.");
        }
    }
}

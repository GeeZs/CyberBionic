package JavaEssential.HomeWork_004_Abstraction.App002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type document type:");
        Scanner scanner = new Scanner(System.in);
        String instance = scanner.nextLine();
        switch (instance){
            case "XML" :
                AbstractHandler xmlInstance = new XMLHandler();
                xmlInstance.change();
                xmlInstance.create();
                xmlInstance.open();
                xmlInstance.save();
                break;
            case "TXT" :
                AbstractHandler txtInstance = new TXTHandler();
                txtInstance.save();
                txtInstance.open();
                txtInstance.create();
                txtInstance.change();
                break;
            case "DOC" :
                AbstractHandler docInstatnce = new DOCHandler();
                docInstatnce.create();
                docInstatnce.open();
                docInstatnce.save();
                docInstatnce.change();
                break;
            default:
                System.out.println("There is no such a document type.");
        }
    }
}

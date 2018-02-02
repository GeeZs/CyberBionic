package JavaStarter.Conditions;

import java.util.Scanner;

public class Additional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word in Russian :");
        String userWord = scanner.next();
        switch (userWord){
            case "понедельник" :
                System.out.println(" : Monday");
                break;
           case "вторник" :
                System.out.println(" : Tuesday");
                break;
           case "среда" :
                System.out.println(" : Wednesday");
                break;
           case "четверг" :
                System.out.println(" : Thursday");
                break;
           case "пятница" :
                System.out.println(" : Friday");
                break;
           case "суббота" :
                System.out.println(" : Saturday");
                break;
           case "воскресенье" :
                System.out.println(" : Sunday");
                break;
           case "лето" :
                System.out.println(" : Summer");
                break;
            case "зима" :
                System.out.println(" : Winter");
                break;
            case "весна" :
                System.out.println(" : Spring");
                break;
            default:
                System.out.println("There is no such a word");

        }
    }
}
